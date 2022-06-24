package br.com.nomades.nomadestour.service;

import br.com.nomades.nomadestour.domain.request.ViagemRequest;
import br.com.nomades.nomadestour.entity.Viagem;
import br.com.nomades.nomadestour.repository.ViagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ViagemServiceImpl implements ViagemService{

    @Autowired
    ViagemRepository viagemRepository;

    @Override
    public Boolean criarViagem(ViagemRequest viagemRequest) {
        Viagem v = new Viagem();
        if(viagemRequest.getLocal() == null){
            System.out.println("O local informado esta nulo.");
            return false;
        }
        try {
            v.setDataPartida(viagemRequest.getDataPartida());
            v.setDataRetorno(viagemRequest.getDataRetorno());
            v.setLocal(viagemRequest.getLocal());
            v.setVagas(viagemRequest.getVagas());
            v.setValor(viagemRequest.getValor());
            viagemRepository.save(v);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public String getViagens() {
        return viagemRepository.findAll().toString();
    }

    @Override
    public Viagem getViagemById(Long id) {
        return viagemRepository.getReferenceById(id);
    }
}
