import java.time.LocalDate

fun main() {

    var produto1 = Produto()
    produto1.nome = "Doritos"
    produto1.tipo = "Alimento"
    produto1.preco = 8.49f
    produto1.dataValidade = LocalDate.of(2022,12,24)

    var fornecedor1 = Fornecedor()
    fornecedor1.nome = "CJDropshipping"
    fornecedor1.pais = "China"

    var cliente1 = Cliente()
    cliente1.nome = "Ana Joaquina"
    cliente1.email = "anajoaquina@gmail.com"
    cliente1.idade = 32
    cliente1.sexo = "F"

    var estoque1 = Estoque()
    estoque1.produto = produto1
    estoque1.quantidade = 823
    estoque1.fornecedor = fornecedor1

    var vendedor1 = Vendedor()
    vendedor1.nome = "Marcio da Silva"
    vendedor1.salario = 2000f
    vendedor1.estoque = estoque1

    var transportadora1 = Transportadora()
    transportadora1.nome = "FedEx"
    transportadora1.fornecedor = fornecedor1
    transportadora1.vendedor = vendedor1

    var filial1 = Filial()
    filial1.nome = "Chanax"
    filial1.cnpj = "999888777666555"

    var venda1 = Venda()
    venda1.cliente = cliente1
    venda1.produto = produto1
    venda1.vendedor = vendedor1
    venda1.quantidade = 83
    venda1.lucro = 704.67f

    println("${venda1.cliente?.nome} comprou ${venda1.produto?.nome} de ${venda1.vendedor?.nome} por ${venda1.lucro}")
}