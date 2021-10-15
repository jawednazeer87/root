package org.la.ecom.scheduler.notification;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.la.ecom.mysql.api.dto.AuthenticationRequestDTO;
import org.la.ecom.mysql.api.dto.AuthenticationResponseDTO;
import org.la.ecom.mysql.api.dto.MailFormatEmailListDTO;
import org.la.ecom.mysql.api.dto.UserDTO;
import org.la.ecom.scheduler.client.service.ApiServiceScheduler;
import org.la.ecom.scheduler.template.interceptor.RestTemplateInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;

@Component
public class SendMailToRegisterUserOnce {

	@Value("${scheduler.id}")
	private String email;
	
	@Value("${scheduler.password}")
	private String password;
	
	@Autowired
	private RestTemplateInterceptor restTemplateInterceptor;
	
	@Autowired
	private ApiServiceScheduler apiServiceScheduler;
	
	private final Logger log = LoggerFactory.getLogger(SendMailToRegisterUserOnce.class);
			
	@Scheduled(cron = "*/15 * * * * *")	//every 15 secondss
	public void cronJobSch() {
		
		log.info("------------------------Java cron job expression::::::::::::::::::::::::::::: ");
		
		AuthenticationRequestDTO authenticationRequestDTO = new AuthenticationRequestDTO(email, password);
		
		try {
			AuthenticationResponseDTO authenticationResponseDTO = 
					apiServiceScheduler.securityClient().postForObject("/authenticate", authenticationRequestDTO, AuthenticationResponseDTO.class);
			
			log.info("Object: "+authenticationResponseDTO);
			
			if(authenticationResponseDTO!=null) {
				
				String authorizationHeader = "Bearer "+authenticationResponseDTO.getJwt();
				
				restTemplateInterceptor.setAuthorizationHeader(authorizationHeader);
				
				MailFormatEmailListDTO mailFormatEmailListDTO = apiServiceScheduler.mysqlClient().getForObject("/user/allMailsToSend/1", MailFormatEmailListDTO.class);
				
				if(mailFormatEmailListDTO!=null) {
					
					Boolean isMailSend = apiServiceScheduler.notificationClient().postForObject("/sendMail", mailFormatEmailListDTO, Boolean.class);
					System.out.println("isMailSend: "+isMailSend);
					
					if(isMailSend) {
						List<UserDTO> userList = mailFormatEmailListDTO.getUserList();
						
						List<String> mailList = new ArrayList<>();
						
						userList.stream().forEach(user -> mailList.add(user.getEmail()));
						apiServiceScheduler.mysqlClient().put("/user/updateMailSentStatusSent", mailList);
					}
				}
				
			}
		} 
		catch (RestClientException e) {
			e.printStackTrace();
		} 
		catch (URISyntaxException e) {
			e.printStackTrace();
		}
	}
	
}
