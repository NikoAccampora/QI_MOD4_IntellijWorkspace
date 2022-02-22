import kotlin.random.Random

class Adivinha {
    fun jogar(palpite:Int):String{
        val numeroSorteado = Random.nextInt(0,10)

    return if(palpite == numeroSorteado) "Venceu!!"
        else "Errou!!"
    }
}