package med.voll.api.paciente;

public record DataGetPacientDTO(String nome, String email, String cpf) {

        public DataGetPacientDTO(Paciente paciente) {
            this(paciente.getNome(), paciente.getEmail(), paciente.getCpf());
        }
}


