package tn.esps.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esps.entities.Archive;

@Repository
public interface IArchiveRepo extends JpaRepository<Archive, Long>{

}
