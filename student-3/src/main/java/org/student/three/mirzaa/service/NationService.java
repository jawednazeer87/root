
	
	package org.student.three.mirzaa.service;

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	import org.student.three.mirza.modal.Nation;
	import org.student.three.mirza.repository.NationRepository;
//import org.student.three.mirza.rest.controller.NationRestController;


	@Service
	public class NationService {
		
		@Autowired
		private NationRepository nationRepository;
		
		public List<Nation> getAll() {
			return nationRepository.findAll(); //
		}
		
		public Nation create(Nation nation) {
			return nationRepository.save(nation);
		}
		

		
		public Nation findByCode (long code) {
			return  nationRepository.findByCode (code);
		}

	   public Nation updateByCode(long code, String name) {
			Nation nation =  nationRepository.findByCode(code);
			if (nation != null) {
				nation.setName(name);
				nation = nationRepository.save(nation);
			}
			return nation;
		}
		
		public void deleteById(long id) {
			Nation nation = nationRepository.getReferenceById(id);
			if (nation != null) {
				nationRepository.delete(nation);
			}
		}

		public List<Nation> findByContinentName(String continentName){
			
			
			return nationRepository.findByContinentName(continentName);
		}

	
			
		

		  public List<Nation> findByName(String name) {
			
			return  nationRepository.findByName(name);
		}

		public Nation updateByContinentName(String name, String continentName) {
			// TODO Auto-generated method stub
			return null;
		}


		}





