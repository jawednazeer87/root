
	package org.student.three.mirza.rest.controller;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.stream.Collectors;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestParam;
	import org.springframework.web.bind.annotation.RestController;
	import org.student.three.mirza.modal.Train;
	import org.student.three.mirzaa.service.TrainService;


	@RestController                           // restctorller annotation indicate as rest class 
	@RequestMapping("/train")
	public class TrainRestController {

		@Autowired
		private  TrainService trainService;
		
		List<Train> trainList = new ArrayList<>();
		
		@DeleteMapping("train/delete-by-id/{id}")
		public void deleteById(@PathVariable long id) {
			trainService.deleteById(id); 
		}
		
		@PutMapping("/update-city-name-by-rout_name/{routName}")
		public Train updateByRoutName(@PathVariable String routName, @RequestParam String cityName) {
			return trainService.updateByRoutName(routName, cityName);
		}
		
		@GetMapping("/find_by_city_name/{cityName}")
		public List<Train> findByCityName(@PathVariable String cityName) {
			return trainService.findByCityName(cityName);
		}
		
		@GetMapping("/find-by-first-name")
		List<Train> findByTrainNum(@RequestParam long trainNum) {
			return trainService.findByTrainNum(trainNum);
		}
		
		@PostMapping("train/add")
		public Train add(@RequestBody Train train) {
			System.out.println(train);
		trainList.add(train);
			return train;
		}
		
		@PostMapping("train/create")
		public Train create(@RequestBody Train train) {
			return trainService.create(train);
		}
		 
		@GetMapping("/get/all")               
		public List<Train> getAll() {
			return trainService.getAll();
		}
		
		@GetMapping("train/get")
		public List<Train> get() {
			return trainList;
		}
		
		@GetMapping("train/get/{id}")
		public Train findId(@PathVariable int id) {
			List<Train> collect = trainList.stream().filter(train -> train.getId()==id).collect(Collectors.toList());
			return collect.get(0);
		}
	}




