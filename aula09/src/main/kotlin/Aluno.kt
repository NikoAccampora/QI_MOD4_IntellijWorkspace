open class Aluno (
    val turma:String,
    cpf:String,
    nome:String,
    rg:String,
    matricula:Short,
    endereco:String,
    telefone:String,
    email:String,
        ) : PessoaFisica(
        cpf = cpf,
        nome = nome,
        rg = rg,
        matricula = matricula,
        endereco = endereco,
        telefone = telefone,
        email = email
)