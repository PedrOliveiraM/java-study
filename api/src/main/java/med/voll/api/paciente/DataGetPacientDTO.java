package med.voll.api.paciente;

import med.voll.api.medico.Especialidade;
import med.voll.api.medico.Medico;

public record DataGetPacientDTO(String nome, String email, String cpf) {
        public DataGetMedicoDTO(Paciente paciente) {
            this(paciente.getNome(), paciente.getEmail(), paciente.getCpf());
        }
}


