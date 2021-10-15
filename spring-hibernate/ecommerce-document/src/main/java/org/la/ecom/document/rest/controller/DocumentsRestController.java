package org.la.ecom.document.rest.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.dozer.DozerBeanMapper;
import org.la.ecom.document.api.dto.DocumentsDTO;
import org.la.ecom.document.client.service.ApiServiceDocument;
import org.la.ecom.document.model.Documents;
import org.la.ecom.document.repository.DocumentsRepository;
import org.la.ecom.notification.api.dto.MailDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class DocumentsRestController {

	@Autowired
	private DocumentsRepository documentsRepository;
	
	@Autowired
	private ApiServiceDocument apiService;
	
	@Autowired
	private DozerBeanMapper mapper;
	
	@GetMapping(value = "/download/id/{id}")
	//@PreAuthorize("hasRole('ROLE_ADMIN')")
	//@PreAuthorize("hasRole('ROLE_USER')")
	public Optional<Documents> download(HttpServletRequest request, @PathVariable("id") String id) {
		
		MailDTO mail = new MailDTO("springboot87@gmail.com", "asifaftab87@gmail.com", "service to service", null, "testing from mongo service"); 
		String arr = null;
		try {
			arr = apiService.mysqlClient().getForObject("/hello", String.class);
			//Boolean b = apiService.notificationClient().postForObject("/registrationDetails", mail, Boolean.class);
			System.out.println("arr: "+arr);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return documentsRepository.findById(id);
	}
	
	@GetMapping(value = "/downloads/id/{id}")
	public DocumentsDTO download(@PathVariable("id") String id) {

		Optional<Documents> optionalDoc = documentsRepository.findById(id);
		if(optionalDoc.isPresent()) {
			DocumentsDTO documentsDto = mapper.map(optionalDoc.get(), DocumentsDTO.class);
			return documentsDto;
		}
		return null;
	}
	
	@PostMapping(value = "/upload")
    public DocumentsDTO addNewApplication(@RequestBody DocumentsDTO documentsDto){
		
		Documents documents = mapper.map(documentsDto, Documents.class);
		documents = documentsRepository.save(documents);
		
        return mapper.map(documents, DocumentsDTO.class);
    }
	
	@GetMapping(value = "/findAll")
	public List<Documents> findAll(){
		return documentsRepository.findAll();
	}
	
	@DeleteMapping(value = "/delete")
	public void delete(@RequestBody Documents documents) {
		documentsRepository.delete(documents);
	}
	
}
