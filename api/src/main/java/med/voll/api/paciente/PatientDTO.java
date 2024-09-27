package med.voll.api.paciente;

import med.voll.api.endereco.AddressDTO;

public record PatientDTO(String nome,
                         String email,
                         String telefone,
                         String cpf,
                         AddressDTO endereco) {
}
