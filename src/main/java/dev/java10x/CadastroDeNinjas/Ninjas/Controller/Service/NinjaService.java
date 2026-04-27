package dev.java10x.CadastroDeNinjas.Ninjas.Controller.Service;

import org.springframework.stereotype.Service;


import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    // Listar todos os meus Ninjas
    public List<NinjaModel> listarNinjas() {
        return ninjaRepository.findAll();

    }

    // Listar todos os meus Ninjas por ID
    // Usando o OPTIONAL --> Pois o ID do ninja pode ou nao exister na tabela de banco de dados
    public NinjaModel listarNinjasPorId(Long id) {
        Optional<NinjaModel> ninjaPorId = ninjaRepository.findById(id);
        return ninjaPorId.orElse(null);
    }

    //Criar um novo Ninja
    public NinjaModel criarNinjas(NinjaModel ninja) {
        return ninjaRepository.save(ninja);
    }

    // Deletar o Ninja  --> Tem que ser um metodo Void
    public void deletarNinjasPorId(Long id) {
        ninjaRepository.deleteById(id);
    }

    //Atualizar Ninja
    public NinjaModel atualizarNinja(Long id, NinjaModel ninjaAtualizado) {
        if (ninjaRepository.existsById(id)) {
            ninjaAtualizado.setId(id);
            return ninjaRepository.save(ninjaAtualizado);
        }
        else  {
            return null;
        }
    }

}










