package com.iofullstack.mgmt.repositories;

import com.iofullstack.mgmt.entities.Persona;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {
    List<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido);

    // boolean existsByDni(int dni);
    /*@Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE %?1%")
    List<Persona> search(String filtro);*/
    /*@Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro%")
    List<Persona> search(@Param("filtro") String filtro);*/
    @Query(
            value = "SELECT * FROM persona as p WHERE p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro%",
            nativeQuery = true
    )
    List<Persona> searchNativo(@Param("filtro") String filtro);
}
