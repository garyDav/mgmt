package com.iofullstack.mgmt.repositories;

import com.iofullstack.mgmt.entities.Persona;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {
}
