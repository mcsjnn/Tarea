fun construirVehiculos() {

    val vehiculo1 = Vehiculo(asientos = 5)
    vehiculo1.imprimirTamano()

    val miCamioneta = Camioneta(alto = 1800, capacidadCarga = 1000)
    miCamioneta.imprimirTamano()
    miCamioneta.imprimirCapacidad()

}

fun crearConductores() {
    val conductorAuto = ConductorAuto()
    val conductorCamioneta = ConductorCamioneta()

    println("Nombre del conductor de auto: ${conductorAuto.nombre}")
    conductorAuto.conducir()

    println("Nombre del conductor de camioneta: ${conductorCamioneta.nombre}")
    conductorCamioneta.conducir()
}

fun main() {
    construirVehiculos()
    crearConductores()
}
