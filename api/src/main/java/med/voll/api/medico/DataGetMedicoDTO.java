package med.voll.api.medico;

public record DataGetMedicoDTO(String nome, String email, String crm, Especialidade especialidade) {

    public DataGetMedicoDTO(Medico medico) {
        this(medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}
