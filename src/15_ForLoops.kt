/*

FOR LOOPS

- Dalam bahasa pemrograman, biasanya ada fitur yang bernama perulangan
- Salah satu fitur perulangan di Kotlin adalah for
- For digunakan untuk melakukan perulangan iterasi dari data iterator (Array, Range, dan lain-lain)


 */

fun main() {

    // FOR LOOPS
        // For digunakan untuk melakukan perulangan iterasi dari data iterator (Array, Range, dan lain - lain

    val array: Array<String> = arrayOf("Eko", "Kurniawan", "Khannedy")

    var total = 0
    for (name in array){
        println(name)
        total++
    }
    println("Total perulangan = $total")

    // ===============================

    // FOR LOOPS RANGE

    for(i in 0..10 step 2){
        println(i)
    }


    // GABUNGAN
    val ukuranArray = array.size - 1
    for (i in 0..ukuranArray){
        println("index $i = ${array.get(i)}")
    }

}