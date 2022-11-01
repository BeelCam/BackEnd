package com.Porfolio.BelenCamargo.Repository;

import com.Porfolio.BelenCamargo.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long> {

}
