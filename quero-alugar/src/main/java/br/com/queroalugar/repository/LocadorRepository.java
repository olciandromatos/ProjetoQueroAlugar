package br.com.queroalugar.repository;

import br.com.queroalugar.domain.Locador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocadorRepository extends JpaRepository<Locador, Long> {
}
