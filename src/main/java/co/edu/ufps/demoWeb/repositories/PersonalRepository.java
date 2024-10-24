package co.edu.ufps.demoWeb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.ufps.demoWeb.entities.Personal;

@Repository
public interface PersonalRepository extends JpaRepository<Personal, Integer> {

}
