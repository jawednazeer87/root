package org.student.three.mirzaa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.student.three.mirza.modal.MonitorWide;
import org.student.three.mirza.repository.MonitorWideRepository;

@Service
public class MonitorWideService {

	
	@Autowired
	MonitorWideRepository   monitorWideRepository ;
	
	public List <MonitorWide> getAll(){
		return monitorWideRepository.findAll();
	}
	
	public MonitorWide create (MonitorWide monitorWide) {
		
		return monitorWideRepository.save(monitorWide);
	}
	
		public MonitorWide findByModelNo ( String modelNo) {
			return monitorWideRepository.findByModelNo(modelNo);
		}
	    
		public MonitorWide updateByModelNo (String modelNo, String orgName) {
			MonitorWide monitorWide =monitorWideRepository.findByModelNo(modelNo);
			
			if (monitorWide!= null) {
				monitorWide.setOrgName(orgName);
				
				monitorWide= monitorWideRepository.save(monitorWide);
			}
			
			return monitorWide;
		}
		public void deleteById (long id ) {
			MonitorWide monitorWide =monitorWideRepository.getReferenceById(id);
			
			if (monitorWide!=null) {
				monitorWideRepository.delete(monitorWide);
			}
			
		}
			public List<MonitorWide> findByOrgName (String orgName) {
				return monitorWideRepository.findByOrgName(orgName);
			}
		}
	

