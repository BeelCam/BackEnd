package com.Porfolio.BelenCamargo.Service;

import com.Porfolio.BelenCamargo.Entity.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Porfolio.BelenCamargo.Interface.IPersonaService;
import com.Porfolio.BelenCamargo.Repository.IPersonaRepository;

@Service

public class ImpPersonaServicio implements IPersonaService{
    @Autowired IPersonaRepository ipersonaRepositorio;
    
    @Override
    public List<Persona> getPersona() {
        List<Persona>persona = ipersonaRepositorio.findAll(); 
        return persona;

    }

    @Override
    public void savePersona(Persona persona) {
        ipersonaRepositorio.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
     ipersonaRepositorio.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = ipersonaRepositorio.findById(id).orElse(null);
        return persona;
    }
    
}
