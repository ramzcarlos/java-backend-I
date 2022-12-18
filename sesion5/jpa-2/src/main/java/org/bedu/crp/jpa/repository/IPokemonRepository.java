package org.bedu.crp.jpa.repository;

import org.bedu.crp.jpa.entity.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IPokemonRepository extends JpaRepository<Pokemon, Long> {

    //JPQL
    //@Query(value = "SELECT * FROM Pokemoness WHRE number = :number", nativeQuery = true)
    Pokemon findOneByNumber(int number);
}
