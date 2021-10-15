package org.la.ecom.report.service;

import org.la.ecom.mysql.api.dto.UserDTO;
import org.la.ecom.report.dao.ReportDao;
import org.la.ecom.report.model.Report;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;

@Service
public class ReportService {

	@Autowired
	private ReportDao reportDao;

	public Report getUserDetailReport(UserDTO userDTO) throws JRException {

		JasperPrint print = reportDao.getUserDetailReport(userDTO);

		byte[] content = null;

		Report report = null;

		if (print != null) {
			
			content = JasperExportManager.exportReportToPdf(print);
			report = new Report("pdf", content, "user_"+userDTO.getEmail(), "application/pdf", String.valueOf(content.length)); 
		}
		
		return report;
	}
}
