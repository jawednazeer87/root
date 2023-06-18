package org.jn.core.java.student.mirza.jdbc.controller;


	import java.util.List;

	import org.jn.core.java.student.mirza.jdbc.model.Company;
	import org.jn.core.java.student.mirza.jdbc.dto.CompanyDto;
	import org.jn.core.java.student.mirza.jdbc.service.CompanyService;

	
import org.jn.core.java.mirza.jdbc.util.CompanyUtil;

	public class CompanyController {
		
	CompanyService companyService = new CompanyService();

			public static void main(String[] args) {
				ClientController clientController = new ClientController();
				clientController.create();
//				clientController.update();
//				clientController.delete();
//				 clientController.readById();
//				clientController.readAll();
//				clientController.readByCompany_name();
			}

			public void create() {
				Company company = new Company();
				company.setCompanyId(105);
				company.setName("Amdocs");
				company.setDescription("amdocs is service base multinational software company and ruuning the services across the glob");
				company.setPrimaryContactAttendeeId(110084);
				

				CompanyDto companyDto = CompanyUtil.toDtoAuto(company);
				companyService.create(companyDto);

			}

			public void update() {
				Company company = new Company();
				company.setCompanyId(108);
				company.setName("axel");
				company.setDescription("axel is service provider company in insurance sector ");
				company.setPrimaryContactAttendeeId(411047);
				

				;

				CompanyDto companyDto = CompanyUtil.toDtoAuto(company);
				companyService.update(companyDto);
			}

			public void delete() {
				int companyId = 411048;
				companyService.delete(companyId);
			}

			public void readByCompanyId() {
				int companyId = 102;
				CompanyDto companyDto = CompanyService.readByCompanyId(companyId);
				System.out.println(companyDto);
			}

			public void readByName() {
				String Name = "amdocs";
				List<CompanyDto> companyDto = companyService.readByName(Name);
				System.out.println(companyDto);
			}

			public void readAll() {
				List<CompanyDto> companyDto = companyService.readAll();
				System.out.println(companyDto);

			}

		

	}


