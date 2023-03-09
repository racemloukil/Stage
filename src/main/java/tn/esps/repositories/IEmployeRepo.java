package tn.esps.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esps.entities.Employe;

@Repository
public interface IEmployeRepo extends JpaRepository<Employe, Long> {
	
	//public Employe findEmployeById(Long id ); 

}
