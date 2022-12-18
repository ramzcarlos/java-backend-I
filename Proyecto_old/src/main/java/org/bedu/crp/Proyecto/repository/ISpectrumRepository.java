package org.bedu.crp.Proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.bedu.crp.Proyecto.model.Spectrum;

@Repository
public interface ISpectrumRepository extends JpaRepository<Spectrum, Long> {

    //Spectrum findOneBySpectrum(String file_spectrum);

}
