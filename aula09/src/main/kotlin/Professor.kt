class Professor (
    val disciplina:String,
    salario:Float,
    cpf:String,
    nome:String,
    rg:String,
    matricula:Short,
    endereco:String,
    telefone:String,
    email:String
        ) : Funcionario (
        salario = salario,
        cpf = cpf,
        nome = nome,
        rg = rg,
        matricula = matricula,
        endereco = endereco,
        telefone = telefone,
        email = email
        )