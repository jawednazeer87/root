package org.la.ecom.notification.rest.controller;

import java.net.URISyntaxException;
import java.util.List;

import javax.mail.MessagingException;

import org.dozer.DozerBeanMapper;
import org.la.ecom.mysql.api.dto.MailFormatEmailListDTO;
import org.la.ecom.mysql.api.dto.UserDTO;
import org.la.ecom.notification.api.dto.MailAttachmentDTO;
import org.la.ecom.notification.api.dto.MailDTO;
import org.la.ecom.notification.client.service.ApiServiceNotification;
import org.la.ecom.notification.dto.Mail;
import org.la.ecom.notification.service.EmailService;
import org.la.ecom.report.api.dto.ReportDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;

import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class NotificationsRestController {

	@Autowired
    private EmailService emailService;
	
	@Autowired
	private DozerBeanMapper mapper;
	
	@Autowired
	private ApiServiceNotification apiServiceNotification;
	
	@RequestMapping(value = "/registrationDetails", method = RequestMethod.POST)
	public Boolean registrationDetails(@RequestBody MailDTO mailDto) {

		ObjectMapper objectMapper = new ObjectMapper();
		Mail mail = objectMapper.convertValue(mailDto, Mail.class);
		
		try {
			emailService.sendSimpleMessage(mail);
		} 
        catch (MessagingException e) {
			e.printStackTrace();
		}
		return true;
	}
	
	@PostMapping("/sendMail")
	public Boolean sendMail(@RequestBody MailFormatEmailListDTO mailFormatEmailListDTO) throws RestClientException, URISyntaxException {
		
		MailDTO mailDto = mapper.map(mailFormatEmailListDTO.getMailFormatDTO(), MailDTO.class);
		List<UserDTO> userList = mailFormatEmailListDTO.getUserList();
		
		for(UserDTO userDto : userList) {
			
			ReportDTO reportDTO = get(userDto);
			
			MailAttachmentDTO mailAttachment = new MailAttachmentDTO(reportDTO.getContent(), reportDTO.getMimeType(), reportDTO.getName());
			mailDto.setTo(userDto.getEmail());
			mailDto.setMailAttachment(mailAttachment);
			registrationDetails(mailDto);
		}
		
		return true;
	}
	
	public ReportDTO get(UserDTO userDTO) throws RestClientException, URISyntaxException {
		return apiServiceNotification.reportClient().postForObject("/user/detail", userDTO, ReportDTO.class);
	}
}