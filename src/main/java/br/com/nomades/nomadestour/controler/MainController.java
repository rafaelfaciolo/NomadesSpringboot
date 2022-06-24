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
        Boolean resultadoDaCriacao = viagemService.criarViagem(viagem);
        if(!resultadoDaCriacao){
            return "Deu muito ruim";
        }
        return "Viagem Cadastrada";
    }

    @RequestMapping(path = "/consulta/viagem")
    public String getViagemById(@RequestParam Long id){
        Viagem viagem = viagemService.getViagemById(id);
        return viagem.toString();

    }
    @RequestMapping(path = "/consulta/viagens", method = RequestMethod.GET)
    public String consultarViagens(){
         return viagemService.getViagens();
    }

    public void deletarViagem (){

    }

    @RequestMapping(path = "/ping" , method = RequestMethod.GET)
    public String pingPong (@RequestParam String cor){
        return "pong" + " " + cor;

    }


}
