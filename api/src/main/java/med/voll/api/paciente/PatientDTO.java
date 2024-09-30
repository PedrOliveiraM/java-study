package med.voll.api.paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import med.voll.api.endereco.AddressDTO;

public record PatientDTO(
        @NotBlank
        String nome,

        @NotBlank
        String email,

        @NotBlank
        String telefone,

        @NotBlank
        String cpf,

        @NotNull
        @Valid
        AddressDTO endereco) {
}
