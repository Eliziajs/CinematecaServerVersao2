package br.com.appcinemateca;

import br.com.appcinemateca.api.repositories.CurtidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ApiApplication implements CommandLineRunner{

    @Autowired
    private CurtidaRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }

   public void run(String... args) throws Exception {
    	/**Person u1 = new Person(null, "Valdir", "valdir@mail.com", "123");
        Person u2 = new Person(null, "Luiz", "luiz@mail.com", "123");
        Person u3 = new Person(null, "Luiza", "luiza@mail.com", "123");
        repository.saveAll(List.of(u1,u2,u3));**/

        //list =repository.quantidades(1);
       //System.out.println(list);


    }
}