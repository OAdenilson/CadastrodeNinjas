package dev.java10x.CadastroDeNinjas.Ninjas.Controller.Service;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaService ninjaService;
    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Essa é a minha primeira mensagem nessa rota !";
    }

    // Adicionar Ninja (Create)
    @PostMapping("/criar")
    public NinjaModel criarNinja(@RequestBody NinjaModel ninjaModel) {
        return ninjaService.criarNinjas(ninjaModel);
    }


    //Mostrar todos os  Ninjas (READ)
    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas(){
        return ninjaService.listarNinjas();
    }

    // Mostrar Ninjas por Id (READ)
    @GetMapping("/listar/{id}")
    public NinjaModel listarNinjasPorID(@PathVariable Long id){
        return ninjaService.listarNinjasPorId(id);
    }


    // Alterar dados dos Ninjas (UPDATE)
    @PutMapping("/alterarID")
    public String alterarNinjasPorID(){
        return "Alterar Ninjas por Id";
    }


    //Deletar Ninja (DELETE)
    @DeleteMapping("/deletarID")
    public String deletarNinjasPorID(){
        return "Deletar Ninjas por Id";
    }


}
