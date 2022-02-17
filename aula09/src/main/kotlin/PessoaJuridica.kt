class PessoaJuridica (
    var cnpj: String,
    var nomeFantasia: String,
    var razaoSocial: String,
    // Infos da classe mãe
    matricula: Short,
    email: String,
    telefone: String,
    endereco: String
        ) : Pessoa(
            email = email,
            matricula = matricula,
            telefone = telefone,
            endereco = endereco

        )