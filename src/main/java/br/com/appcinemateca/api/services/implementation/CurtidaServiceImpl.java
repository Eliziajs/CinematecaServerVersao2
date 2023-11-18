package br.com.appcinemateca.api.services.implementation;

import br.com.appcinemateca.api.domain.Curtida;
import br.com.appcinemateca.api.dto.CurtidaDTO;
import br.com.appcinemateca.api.repositories.CurtidaRepository;
import br.com.appcinemateca.api.repositories.FilmeRepository;
import br.com.appcinemateca.api.services.exceptions.ObjectNotFoundException;
import br.com.appcinemateca.api.services.interfaces.CurtidaServices;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;


@Service
public class CurtidaServiceImpl implements CurtidaServices {

    @Autowired
    private CurtidaRepository repository;
    @Autowired
    private ModelMapper mapper;
    @Override
    public Curtida findById(Long id) {
        Optional<Curtida> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
    @Override
    public List<Curtida> findAll() {

        return repository.findAll();
    }

	@Override
    public Curtida create(CurtidaDTO obj) {

       return repository.save(mapper.map(obj, Curtida.class));
    }

    @Override
    public Curtida update(CurtidaDTO obj) {

       return repository.save(mapper.map(obj, Curtida.class));
    }

    @Override
    public void delete(Long id) {
        findById(id);
        repository.deleteById(id);
    }
    public Long qtd(){

        return repository.qtd();
    }

    public Long quantidade(Long id) {
        Long res = repository.quantidades(id);
        System.out.println(res);
        return res;
       // return repository.quantidades(id);

    }


    /**public Stream<Curtida> quantidade(String titulo){
        return repository.quantidade(titulo);
    }**/



    /**@Override
    public List<Curtida> filmesCurtidos(Long id){
        return repository.findByFilme_idAndUser_id(id);
    }**/

   /** @Override
    public List<Curtida> quantidadePorFilme(Long filme_id, Long user_id) {
        return repository.quantidadePorFilmes(filme_id,user_id);
    }**/
    /**public List<Curtida> findByQuantidadeAndFilme_id(Long quantidade, Long filme_id){
       return repository.findByQuantidadeAndFilme_id(quantidade, filme_id);
    }
    public List<Curtida>buscarPorQuantidade(Long quantidade){
        return buscarPorQuantidade(quantidade);
    }**/

    /** private void findByEmail(CadastroDTO obj) {
        Optional<Cadastro> cadastro = repository.findByEmail(obj.getEmail());
        if(cadastro.isPresent() && !cadastro.get().getId().equals(obj.getId())) {
            throw new DataIntegratyViolationException("E-mail já cadastrado no sistema");
        }**/

}


