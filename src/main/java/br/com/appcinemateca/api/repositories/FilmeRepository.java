package br.com.appcinemateca.api.repositories;

import br.com.appcinemateca.api.domain.Filme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FilmeRepository extends JpaRepository<Filme, Long> {

}
