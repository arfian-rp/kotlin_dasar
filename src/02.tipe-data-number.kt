fun main() {
    //integer Number => bulat
    //floating Point Number => pecahan

    //INT
    var age: Byte = 30
    var height: Int = 170
    var distance: Short = 2000
    var balance: Long = 100000000L
    println(age)
    println(height)
    println(distance)
    println(balance)

    //FLOAT
    var valF: Float = 9.88F
    var valD: Double = 2178525.7873277
    println(valF)
    println(valD)

    //LITERALS
    var decimalLiteral: Int = 100
    var hexadecimalLiteral: Int = 0xFF
    var binaryLiteral: Int = 0b10001
    println(decimalLiteral)
    println(hexadecimalLiteral)
    println(binaryLiteral)

    //UNDERSCORE
    var harga: Long = 5_000_000_000_000L
    println(harga)

    //CONVERSION
    var number: Int = 100
    var long: Long = number.toLong()
    var byte: Byte = number.toByte()
    println(long)
    println(byte)
}