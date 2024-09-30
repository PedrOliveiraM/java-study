package med.voll.api.controller;


import jakarta.validation.Valid;
import med.voll.api.medico.DataGetMedicoDTO;
import med.voll.api.medico.DoctorDTO;
import med.voll.api.medico.Medico;
import med.voll.api.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping
    public Page<DataGetMedicoDTO> listDoctor(@PageableDefault(page = 1,sort = {"nome"}) Pageable pagination) {
        return repository.findAll(pagination).map(DataGetMedicoDTO::new);
    }

}
