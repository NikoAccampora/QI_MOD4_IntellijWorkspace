fun main(args: Array<String>) {
    val geometria = Geometria()

    val areaDoCirculo = geometria.CalcularAreaDoCirculo(15.0)

    val areaDoTriangulo = geometria.CalcularAreaDoTriangulo(2f,3f)

    val circunferenciaDoCirculo = geometria.CalcularCircunferenciaDoCirculo(15f)

    println("Área do círculo: $areaDoCirculo")

    println("Área do triangulo: $areaDoTriangulo")

    println("Circunferencia do círculo: $circunferenciaDoCirculo")
}