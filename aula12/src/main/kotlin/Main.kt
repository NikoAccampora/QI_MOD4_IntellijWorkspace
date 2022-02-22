fun main(args: Array<String>) {
    //atividade1()
    //atividade2()
    //atividade3()
    //atividade4()
    atividade5()
}

fun atividade1():Unit{
    println("Digite o primeiro número:")
    val num1 = readLine()!!.toFloat()
    println("Digite o segundo1 número:")
    val num2 = readLine()!!.toFloat()

    if(num1 > num2){
        println("O primeiro numero é maior que o segundo")
    } else if (num1 == num2) {
        println("O primeiro numero é igual ao o segundo")
    } else if (num1 < num2){
        println("O segundo numero é menor que o segundo")
    } else {
        println("Bah! não sei mais!")
    }
}

fun atividade2():Unit{
    println("digite numero")
    val num = readLine()!!.toFloat()

    if(num > 0){
        println("É positivo")
    } else if(num < 0){
        println("É negativo")
    } else if(num == 0f){
        println("É zero")
    } else println("BAH NAO SEI MAIS")
}

fun atividade3():Unit{
    println("Digite uma letra qualquer")
    val letra = readLine()!!

    if(
        letra.equals("a",true) ||
        letra.equals("e",true) ||
        letra.equals("i",true) ||
        letra.equals("o",true) ||
        letra.equals("u",true)
    ) {
        println("a letra $letra é vogal")
    } else println("a letra '$letra' é consoante")
}

fun atividade4():Unit{
    val jogo = Adivinha()
    println("Digite un número entre 0 e 10 para o seu palpite")
    val palpite = readLine()!!.toInt()

    if(palpite in 0..10){
        // Palpite válido
        println(jogo.jogar(palpite))
    } else {
        println("Palpite inválido!!!")
    }
}

fun atividade5():Unit{
    val jogo = Jokenpo()
    println("Digite um número entre 1 e 3 para sua jogada")
    val jogador = readLine()!!.toInt()

    if(jogador in 1..3){
        println(jogo.jogar(jogador))
    }else{
        println("Jogada inválida!!!")
    }
}