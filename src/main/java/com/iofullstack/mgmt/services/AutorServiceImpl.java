package com.iofullstack.mgmt.services;

import com.iofullstack.mgmt.entities.Autor;
import com.iofullstack.mgmt.repositories.AutorRepository;
import com.iofullstack.mgmt.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService {
    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }
}
