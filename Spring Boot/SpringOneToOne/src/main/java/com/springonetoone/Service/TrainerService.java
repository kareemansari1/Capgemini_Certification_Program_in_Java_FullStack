package com.springonetoone.Service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springonetoone.Entity.Trainer;
import com.springonetoone.Repository.TrainerRepository;

@Service
public class TrainerService 
{

	@Autowired
	private TrainerRepository tr;

	public List<Trainer> getTrainer() {
		
		return tr.findAll();
	}

	public Trainer saveTrainer(@Valid Trainer t) {
		
		return tr.save(t);
	}

	public void deleteTrainer(int id) {
		Trainer t = tr.getById(id);
		tr.delete(t);
		
	}

	public Trainer updateTrainer(@Valid Trainer t1, int id) {
		t1.setTrainerId(id);
		return tr.save(t1);
		
	}
	
}
