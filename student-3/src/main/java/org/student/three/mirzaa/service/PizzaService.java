package org.student.three.mirzaa.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.student.three.mirza.modal.Pizza;
import org.student.three.mirza.repository.PizzaRepository;


@Service
public class PizzaService {
	
  @Autowired
  PizzaRepository   pizzaRepository;
  public List <Pizza> getAll(){
 return pizzaRepository.findAll();
  }
  	  
   public Pizza create(Pizza pizza) {
  return pizzaRepository.save(pizza);
   }
   
   public Pizza findByType (String type) {
  return  pizzaRepository.findByType (type);
	}
	
	public Pizza updateByType(String type, String name) {
		Pizza pizza =  pizzaRepository.findByType(type);
		if (pizza != null) {
			pizza.setName(name);
            pizza = pizzaRepository.save(pizza);
		}
	return pizza;
	}
	public void deleteById(long id) {
	Pizza pizza = pizzaRepository.getReferenceById(id);
	if (pizza != null) {
    pizzaRepository.delete(pizza);
			}
		}
  public List<Pizza> findByName(String name){
		
  return pizzaRepository.findByName(name);
  

  }

public List<Pizza> findByCreatedDate(Date createdDate) {
	
	return pizzaRepository.findByCreatedDate(createdDate);
}
}
