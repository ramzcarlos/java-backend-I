package org.bedu.crp.jpa.repository;

import org.bedu.crp.jpa.entity.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPokemonRepository extends JpaRepository<Pokemon, Long> {
    Pokemon findOneByNumber(int number);
}
