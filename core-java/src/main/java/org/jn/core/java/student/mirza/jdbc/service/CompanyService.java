package org.jn.core.java.student.mirza.jdbc.service;

import java.util.List;

	import org.jn.core.java.student.mirza.jdbc.dto.CompanyDto;
	//import org.jn.core.java.student.mirza.jdbc.model.Client;
	import org.jn.core.java.student.mirza.jdbc.repository.CompanyRepository;


	public class CompanyService {

		

		
			static CompanyRepository companyRepository = new CompanyRepository();

			public void create(CompanyDto companyDto) {
				companyRepository.create(companyDto);
			}

			public void update(CompanyDto companyDto) {
				companyRepository.update(companyDto);
			}

			public void delete(int CompanyId) {
				companyRepository.delete(CompanyId);
			}

			//public CompanyDto readByPrimaryContactAttendiId(int PrimaryContactAttendiId) {
			//	return companyRepository.findByPrimaryContactAttendiId(PrimaryContactAttendiId);
			//}

			public List<CompanyDto> readAll() {
				return companyRepository.readAll();
			}

			public List<CompanyDto> readByName(String  Name) {
				return companyRepository.findByName(Name);
			}

			public static CompanyDto readByCompanyId(int CompanyId) {
				// TODO Auto-generated method stub
				return companyRepository.findByCompanyId(CompanyId);
			}
		}



