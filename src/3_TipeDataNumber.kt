/*

TIPE DATA NUMBER

- Integer Number
- Floating Point Number


 */


fun main(){

    // underscore in number
    var age: Byte = 30
    var height: Int = 170
    var distance: Short = 2000
    var balance: Long = 1000000000L

    //floating point number
    var value: Float = 98.98F
    var radius: Double = 21342342343.54535

    // literals
    var decimalLiteral: Int = 100
    var hexadecimalLiteral: Int = 0xFF
    var binaryLiteral: Int = 0b0001

    // Underscore in number
    var age2: Byte = 3_0
    var height2: Int = 1_7_0
    var distance2: Short = 2_000
    var balance2: Long = 100_000_000L

    // Conversion
    var number: Int = 100

    var byte: Byte = number.toByte()
    var short: Short = number.toShort()
    var int: Int = number.toInt()
    var long: Long = number.toLong()
    var float: Float = number.toFloat()
    var double: Double = number.toDouble()
}