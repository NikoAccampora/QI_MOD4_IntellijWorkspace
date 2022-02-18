 class Cachorro (
    var raca:String,
    peso: Float,
    altura: Short
) : Mamifero (
    peso,
    altura
){
     override fun comer():String = "Comer ração de cachorro"

     override fun emitirSom(): String = "Latido do cão"

     override fun amamentar(): String = "Vou amamentar como um cachorro"
}