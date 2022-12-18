package org.bedu.crp.jpa.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "wild_pokemon")
public class WildPokemon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "level", nullable = false)
    private int level;

    @ManyToOne
    @JoinColumn(name="pokemon_id", referencedColumnName = "id", nullable = false)
    private Pokemon pokemon;

    @ManyToOne
    @JoinColumn(name="trainer_id", referencedColumnName = "id")
    private Trainer trainer;



    public  Trainer getTrainer(){
        return trainer;
    }

    public  void setTrainer(Trainer trainer){
        this.trainer=trainer;
    }
    public Pokemon getPokemon(){
        return  pokemon;
    }

    public void setPokemon(Pokemon pokemon){
        this.pokemon=pokemon;
    }

    //@Column(name="nombre", nullable = false, length = 30)
    //private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
