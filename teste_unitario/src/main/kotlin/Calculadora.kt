class Calculadora {
    fun somar(vararg numbers:Float):Float{
        var soma = 0f
        val tamanho = numbers.size
        for (index in 0 until tamanho){
            soma += numbers[index]
        }
        return soma
    }
}