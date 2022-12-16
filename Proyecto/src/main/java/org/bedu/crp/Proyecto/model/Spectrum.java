package org.bedu.crp.Proyecto.model;


import jakarta.persistence.*;

@Entity
@Table(name="spectrum")
public class Spectrum {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="Descripcion", nullable = false, length = 100)
    private String name;
    @Column(name="Canal", nullable = false, length = 3)
    private String channel;
    @Column(name="path", nullable = false, length = 100)
    private String file_sprectrum;
    @Column(name="date", nullable = false, length = 10)
    private String fecha;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getFile_sprectrum() {
        return file_sprectrum;
    }

    public void setFile_sprectrum(String file_sprectrum) {
        this.file_sprectrum = file_sprectrum;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
