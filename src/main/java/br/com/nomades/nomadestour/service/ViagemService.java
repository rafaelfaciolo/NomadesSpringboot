package br.com.nomades.nomadestour.service;

import br.com.nomades.nomadestour.domain.request.ViagemRequest;
import br.com.nomades.nomadestour.entity.Viagem;
import br.com.nomades.nomadestour.repository.ViagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public interface ViagemService {
    void save(Viagem v);
}
