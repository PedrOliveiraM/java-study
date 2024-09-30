package med.voll.api.controller;


import med.voll.api.medico.DataGetMedicoDTO;
import med.voll.api.paciente.DataGetPacientDTO;
import med.voll.api.paciente.PatientDTO;
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

    @PostMapping
    public void registerPatient(@RequestBody PatientDTO data){
        System.out.println(data);
    }

    public List<DataGetPacientDTO> listPatient(@PageableDefault(page = 1,sort = {"nome"}) Pageable pagination){

    }
}
