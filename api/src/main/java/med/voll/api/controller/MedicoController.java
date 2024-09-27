package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.medico.DoctorDTO;
import med.voll.api.medico.Medico;
import med.voll.api.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired //injeção de dependencia
    private MedicoRepository repository;

    @Transactional
    @PostMapping
    public void registerDoctor(@RequestBody @Valid DoctorDTO data) {
        repository.save(new Medico(data));
    }
}
