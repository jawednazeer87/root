//package org.student.three.mirza.rest.controller;
//
//
//import java.util.HashMap;
//import java.util.Map;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//
//@RestController
//@RequestMapping ("/example")
//
//public class ExampleOfRestController {
//	
//	Map<String, String > map = new HashMap<>();
//	@GetMapping("/add")
//	public Map<String , String> add (@RequestParam String key, @RequestParam String value){
//		map.put(key, value);
//		
//		return map;
//	}
//		
//		@GetMapping("/get")
//		public Map<String , String > get(){
//			
//			return map;
//			
//		}
//		
//	
//
//	
////	@GetMapping ("/byname")
//	public String findByNmame (){
//		return "mirza";
//		}
//		@GetMapping("/user")
//	public Map<String, String> exampleMap(){
//			Map<String ,String> map = new HashMap<>();
//			
//		map.put("name", "john");
//		map.put("id", "10021");
//
//		map.put("designation", "manager");
//		map.put("email id", "john@gmail.com");
//
//		
//			
//			return map;
//	}
//		
//		
//		
//		// http://localhost:9090/std3/example/byname
//	}
//	
//
