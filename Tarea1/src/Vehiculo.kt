open class Vehiculo(
    open var largo: Int = 4000, // Largo en mm
    open var ancho: Int = 1800, // Ancho en mm
    open var alto: Int = 1500   // Alto en mm
) {
    init {
        println("Inicializando vehículo")
    }

    fun imprimirTamano() {
        println("Tipo de vehículo: $tipo")
        println(
            "Ancho: $ancho mm " +
                    "Largo: $largo mm " +
                    "Alto: $alto mm "
        )
        println("Volumen: $volumen m³")
    }

    open var volumen: Int
        get() = (ancho * alto * largo) / 1000000000  // 1,000,000,000 mm^3 = 1 m³
        set(valor) {
            alto = (valor * 1000000000) / (ancho * largo)
        }

    open val tipo: String = "Vehículo"

    // Constructor alternativo para definir un vehículo según su capacidad de asientos
    constructor(asientos: Int) : this() {
        val volumenNecesario = asientos * 3000 * 1.2  // 3,000 mm³ por asiento más espacio adicional
        alto = (volumenNecesario / (largo * ancho)).toInt()
    }
}

class Camioneta(
    override var alto: Int,
    var capacidadCarga: Int // Capacidad de carga en kg
) : Vehiculo(alto = alto, ancho = 2000, largo = 5000) {
    override var volumen: Int
        get() = (ancho * alto * largo) / 1000000000
        set(valor) {
            alto = (valor * 1000000000) / (ancho * largo)
        }

    override val tipo = "Camioneta"

    fun imprimirCapacidad() {
        println("Capacidad de carga: $capacidadCarga kg")
    }
}
