package med.voll.api.endereco;

public record AddressDTO(String logradouro,
                         String bairro,
                         String cidade,
                         String cep,
                         String uf,
                         String complemento,
                         String numero) {
}
