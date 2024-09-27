package med.voll.api.medico;

public record DataGetMedicoDTO(String nome, String email, String crm, Especialidade especialidade) {

    // um construtor que recebe um paramentro do tipo: Medico
    public DataGetMedicoDTO(Medico medico) {
        this(medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}
