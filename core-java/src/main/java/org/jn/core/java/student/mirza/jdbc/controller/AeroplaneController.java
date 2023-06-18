package org.jn.core.java.student.mirza.jdbc.controller;



		import java.util.List;

		import org.jn.core.java.student.mirza.jdbc.model.Aeroplane;
		import org.jn.core.java.student.mirza.jdbc.dto.AeroplaneDto;
		import org.jn.core.java.student.mirza.jdbc.service.AeroplaneService;
		import org.jn.core.java.mirza.jdbc.util.AeroplaneUtil;
		

	public class AeroplaneController {
			AeroplaneService aeroplaneService = new AeroplaneService();

			public static void main(String[] args) {
				AeroplaneController aeroplaneController = new AeroplaneController();
				aeroplaneController.create();
//				aeroplaneController.update();
//				aeroplaneController.delete();
//				aeroplaneController.readById();
//				aeroplaneController.readAll();
//				aeroplaneController.readByCompany_name();
			}

			public void create() {
				Aeroplane aeroplane = new Aeroplane();
				aeroplane.setId(3);
				aeroplane.setName("DOHA");
				aeroplane.setCapacity(100);
				aeroplane.setCompanyName("QATAR AIRWAYS");
				aeroplane.setModelName("Q21");

				AeroplaneDto aeroplaneDto = AeroplaneUtil.toDtoAuto(aeroplane);
				aeroplaneService.create(aeroplaneDto);

			}

			public void update() {
				Aeroplane aeroplane = new Aeroplane();
				aeroplane.setId(1);
				aeroplane.setName("fly high");
				aeroplane.setCapacity(60);
				aeroplane.setCompanyName("kingfisher");
				aeroplane.setModelName("kingh007");

				AeroplaneDto aeroplaneDto = AeroplaneUtil.toDtoAuto(aeroplane);
				aeroplaneService.update(aeroplaneDto);
			}

			public void delete() {
				int id = 2;
				aeroplaneService.delete(id);
			}

			public void readById() {
				int id = 1;
				AeroplaneDto aeroplaneDto = aeroplaneService.readById(id);
				System.out.println(aeroplaneDto);
			}

			public void readByCompany_name() {
				String companyName = "QATAR ARIWAYS";
				List<AeroplaneDto> aeroplaneDto = aeroplaneService.readByCompanyName(companyName);
				System.out.println(aeroplaneDto);
			}

			public void readAll() {
				List<AeroplaneDto> aeroplaneDto = aeroplaneService.readAll();
				System.out.println(aeroplaneDto);

			}

		

	}


