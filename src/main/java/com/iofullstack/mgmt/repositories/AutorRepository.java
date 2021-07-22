package com.iofullstack.mgmt.repositories;

import com.iofullstack.mgmt.entities.Autor;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends BaseRepository<Autor, Long> {
}
