/*

LAMBDA EXPRESSION

- Function di kotlin adalah first-class citizens, artinya dianggap seperti tipe data yang lainnya.
- Bisa disimpan di variable, array, bahkan bisa dikirim ke parameter function itu sendiri
- Lambda expression secara sederhana adalah function yang tidak memiliki nama
- Biasanya saat kita membuat function, kita akan selalu membuat menggunakan kata
  kunci fun dan mendeklarasikan nama function nya
- Dengan lambda expression, kita bisa membuat function tanpa harus mendeskripsikan function nya

=============================

KODE: LAMBDA EXPRESSION DI VARIABEL

fun main(){
        // val namaLambda: (parameterFunction) -> returnValueFunction ={ parameter: tipeData ->
            body nya
        }

        // Tidak perlu menggunakan kata kunci return. baris terakhir dari lambdaExpression akan mjd return value

    CONTOH

    // membuat lambda
    val lambdaName: (String) -> String = { value: String ->
        value.toUpperCase()
    }

        // kalo seperti diatas (String) -> String
        // itu berarti parameternya harus 1 buah String, dan return valuenya harus String lagi

    // mengeksekusi lambda
    val name = lambdaName("eko")
}

=================================================

KODE IT

- Saat kita membuat lambda dan ternyata lambda nya hanya ada 1 parameter (String), maka kita bisa
  tidak mendeklarasikan variabelnya di lambda tersebut
- Secara default kalo kita tidak mendeklarasikan parameter yang pertama {value: String -> ini,
  kita bisa mengakses dalam body lambdanya ini menggunakan kata kunci IT
- Dan ingat, it hanya bisa digunakan jika parameternya 1. tidak bisa digunakan jika lebih dari 1

fun main(){
    // membuat lambda
    val lambdaName: (String) -> String = {
        it.toUpperCase()
    }

    // mengeksekusi lambda
    val name = lambdaName("eko")

======================================================

METHOD REFERENCES
- Misalnya kita mau bikin lambda expression tapi dari function yang sudah ada
- Membuat Lambda dari referensi function yang sudah ada

KODE

// misal kita punya function dan lambda yang sama2 inputnya String dan outputnya String

fun toUpper(value: String): String = value.toUpperCase()

fun main() {
    // membuat lambda
    fun lambdaName: (String) -> String = ::toUpper

    // mengeksekusi lambda
    val name = lambdaName("eko")

}

 */

fun main() {

    // tidak perlu menggunakan kurung buka kurung tutup
        // contohLambda(firstName: String, lastName: String)
        // langsung menggunakan kurung kurawal
    //  (String, String)    kalo lebih dari satu parameter

    val contohLambda: (String, String) -> String = { firstName: String, lastName: String ->
        val result = "$firstName $lastName"
        result
    }

    val result = contohLambda("Eko", "Kurniawan")
    println(result)

    // ===========================================================

    // IT

    // Default
//    val sayHello: (String) -> String = { value: String ->
//        "Hello $value"
//    }
//    println(sayHello("Eko"))

    // Menggunakan IT
    val sayHello: (String) -> String = {
        "Hello $it"
    }
    println(sayHello("Eko"))

//    =============================================

    // METHOD REFERENCE / FUNCTION REFERENCE
    fun toUpper(value: String): String = value.toUpperCase()

    val toUpperCase: (String) -> String = ::toUpper

    println(toUpperCase("Eko Kurniawan"))
}