package org.jn.adv.student.majeed.jdbc.controller;

import org.jn.adv.student.majeed.jdbc.model.Presentation;
import org.jn.adv.student.majeed.jdbc.service.PresentationService;

import java.util.List;
import java.sql.Timestamp;  

/**
* @author AbdulMajeed
*
*/

public class PresentationController {
	
	static PresentationService presentationService = new PresentationService();
	
	public static void main(String[] args) {
		//create();
		//getAll();
		//findById();
		deleteById();
		//update();
	}
	
	static void create() {
		
		Presentation presentation = new Presentation();
		presentation.setPresentationId(5001);
		presentation.setBookedCompanyId(6001);
		presentation.setBookedRoomId(7001);
        
        Timestamp startTime = Timestamp.valueOf("2022-01-01 08:00:00.0");
        Timestamp endTime = Timestamp.valueOf("2022-01-01 11:30:00.0");
		
		presentation.setStartTime(startTime);	
		presentation.setEndTime(endTime);
		
		presentationService.create(presentation);
		presentationService.connectionClose();
	}
	
	static List<Presentation> getAll()
	{
		List<Presentation> presentationList = presentationService.getAll();
		System.out.println(presentationList);
		presentationService.connectionClose();
		return presentationList;
	}	
	
	static void findById() {
		Presentation presentation = new Presentation();
		presentation= presentationService.findById(101);
		System.out.println(presentation);
		presentationService.connectionClose();
	}	
	
	static void deleteById() {
		
		System.out.println(presentationService.deleteById(5001));
		presentationService.connectionClose();
	}
		
	static void update() {
		Presentation presentation = new Presentation();
		presentation.setPresentationId(1001);
		presentation.setBookedCompanyId(5001);
		presentation.setBookedRoomId(9001);
		
        Timestamp startTime = Timestamp.valueOf("2022-01-01 18:00:00.0");
        Timestamp endTime = Timestamp.valueOf("2022-01-01 20:00:00.0");
		
		presentation.setStartTime(startTime);	
		presentation.setEndTime(endTime);
		
		presentationService.update(presentation);
		presentationService.connectionClose();
	}	
}
