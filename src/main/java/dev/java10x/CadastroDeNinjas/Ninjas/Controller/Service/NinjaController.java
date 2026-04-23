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
    public String criar() {
        return "Ninja criado";
    }


    //Mostrar todos os  Ninjas (READ)
    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas(){
        return ninjaService.listarNinjas();
    }

    // Mostrar Ninjas por Id (READ)
    @GetMapping("/listarID")
    public String mostrarTodosOsNinjasPorID(){
        return "Mostrar Ninjas por Id";
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
