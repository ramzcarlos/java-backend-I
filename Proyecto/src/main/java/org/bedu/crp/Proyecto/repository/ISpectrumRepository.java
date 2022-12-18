package org.bedu.crp.Proyecto.repository;


import org.bedu.crp.Proyecto.model.Spectrum;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

@Repository

public interface ISpectrumRepository extends JpaRepositoryImplementation<Spectrum, Long> {

}
