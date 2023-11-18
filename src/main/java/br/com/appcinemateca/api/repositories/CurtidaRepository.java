package br.com.appcinemateca.api.repositories;

import br.com.appcinemateca.api.domain.Curtida;
import br.com.appcinemateca.api.domain.Filme;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;


@Repository
public interface CurtidaRepository extends JpaRepository<Curtida, Long> {

    @Query("SELECT count(*) from Curtida")
    Long qtd ();
    @Query(value = "SELECT count(*) FROM Curtida where filme_id=?1",
            nativeQuery = true)
    Long quantidades (Long id);

    //@Query("SELECT FROM Curtida where Filme.titulo= :titulo")
    //@Query("From count(*) Curtida where id= :quantidade")

        //@Query("SELECT count(*) from Curtida");
   //@Transactional
  /** @Query("From Curtida where filme.titulo= :titulo")
    Stream<Curtida> quantidade (String titulo);**/
    // List<Curtida> findByQuantidade(Long quantidade);
    //List<Curtida> findByQuantidadeAndFilme_id(Long quantidade, Long filme_id);

    //List<Curtida>findByFilme_idAndUser_id(Long id);'
    //@Query("from Curtida t where t.filme_id =:user_id")// verificar sintaxe de não nullo
    // List<Curtida>quantidadePorFilmes(Long filme_id, Long user_id);//ver sem parametro

}
