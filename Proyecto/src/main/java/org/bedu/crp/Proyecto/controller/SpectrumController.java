package org.bedu.crp.Proyecto.controller;

import org.bedu.crp.Proyecto.model.Spectrum;
import org.bedu.crp.Proyecto.repository.ISpectrumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SpectrumController {
    private ISpectrumRepository repository;
    @Autowired
    public SpectrumController(ISpectrumRepository repository){
        this.repository=repository;
    }
    @GetMapping("/getSpectrum")
    public List<Spectrum> getSpectrum(){
        return  repository.findAll();
    }
}
