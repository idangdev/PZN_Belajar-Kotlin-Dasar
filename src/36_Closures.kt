/*

CLOSURES

- Closure adalah kemampuan sebuah function, lambda atau anonymous function berinteraksi dengan
  data - data disekitarnya dalam scope yang sama
- Harap gunakan fitur closure ini dengan bijak saat kita membuat aplikasi

CATATAN
- Kalo tidak digunakan dengan baik bisa berbahaya karena bisa mengubah data milik orang lain
- Mas Eko sendiri jarang banget pake CLOSURE. Kalo bisa sih dihindari karena bisa mengubah
  data ditempat lain secara tidak sengaja

=============================================================================

KODE: CLOSURE

    fun main(){
        var counter: Int = 0
        val lambdaIncrement: () -> Unit = {
            println("Increment")
            counter++   // ini menambah 1 variabel counter
        }

        lambdaIncrement()
        lambdaIncrement()
    }

 */

fun main() {

    var counter: Int = 0


    // Saat kita membuat lambda, kita bisa mengakses variabel counter karena masih di scope yang sama
    // di fun main
    val lambdaIncrement: () -> Unit = {
        println("Lambda Increment")
        counter++
    }

    val anonymousFunction = fun(): Unit{
        println("Anonymous Function Increment")
        counter++
    }

    fun functionIncrement(){
        println("Function Increment")
        counter++
    }

    lambdaIncrement()
    anonymousFunction()
    functionIncrement()
    lambdaIncrement()
    anonymousFunction()
    functionIncrement()

    println(counter)
}

/*

HATI HATI DALAM PENGGUNAANYA
Karena kalo salah bisa berbahaya

MISAL :

fun main(){
    var counter: Int = 0
    var name: String = "Eko"

    val lambdaIncrement: () -> Unit = {
        println("Lambda increment")
        counter++

        // Misal kita tadinya mau membuat variabel name. tapi kita lupa.
        // val name = "Lambda"

        // malah kaya gini
        name = "Lambda"

        // itu berarti kita akan merubah variabel name yang di atas

    }
}

 */