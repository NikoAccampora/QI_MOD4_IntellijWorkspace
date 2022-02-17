fun main() {
    val user = PessoaFisica(
        nome = "Valeria",
        rg = "1234995544",
        endereco = "Rua A nº 13",
        email = "valeria@gmail.com",
        matricula = 14,
        cpf = "98765",
        telefone = "123456789"
    )

    val qi = PessoaJuridica(
        nomeFantasia = "QI Escolas e Faculdades",
        endereco = "Av. Assis Brasil nº3423",
        cnpj = "123456789",
        matricula = 20,
        telefone = "123456",
        email = "fl02@qi.edu.br",
        razaoSocial = "QI Escolas e Faculdades LTDA"
    )
}