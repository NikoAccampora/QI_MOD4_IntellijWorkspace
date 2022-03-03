fun main(args: Array<String>) {

    val ing01 = Ingresso(11.99f)
    val ing02 = Ingresso(14.49f)
    val ing03 = Ingresso(11.99f)
    val ing04 = Ingresso(9.49f)
    val ing05 = Ingresso(11.99f)
    val ing06 = Ingresso(14.49f)
    val ing07 = Ingresso(16.99f)
    val ing08 = Ingresso(16.49f)
    val ing09 = Ingresso(11.99f)
    val ing10 = Ingresso(9.99f)

    var ingressos = mutableListOf<Ingresso>(ing01,ing02,ing03,ing04,ing05,ing06,ing07,ing08,ing09,ing10)
    val contIng = ingressos.size -1

    val ass01 = Assento(true)
    val ass02 = Assento(true)
    val ass03 = Assento(true)
    val ass04 = Assento(true)
    val ass05 = Assento(true)
    val ass06 = Assento(true)
    val ass07 = Assento(true)
    val ass08 = Assento(true)
    val ass09 = Assento(true)
    val ass10 = Assento(true)

    var assentos = mutableListOf<Assento>(ass01,ass02,ass03,ass04,ass05,ass06,ass07,ass08,ass09,ass10)
    val contAss = assentos.size -1

    val cli1 = Cliente("Marcos",TipoCliente.comum,12f,ing01,ass01)
    val cli2 = Cliente("José",TipoCliente.estudante,16f,ing02,ass02)
    val cli3 = Cliente("Aline",TipoCliente.professor,20f,ing03,ass03)
    val cli4 = Cliente("Thaís",TipoCliente.comum,9f,ing04,ass04)
    val cli5 = Cliente("Paulo",TipoCliente.estudante,20f,ing05,ass05)
    val cli6 = Cliente("Mateus",TipoCliente.professor,24f,ing06,ass06)
    val cli7 = Cliente("Rafael",TipoCliente.comum,3f,ing07,ass05)
    val cli8 = Cliente("Bruna",TipoCliente.idoso,5f,ing08,ass08)
    val cli9 = Cliente("Henrique",TipoCliente.idoso,15f,ing09,ass03)
    val cli10 = Cliente("Ana",TipoCliente.comum,17f,ing10,ass10)

    var clientes = mutableListOf<Cliente>(cli1,cli2,cli3,cli4,cli5,cli6,cli7,cli8,cli9,cli10)
    val contCli = clientes.size -1

////////CÁCULO DE DESCONTOS

println("===================================================================")
println("CALCULANDO DESCONTO DE INGRESSOS (ESTUDANTES, PROFESSORES E IDOSOS)")
println("===================================================================")

    clientes.forEach(){
        if(it.tipoCliente == TipoCliente.estudante){
            it.ingresso.preco = (it.ingresso.preco*0.97f)
            println("")
            System.out.printf("%s é estudante, preço do ingresso reduzido para %.2fR$",it.nome,it.ingresso.preco)
            println("")
        } else if(it.tipoCliente == TipoCliente.professor){
            it.ingresso.preco = (it.ingresso.preco*0.95f)
            println("")
            System.out.printf("%s é professor(a), preço do ingresso reduzido para %.2fR$",it.nome,it.ingresso.preco)
            println("")
        } else if (it.tipoCliente == TipoCliente.idoso){
            it.ingresso.preco = (it.ingresso.preco*0.90f)
            println("")
            System.out.printf("%s é idoso(a), preço do ingresso reduzido para %.2fR$",it.nome,it.ingresso.preco)
            println("")
        }


    }

    println("==================================================")
    println("CHECANDO STATUS DE DISPONIBILIDADE DOS ASSENTOS")
    println("==================================================")

////////VALIDAR ASSENTOS

    clientes.forEach(){
        if(it.assento.disponivel == false){
            println("Assento indisponível para ${it.nome}!")
            println("--")
        } else
            println("Assento Reservado Para ${it.nome}.")
            it.assento.disponivel = false
            println("--")
    }

    println("===================================================================")
    println("PROCESSANDO VENDA DE INGRESSOS; POSSÍVEIS CANCELAMENTOS")
    println("===================================================================")

////////VENDA DE INGRESSOS
////////CANCELAMENTO DE VENDAS

    clientes.forEach(){
        if(it.dinheiro < it.ingresso.preco){
            println("${it.nome} Não pode pagar pelo ingresso. Venda cancelada!")
            it.assento.disponivel = true
            println("--")

        } else
            println("Ingresso vendido para ${it.nome}.")
            ingressos.remove(it.ingresso)
            println("--")
    }

    clientes.removeIf { it.dinheiro < it.ingresso.preco }

}