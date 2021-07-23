package com.iofullstack.mgmt.services;

import com.iofullstack.mgmt.entities.Persona;
import com.iofullstack.mgmt.repositories.BaseRepository;
import com.iofullstack.mgmt.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona, Long> implements PersonaService {
    @Autowired
    private PersonaRepository personaRepository;
    
    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public List<Persona> search(String filtro) throws Exception {
        try {
            // List<Persona> personas = personaRepository.findByNombreContainingOrApellidoContaining(filtro, filtro);
            List<Persona> personas = personaRepository.searchNativo(filtro);
            return personas;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
