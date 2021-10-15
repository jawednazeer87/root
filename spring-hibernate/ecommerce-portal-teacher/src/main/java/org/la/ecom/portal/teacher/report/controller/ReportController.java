package org.la.ecom.portal.teacher.report.controller;

import java.net.URISyntaxException;
import java.util.Date;

import org.la.ecom.mysql.api.dto.UserDTO;
import org.la.ecom.portal.teacher.client.service.ApiServicePortalTeacher;
import org.la.ecom.report.api.dto.ReportDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestClientException;

@Controller
@RequestMapping("/report")
public class ReportController {

	@Autowired
	private ApiServicePortalTeacher apiService;
	
	@GetMapping("/test")
	public @ResponseBody ReportDTO test() {
		
		ReportDTO reportDTO = new ReportDTO();
		reportDTO.setMimeType("pdf");
		reportDTO.setName("test");
		reportDTO.setSize("100");
		
		UserDTO userDTO = new UserDTO();
		userDTO.setFirstName("asif");
		userDTO.setLastName("alam");
		userDTO.setDob(new Date());
		userDTO.setEmail("asif@mail.com");
		userDTO.setContactNum("0143111547");
		try {
			reportDTO = apiService.reportClient().postForObject("/user/detail", userDTO, ReportDTO.class);
		} catch (RestClientException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return reportDTO;
	}
}
