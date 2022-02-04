fun main(){
    var leonardo = Compositor()
    leonardo.nome = "Leonardo"
    leonardo.idade = 55
    leonardo.cpf = "66677788844"
    leonardo.telefoneComercial = "519266778843"

    var gustavo = Compositor()
    gustavo.nome = "Gustavo Lima"
    gustavo.idade = 32

    var hardRecords = Gravador()
    hardRecords.nome = "Hard Records LTDA"

    val beforeIForget = Musica()
    beforeIForget.album = "All of Me"
    beforeIForget.anoDeLancamento = 2002
    beforeIForget.compositor = leonardo
    beforeIForget.gravadora = hardRecords
    beforeIForget.titulo = "Before i Forget"


    println(leonardo)
    println(gustavo)

    println("O nome do compositor da música ${beforeIForget.titulo} é ${beforeIForget.compositor?.nome?.uppercase()}")
}