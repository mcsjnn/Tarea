
interface AccionConductor {
    fun conducir()
}

abstract class Conductor {
    abstract val nombre: String
}
class ConductorAuto : Conductor(), AccionConductor {
    override val nombre: String = "Pablito"

    override fun conducir() {
        println("Conductor de Auto: Manejar un auto de manera imprudente")
    }
}

class ConductorCamioneta : Conductor(), AccionConductor {
    override val nombre: String = "Carlitos"

    override fun conducir() {
        println("Conductor de Camioneta: Manejar una camioneta con cuidado")
    }
}
