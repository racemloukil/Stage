package tn.esps.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esps.entities.Administrateur;

@Repository
public interface IAdminRepo extends JpaRepository<Administrateur, Long> {

}
