package org.la.ecom.portal.teacher.document.controller;

import java.io.IOException;

import org.la.ecom.document.api.dto.DocumentsDTO;
import org.la.ecom.portal.teacher.client.service.ApiServicePortalTeacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/document")
public class DocumentController {

	@Autowired
	private ApiServicePortalTeacher apiService;
	
	
	@GetMapping("/upload")
	public ModelAndView uploadGet() {
		
		ModelAndView mav = new ModelAndView("upload_document");
		
		return mav;
	}
	
	@PostMapping("/upload")
	public ModelAndView uploadPost(@RequestParam("file") MultipartFile file, @ModelAttribute DocumentsDTO documentsDTO) {
		
		try {
			documentsDTO.setContents(file.getBytes());
			documentsDTO.setName(file.getName());
			documentsDTO.setSize(file.getSize());
			documentsDTO.setType(file.getContentType());
			documentsDTO = apiService.documentClient().postForObject("/upload", documentsDTO, DocumentsDTO.class);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		ModelAndView mav = new ModelAndView("upload_document");
		mav.addObject("documentsDTO", documentsDTO);
		return mav;
	}
	
	@GetMapping("/download")
	public @ResponseBody DocumentsDTO test() {
		
		DocumentsDTO documentsDTO = apiService.documentClient().getForObject("/downloads/id/5fc4d5157ee547068c381760", DocumentsDTO.class);
		return documentsDTO;
	}
}
