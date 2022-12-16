package org.bedu.crp.jpa.config;

import org.bedu.crp.jpa.model.Person;
import org.bedu.crp.jpa.repository.IPersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Seeder implements CommandLineRunner {
    private IPersonRepository repository;
    public  Seeder(IPersonRepository repository){
        this.repository=repository;
    }
    @Override
    public void run(String[] args){
        Person p1 =new Person();
        p1.setId(100);
        p1.setName("Carlos");
        p1.setLastname("Ramirez pina");
        p1.setAge(38);

        Person p2 =new Person();
        p2.setId(101);
        p2.setName("Sonia");
        p2.setLastname("Valdez Mejia");
        p2.setAge(28);

        Person p3 =new Person();
        p3.setId(101);
        p3.setName("Teresa Michelle");
        p3.setLastname("Ramirez Valdez");
        p3.setAge(28);
        repository.save(p1);
        repository.save(p2);

    }
}
