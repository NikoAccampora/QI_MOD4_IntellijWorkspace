fun main(args: Array<String>) {
    val gauchao = Campeonato("Gauchão",2022)

    // Antes de cadastrar
    println("Nº de clubes: ${gauchao.listarTodosOsClubes().size}")
    // Cadastrar clube
    gauchao.cadastrarNovoClube(
        Clube(
            "Grêmio",
            Serie.B
        )
    )
    println("Nº de clubes: ${gauchao.listarTodosOsClubes().size}")

    val times = gauchao.listarTodosOsClubes()
    val contagem = times.size - 1
    for(i in 0..contagem){
        println("Nome: ${times[i].nome}\nSérie: ${times[i].serie}")
    }

    // Contar os índices (Comente o resto do código)
    for(i in 1..10){
        println(i)
    }

    // Pule 2 (Comente o resto do código)
    for(i in 2..10 step 2){
        println(i)
    }
}