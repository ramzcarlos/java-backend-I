package org.bedu.crp.Proyecto.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "spectrum4")
public class Spectrum {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="Descripcion", nullable = false, length = 100)
    private String name;
    @Column(name="Canal", nullable = false, length = 3)
    private String channel;
    @Column(name="path", nullable = false, length = 100)
    private String fileSprectrum;
    @Column(name="year", nullable = false, length = 4)
    private int year;
    @Column(name="mount", nullable = false, length = 2)
    private int mount;
    @Column(name="day", nullable = false, length = 2)
    private int day;
    @Column(name="Country", nullable = false, length = 20)
    private String country;
    @Column(name="Town", nullable = false, length = 20)
    private String town;



}
