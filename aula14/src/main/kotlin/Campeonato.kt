class Campeonato(
    val nome:String,
    val ano: Short
) {
    private var clubes = mutableListOf<Clube>()

    //Cadastrar um novo time
    fun cadastrarNovoClube(clube: Clube): Boolean =
        clubes.add(clube)

    //Listar todos os times
    fun listarTodosOsClubes() = clubes

    //Listar times de uma determinada série
    fun listarClubesPorSeries(serie: Serie) =
        clubes.filter { c -> c.serie == serie }

    //Buscar time pelo nome
    fun buscarClubePeloNome(nome:String) = clubes.first { c -> c.nome.equals(nome,true) }
}