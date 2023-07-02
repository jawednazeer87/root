package org.student.three.mirzaa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.student.three.mirza.modal.Train;
import org.student.three.mirza.repository.TrainRepository;

@Service
public class TrainService {
	
@Autowired
private TrainRepository trainRepository;

public List <Train> getAll(){
	return trainRepository.findAll();

}

public Train create (Train train) {
	return trainRepository.save(train);
}

public List<Train> findByCityName(String cityName) {
	return trainRepository.findByCityName(cityName);
}

public Train updateByRoutName(String routName ,String cityName) {
	Train train = trainRepository.findByRoutName(routName);
 if (train !=null) {
	 train.setCityName(cityName);
	 train= trainRepository.save(train);
	 
 }
 return train;
 
}
public void deleteById(long id) {
	Train train = trainRepository.getReferenceById(id);
	if (train != null) {
		trainRepository.delete(train);
	}
}

public List<Train> findByTrainNum(long trainNum){
	
	
	return trainRepository.findByTrainNum(trainNum);
}

}
