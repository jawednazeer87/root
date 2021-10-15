package org.la.ecom.msql.service;

import java.util.List;
import java.util.Optional;

import org.la.ecom.msql.model.MailFormat;
import org.la.ecom.msql.repository.MailFormatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MailFormatService {

	@Autowired
	private MailFormatRepository mailFormatRepository;
	
	public MailFormat findByMailTypeId(int mailTypeId) {

		List<MailFormat> mailFormatOptional = mailFormatRepository.findByMailTypeId(mailTypeId);
		
		if(mailFormatOptional!=null && !mailFormatOptional.isEmpty()) {
			return mailFormatOptional.get(0);
		}
		
		return null;
	}
	
}