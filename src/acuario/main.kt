package acuario

fun construirAcuario() {
    val acuario7 = Acuario(numeroDePeces = 29)
    acuario7.imprimirTamano()
    println("\nActualizando volumen a 70 litros...")
    acuario7.volumen = 70
    acuario7.imprimirTamano()

    println("\n---")

    val acuario8 = Acuario(ancho = 25, largo = 25, alto = 40)
    acuario8.imprimirTamano()

    println("\n---")

    val miTorre = TanqueTorre(diametro = 25, alto = 40)
    miTorre.imprimirTamano()
}

fun crearPeces() {
    val tiburon = Tiburon()
    val pezPayaso = PezPayaso()

    println("\n---")

    println("El color del Tiburón es: ${tiburon.color}")
    tiburon.comer()
    println("El color del Pez Payaso es: ${pezPayaso.color}")
    pezPayaso.comer()
}

fun main() {
    construirAcuario()
    crearPeces()
}
