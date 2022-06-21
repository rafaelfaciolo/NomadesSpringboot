package br.com.nomades.nomadestour.service;

import br.com.nomades.nomadestour.entity.Viagem;
import br.com.nomades.nomadestour.repository.ViagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ViagemServiceImpl implements ViagemService{
    @Autowired
    ViagemRepository viagemRepository;

    @Override
    public void save(Viagem v) {

    }
}
