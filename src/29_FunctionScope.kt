/*

FUNCTION SCOPE

- Function scope adalah ruang lingkup dimana sebuah function bisa diakses
- Saat kita membuat function di dalam file kotlin, maka secara otomatis function
  tersebut bisa diakses dari file kotlin manapun
- Jika kita ingin membatasi misalnya sebuah function hanya bisa diakses dalam function
  tertentu, maka kita bisa membuat function di dalam function


CATATAN

- Di Kotlin itu function itu seperti semacam first Class citizen
- Beda kaya di java. kita tidak bisa tiba2 langsung bikin function,
  Harus ada di dalam class

=======================================================================

KODE

//  kode dibawah itu berarti kita hanya bisa menggunakan function sayHello didalam function Main saja
    dan di file lain tidak bisa menggunakan fucntion nya

fun main(){
    fun sayHello(name: String): Unit {
        println("Hello $name")
    }

    sayHello("Eko")
}
 */

// karena function dibawah itu sejajar dengan function main,
// maka function ini bisa digunakan dimanapun

// jika kita tidak mau function contohHelloWorld bisa digunakan dimanapun
// maka kita masukkan functnion contohHelloWorld didalam function main



fun satu(){
    // error
//    contohHelloWorld()
    dua()
}

fun dua(){
    // error
//    contohHelloWorld()
    satu()
}

fun main() {
    fun contohHelloWorld(){
        println("Hello World")
    }

    contohHelloWorld()
}