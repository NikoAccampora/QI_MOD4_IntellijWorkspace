import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CalculadoraTest {
    @Test
    @DisplayName("Should sum two numbers and return your sum")
    fun somarDoisNumeros(){
        val num1 = 34f
        val num2 = 32f
        val calculadora = Calculadora()
        assertEquals(66f,calculadora.somar(num1,num2))
    }

    @Test
    @DisplayName("Should sum three numbers and return your sum")
    fun somarTresNumeros(){
        val num1 = 23f
        val num2 = 90f
        val num3 = 45f
        val calculadora = Calculadora()
        assertEquals(270f,calculadora.somar(num1,num2,num3,45f,67f))
        //Se o resultado não for 'expected', vai dar erro de teste.

    }
}


