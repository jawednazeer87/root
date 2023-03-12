package org.jn.core.java.student.naushad.jdbc.controller;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

import org.jn.core.java.student.naushad.jdbc.model.AeroplaneRouteDomestic;
import org.jn.core.java.student.naushad.jdbc.model.dto.AeroplaneRouteDomesticDto;
import org.jn.core.java.student.naushad.jdbc.service.AeroplaneRouteDomesticService;
import org.jn.core.java.student.naushad.jdbc.util.AeroplaneRouteDomesticUtil;

public class AeroplaneRouteDomesticController {
	AeroplaneRouteDomesticService aeroplaneRouteDomesticService = new AeroplaneRouteDomesticService();

	public static void main(String[] args) {
		AeroplaneRouteDomesticController aeroplaneRouteDomesticController = new AeroplaneRouteDomesticController();
//		aeroplaneRouteDomesticController.create();
//		aeroplaneRouteDomesticController.update();
//		aeroplaneRouteDomesticController.delete();
//		aeroplaneRouteDomesticController.readById();
//		aeroplaneRouteDomesticController.readAll();
		aeroplaneRouteDomesticController.readByRouteName();

	}

	public void create() {
		AeroplaneRouteDomestic aeroplaneRouteDomestic = new AeroplaneRouteDomestic();
		aeroplaneRouteDomestic.setId(1);
		aeroplaneRouteDomestic.setRoute_name("GKP");
//Date
		LocalDate localDate = LocalDate.of(2023, 03, 11);
		Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());

		aeroplaneRouteDomestic.setDeparture_date(date);
//Date	
		date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());

		aeroplaneRouteDomestic.setArrival_date(date);

		aeroplaneRouteDomestic.setDeparture_city("MUMBAI");
		aeroplaneRouteDomestic.setDeparture_state("MAHARASHTRA");
		aeroplaneRouteDomestic.setArrival_city("DELHI");
		aeroplaneRouteDomestic.setArrival_state("DELHI");
		aeroplaneRouteDomestic.setCountry("INDIA");

		AeroplaneRouteDomesticDto aeroplaneRouteDomesticDto = AeroplaneRouteDomesticUtil
				.toDtoAuto(aeroplaneRouteDomestic);
		aeroplaneRouteDomesticService.create(aeroplaneRouteDomesticDto);
	}

	public void update() {
		AeroplaneRouteDomestic aeroplaneRouteDomestic = new AeroplaneRouteDomestic();
		aeroplaneRouteDomestic.setId(1);
		aeroplaneRouteDomestic.setRoute_name("GKP");
//Date
		LocalDate localDate = LocalDate.of(2023, 03, 11);
		Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());

		aeroplaneRouteDomestic.setDeparture_date(date);
//Date	
		date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());

		aeroplaneRouteDomestic.setArrival_date(date);

		aeroplaneRouteDomestic.setDeparture_city("BOMBAY");
		aeroplaneRouteDomestic.setDeparture_state("MAHARASHTRA");
		aeroplaneRouteDomestic.setArrival_city("DELHI");
		aeroplaneRouteDomestic.setArrival_state("DELHI");
		aeroplaneRouteDomestic.setCountry("INDIA");

		AeroplaneRouteDomesticDto aeroplaneRouteDomesticDto = AeroplaneRouteDomesticUtil
				.toDtoAuto(aeroplaneRouteDomestic);
		aeroplaneRouteDomesticService.update(aeroplaneRouteDomesticDto);

	}

	public void delete() {
		int id = 1;
		aeroplaneRouteDomesticService.delete(id);
	}

	public void readById() {
		int id = 1;
		AeroplaneRouteDomesticDto aeroplaneRouteDomesticDto = aeroplaneRouteDomesticService.readById(id);
		System.out.println(aeroplaneRouteDomesticDto);
	}

	public void readAll() {
		List<AeroplaneRouteDomesticDto> aeroplaneRouteDomesticDtos = aeroplaneRouteDomesticService.readAll();
		System.out.println(aeroplaneRouteDomesticDtos);
	}

	public void readByRouteName() {
		String route_name = "GKP";
		List<AeroplaneRouteDomesticDto> aeroplaneRouteDomesticDtos = aeroplaneRouteDomesticService
				.readByRouteName(route_name);

		System.out.println(aeroplaneRouteDomesticDtos);

	}
}
