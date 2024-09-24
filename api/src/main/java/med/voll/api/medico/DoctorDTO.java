package med.voll.api.medico;

import med.voll.api.endereco.AddressDTO;

public record DoctorDTO(String nome,
                        String email,
                        String crm,
                        Especialidade especialidade,
                        AddressDTO endereco) {
}
