package med.voll.api.controller;


import jakarta.transaction.Transactional;
import med.voll.api.paciente.DataGetPacientDTO;
import med.voll.api.paciente.PacienteRepository;
import med.voll.api.paciente.PatientDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private PacienteRepository repository;

    @Transactional
    @PostMapping
    public void registerPatient(@RequestBody PatientDTO data){
        System.out.println(data);
    }

    public Page<DataGetPacientDTO> listPatient(@PageableDefault(page = 1,sort = {"nome"}) Pageable pagination){
        return repository.findAll(pagination).map((DataGetPacientDTO::new));
    }
}
