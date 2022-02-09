import kotlin.math.PI
import kotlin.math.pow

class Geometria {
    fun CalcularAreaDoCirculo(raio:Double) = PI * raio.pow(2)

    fun CalcularAreaDoTriangulo(base:Float,altura:Float ) = base * altura / 2

    fun CalcularCircunferenciaDoCirculo(raio:Float) = 2 * PI * raio
}