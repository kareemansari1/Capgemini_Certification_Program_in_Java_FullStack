package com.springonetoone.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springonetoone.Entity.Student;
import com.springonetoone.Entity.Trainer;
import com.springonetoone.Repository.TrainerRepository;
import com.springonetoone.Service.TrainerService;

@RestController
public class TrainerController 
{
	@Autowired
	public TrainerService ts;
	
	@Autowired
	public TrainerRepository tr;
	
	@GetMapping("/trainer")
	List<Trainer> getTrainers()
	{
		return this.ts.getTrainer();
	}
	
	@PostMapping("/trainer")
	public Trainer addTrainer(@Valid @RequestBody Trainer t) {
		return this.ts.saveTrainer(t);
	}
	
	@DeleteMapping("/trainer/{id}")
	public void deleteTrainer(@PathVariable int id)
	{
		ts.deleteTrainer(id);
	}
	
	@PutMapping("/trainer/update/{id}")
	public Student  updateTrainer(@Valid @RequestBody Trainer t1,@PathVariable int id) {
		return this.updateTrainer(t1, id);
	}
	@GetMapping("/trainername/{name}")
	public List<Trainer> searchTrainerByName(@PathVariable String name){
		return this.tr.getTrainerByName(name);
	}
}
