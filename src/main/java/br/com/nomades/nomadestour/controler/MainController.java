package br.com.nomades.nomadestour.controler;

import br.com.nomades.nomadestour.domain.request.ViagemRequest;
import br.com.nomades.nomadestour.entity.Viagem;
import br.com.nomades.nomadestour.repository.ViagemRepository;
import br.com.nomades.nomadestour.service.ViagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @Autowired
    private ViagemRepository viagemRepository;
    @Autowired
    private ViagemService viagemService;

    @RequestMapping(path = "/criarviagem" , method = RequestMethod.POST)
    public String criarViagem(@RequestBody ViagemRequest viagem){
        Viagem v = new Viagem();
        v.setDataPartida(viagem.getDataPartida());
        v.setDataRetorno(viagem.getDataRetorno());
        v.setLocal(viagem.getLocal());
        v.setVagas(viagem.getVagas());
        v.setValor(viagem.getValor());
        viagemRepository.save(v);
        return viagem.toString();

    }

    @RequestMapping(path = "/consuta/viagem/{id}")
    public void alterarViagem (){

    }
    @RequestMapping(path = "/consuta/viagens", method = RequestMethod.GET)
    public String consultarViagens(){
         return viagemRepository.findAll().toString();




    }

    public void deletarViagem (){

    }

    @RequestMapping(path = "/ping" , method = RequestMethod.GET)
    public String pingPong (@RequestParam String cor){
        return "pong" + " " + cor;

    }


}
