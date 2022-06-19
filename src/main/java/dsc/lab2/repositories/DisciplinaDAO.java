package dsc.lab2.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dsc.lab2.entities.Disciplina;

@Repository
public interface DisciplinaDAO extends JpaRepository<Disciplina, Long> {
	List<Disciplina> findByOrderByCurtidasDesc();
	List<Disciplina> findByOrderByNotaDesc();
}