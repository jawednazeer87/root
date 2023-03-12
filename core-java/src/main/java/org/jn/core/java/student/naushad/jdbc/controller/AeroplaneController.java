package org.jn.core.java.student.naushad.jdbc.controller;

import java.util.List;

import org.jn.core.java.student.naushad.jdbc.model.Aeroplane;
import org.jn.core.java.student.naushad.jdbc.model.dto.AeroplaneDto;
import org.jn.core.java.student.naushad.jdbc.service.AeroplaneService;
import org.jn.core.java.student.naushad.jdbc.util.AeroplaneUtil;

public class AeroplaneController {
	AeroplaneService aeroplaneService = new AeroplaneService();

	public static void main(String[] args) {
		AeroplaneController aeroplaneController = new AeroplaneController();
		aeroplaneController.create();
//		aeroplaneController.update();
//		aeroplaneController.delete();
//		aeroplaneController.readById();
//		aeroplaneController.readAll();
//		aeroplaneController.readByCompany_name();
	}

	public void create() {
		Aeroplane aeroplane = new Aeroplane();
		aeroplane.setId(3);
		aeroplane.setName("SINGAPORE");
		aeroplane.setCapacity(60);
		aeroplane.setCompany_name("SPICE JET");
		aeroplane.setModel_name("SPJETS1");

		AeroplaneDto aeroplaneDto = AeroplaneUtil.toDtoAuto(aeroplane);
		aeroplaneService.create(aeroplaneDto);

	}

	public void update() {
		Aeroplane aeroplane = new Aeroplane();
		aeroplane.setId(1);
		aeroplane.setName("VISTARA");
		aeroplane.setCapacity(60);
		aeroplane.setCompany_name("SPICE JET");
		aeroplane.setModel_name("SPJETS1");

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
		String company_name = "SPICE";
		List<AeroplaneDto> aeroplaneDto = aeroplaneService.readByCompany_name(company_name);
		System.out.println(aeroplaneDto);
	}

	public void readAll() {
		List<AeroplaneDto> aeroplaneDto = aeroplaneService.readAll();
		System.out.println(aeroplaneDto);

	}

}
