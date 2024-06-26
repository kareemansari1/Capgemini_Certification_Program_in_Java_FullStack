package com.springonetoone.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springonetoone.Entity.Trainer;

public interface TrainerRepository extends JpaRepository<Trainer, Integer> 
{
	//@Query("FROM Trainer WHERE trainerName = :name")
	//@Query(value="SELECT * from trainer t  WHERE t.trainer_name = ?1",nativeQuery = true )
	@Query(value="SELECT * from trainer t  WHERE t.trainer_name =:name",nativeQuery = true )
	List<Trainer> getTrainerByName (String name);
}
