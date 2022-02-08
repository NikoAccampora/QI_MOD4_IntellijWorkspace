import kotlin.math.pow
import kotlin.math.sqrt

class Calculadora {

    fun somar(n1:Float,n2:Float):Float{
        return n1 + n2
    }

    fun subtrair(n1:Float,n2:Float):Float{
        return n1 - n2
    }

    fun multiplicar(n1:Float,n2:Float):Float{
        return n1 * n2
    }

    fun dividir(n1:Float,n2:Float):Float{
        return n1 / n2
    }

    fun restoDaDivisao(num:Int,divisor:Int):Int{
        return num % divisor
    }

    fun potencia(base:Double,expoente:Double):Double{
        return base.pow(expoente)
    }

    fun raizQuadrada(num:Double):Double{
        return sqrt(num)
    }

    fun restoDaDivisao2(dividendo:Float, divisor:Float):Float = dividendo % divisor
    }
