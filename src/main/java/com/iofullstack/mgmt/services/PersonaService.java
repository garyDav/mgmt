package com.iofullstack.mgmt.services;

import com.iofullstack.mgmt.entities.Persona;

import java.util.List;

public interface PersonaService extends BaseService<Persona, Long> {
    List<Persona> search(String filtro) throws Exception;
}
