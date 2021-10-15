package org.la.ecom.report.rest.controller;

import org.dozer.DozerBeanMapper;
import org.la.ecom.mysql.api.dto.UserDTO;
import org.la.ecom.report.api.dto.ReportDTO;
import org.la.ecom.report.model.Report;
import org.la.ecom.report.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.sf.jasperreports.engine.JRException;

@RestController
@RequestMapping("/user")
public class ReportUserRestController {

	@Autowired
	private ReportService reportService;
	
	@Autowired
	private DozerBeanMapper mapper;
	
	@PostMapping("/detail")
	public ReportDTO getUserDetailReport(@RequestBody UserDTO userDTO) throws JRException {
		
		Report userDetailReport = reportService.getUserDetailReport(userDTO);
		
		ReportDTO reportDTO = new ReportDTO();
		
		if(userDetailReport!=null) {
			reportDTO = mapper.map(userDetailReport, ReportDTO.class);
		}
		
		return reportDTO;
	}
	
	@GetMapping("/test")
	public UserDTO get() {
		UserDTO u = new UserDTO();
		u.setDob(new java.util.Date());
		return u;
	}
}
