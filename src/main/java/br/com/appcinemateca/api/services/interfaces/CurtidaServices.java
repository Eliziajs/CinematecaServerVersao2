package br.com.appcinemateca.api.services.interfaces;


import br.com.appcinemateca.api.domain.Curtida;
import br.com.appcinemateca.api.dto.CurtidaDTO;

import java.util.List;
import java.util.stream.Stream;

public interface CurtidaServices {

    Curtida findById(Long id);

    List<Curtida> findAll();

    Curtida create(CurtidaDTO obj);

    Curtida update(CurtidaDTO obj);

    void delete(Long id);
    Long qtd();
   Long quantidade(Long id);
    //List<Curtida> findByQuantidadeAndFilme_id(Long quantidade, Long filme_id);
    //List<Curtida>buscarPorQuantidade(Long quantidade);
    //List<Curtida> filmesCurtidos(Long id);
    //List<Curtida> quantidadePorFilme(Long filme_id, Long user_id);
    //Stream<Curtida> quantidade (String titulo);

}
