package org.jn.adv.student.moshin.jdbc.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.jn.adv.student.moshin.jdbc.dto.PresentationDTO;
import org.jn.adv.student.moshin.jdbc.model.Presentation;
import org.jn.adv.student.moshin.jdbc.service.PresentationService;
import org.jn.adv.student.moshin.jdbc.util.GSONGenericUtil;

public class PresentationController {

			static PresentationService presentationService = new PresentationService();
			public static void main(String[] args) {
				create();
//				PresentationDTO dto = GSONGenericUtil.map(getAll().get(5), PresentationDTO.class);
//				System.out.println(dto);
//				getAll().stream().forEach(System.out::println);
//				getByDobRange().stream().forEach(System.out::println);
			}
			
			static void create() {
				Presentation presentation = new Presentation();
				presentation.setPresentation_id(100);
				presentation.setBooked_company_id(85278);
				presentation.setBooked_room_id(748);
				LocalDate localDate = LocalDate.of(2001, 07, 21);
				presentation.setStart_time(localDate);
				presentation.setEnd_time(localDate);
				presentationService.create(presentation);
				presentationService.connectionClose();
			}
			
			static List<PresentationDTO> getAll() {
				List<Presentation> presentationList = presentationService.getAll();
				presentationService.connectionClose();
				final List<PresentationDTO> dtoList = new ArrayList<>();
				presentationList.stream().forEach(presentation-> {
					PresentationDTO dto = GSONGenericUtil.map(presentation, PresentationDTO.class);
					dtoList.add(dto);
				});
				return dtoList;
			}
			
			static List<PresentationDTO> getByDobRange() {
				List<Presentation> presentationList = presentationService.getByDobRange(LocalDate.of(1979, 01, 10), 
																			LocalDate.of(2021, 01, 10));
				presentationService.connectionClose();
				List<PresentationDTO> dtoList = GSONGenericUtil.mapList(presentationList, PresentationDTO.class);
				return dtoList;
			}

	
}
