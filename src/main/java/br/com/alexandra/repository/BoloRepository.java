package br.com.alexandra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alexandra.domain.Bolo;

public interface BoloRepository extends JpaRepository<Bolo, Long> {

}
