package org.la.ecom.portal.teacher.controller;

import java.io.IOException;
import java.net.URLConnection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.la.ecom.mysql.api.dto.AuthenticationRequestDTO;
import org.la.ecom.mysql.api.dto.AuthenticationResponseDTO;
import org.la.ecom.mysql.api.dto.UserDTO;
import org.la.ecom.portal.teacher.rest.template.WebRestTemplate;
import org.la.ecom.report.api.dto.ReportDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class PortalController {

	WebRestTemplate webRestTemplate = new WebRestTemplate();
	
	Logger log = LoggerFactory.getLogger(PortalController.class);
	
	
	@GetMapping("/regisdfasdftration")
	public ModelAndView view(@ModelAttribute UserDTO userDto) {
		ModelAndView mav = new ModelAndView("register");
		return mav;
	}
	
	@PostMapping("/reagiaaastration")
	public ModelAndView registerUser(@ModelAttribute UserDTO userDto) {

		//values of these are not set in view, so we set them in controller
		userDto.setActive(true);
		userDto.setStatus(1);
		
		ModelAndView mav = new ModelAndView("register");
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = formatter.parse(userDto.getDobString());
			userDto.setDob(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		String url = "http://localhost:9090/secure/registration";
		
		userDto = webRestTemplate.postForObject(url, userDto, UserDTO.class);
		
		mav.addObject("userDto", userDto);

		return mav;
	}
	
	@GetMapping("/authenticatffe")
	public ModelAndView toLoginPage(@ModelAttribute AuthenticationRequestDTO userDto) {
		ModelAndView mav = new ModelAndView("login");
		
		return mav;
	}
	
	@PostMapping("/aaauthenticate")
	public ModelAndView loginUser(@ModelAttribute AuthenticationRequestDTO req) {
		ModelAndView mav = new ModelAndView("login");
		
		mav.addObject("req", req);
		
		String url = "http://localhost:9090/secure/authenticate";
		
		AuthenticationResponseDTO res = webRestTemplate.postForObject(url, req, AuthenticationResponseDTO.class);
		
		log.info("res: " + res);
		
		return mav;
	}
	
	
	@GetMapping("/uploaddd")
	public ModelAndView viewUploadPage() {
		ModelAndView mav = new ModelAndView("upload");
		return mav;
	}
	
	//upload
	@PostMapping("/ssupload")
	public String uploadFiles(@RequestParam("docs") MultipartFile file, RedirectAttributes redirectAttributes, ModelMap modelMap) throws IOException {
		
		//MultipartFile is an object that has our file and its metadata details
		
		//service.uploadFile(file);		//this method is used to upload the file
		long size = file.getSize();
		String name = file.getOriginalFilename();
		String type = file.getContentType();
		byte[] content = file.getBytes();
		String mimeType = URLConnection.guessContentTypeFromName(file.getOriginalFilename());
		ReportDTO reportDTO = new ReportDTO();
		reportDTO.setSize(String.valueOf(size));
		reportDTO.setName(name);
		reportDTO.setType(type);
		reportDTO.setContent(content);
		reportDTO.setMimeType(mimeType);
		
		modelMap.addAttribute("file", file);
		redirectAttributes.addFlashAttribute("message", "file successfully uploaded" + file.getOriginalFilename());
		
		return "upload";
	}
}
