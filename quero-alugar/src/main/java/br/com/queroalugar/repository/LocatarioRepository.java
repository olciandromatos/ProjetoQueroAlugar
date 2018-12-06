package br.com.queroalugar.repository;

import br.com.queroalugar.domain.Locatario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocatarioRepository extends JpaRepository<Locatario, Long> {
}
