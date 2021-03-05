/*

HIGHER-ORDER FUNCTION (Lambda yang kita jadikan sebagai parameter di function)

- Higher-Order Function adalah function yang menggunakan function sebagai parameter
  atau mengembalikan function
- Penggunaan Higher-Order Function kadang berguna ketika kita ingin membuat function yang
  general dan ingin mendapatkan input yang flexible berupa lambda, yang bisa dideklarasikan oleh si
  user ketika memanggil function tersebut


KODE : HIGHER-ORDER FUNCTION

                             ini lambda, kita pengen inputnya berupa String dan outputnya String
    fun hello(value: String, transformer: (String) -> String): String {
        return "Hello ${transformer(value)}"
    }

    fun main(){
        val upperTransformer = { value: String -> value.toUpperCase() }
        val lowerTransformer = { value: String -> value.toLowerCase() }
        println(hello("Eko", upperTransformer))
        println(hello("Eko", lowerTransformer))

        // Jadi dengan satu function kita bisa men generate beberapa kemungkinan
        //   dengan mengganti jenis lambda yang kita kirim terhadap parameter ini (upperTransfermer / lower)

        // Nanti kalo temen2 belajar struktur data collection, temen2 bakal sering ketemu
        // higher-order function ini
    }


===========================================================================================
    TRAILING LAMBDA
    - Saat kita bikin parameter lambda, tapi posisinya diujung
    - Itu ada kemampuan yang namanya TRAILING LAMBDA
    - Kita gk perlu masukkin lambda kedalam tanda kurung

    fun main(){
        val result1 = hello("Eko") { value: String ->
            value.toUpperCase()
        }
        val result2 = hello("Eko") { value: String ->
            value.toLowerCase()
        }
    }
 */

fun main() {

    fun hello(name: String, transformer: (String) -> String): String{
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    // Pemanggilan
//    val lambdaUpper: (String) -> String = { value: String ->
//        value.toUpperCase()
//    }

    val lambdaUpper = { value: String ->
        value.toUpperCase()
    }
    println(hello("Eko", lambdaUpper))

    // bisa juga langsung masukkan lambda nya tanpa buat variabel
    println(hello("Eko", {value: String -> value.toLowerCase()}))


    // =====================================================================

    // TRAILING LAMBDA (Lambda parameter tidak perlu dimasukkan ke tanda kurung)
    val result1 = hello("Eko", {value: String -> value.toUpperCase()})
    val result2 = hello("Eko") { value: String ->
        value.toUpperCase()
    }

    println(result1)
    println(result2)


}