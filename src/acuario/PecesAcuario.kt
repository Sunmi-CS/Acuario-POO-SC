package acuario

interface AccionPez {
    fun comer()
}

abstract class Pez {
    abstract val color: String
}

class Tiburon : Pez(), AccionPez {
    override val color: String = "gris"
    override fun comer() {
        println("Cazar y comer peces")
    }
}

class PezPayaso : Pez(), AccionPez {
    override val color: String = "dorado"
    override fun comer() {
        println("Comer algas")
    }
}
