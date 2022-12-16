package org.bedu.crp.jpa.config;

import org.bedu.crp.jpa.repository.IPokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.bedu.crp.jpa.entity.Pokemon;
@Component
public class Seeder implements CommandLineRunner {
    private IPokemonRepository pokemonRepository;
    @Autowired
    public Seeder(IPokemonRepository pokemonRepository){
        this.pokemonRepository=pokemonRepository;
    }

    @Override
    public void run(String[] args){

    Pokemon existing = pokemonRepository.findOneByNumber(25);
    if (existing == null) {
        Pokemon p1 = new Pokemon();
        p1.setName("Pikachu");
        p1.setNumber(25);

        pokemonRepository.save(p1);
    }
    }
}
