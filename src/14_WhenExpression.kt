/*

 WHEN EXPRESSION

- Selain if expression, untuk melakukan percabangan di Kotlin, kita juga bisa menggunakan When Expression
- When expression sangat sederhana dibandingkan if
- Biasanya when expression digunakan untuk melakukan pengecekan ke kondisi dalam satu variable


CATATAN

- when -> switch(case)
- cuman bisa digunakan untuk kasus2 yang sederhana
- rekomendasi

 */

fun main() {

    var nilai = 'A'

    when(nilai){
        'A' -> {
            println("Amazing")
        }
        'B' -> {
            println("Good")
        }
        'C' -> println("Not Bad")
        'D' -> println("Bad")
        'E' -> println("Try Again Next Year")
        else -> println("Ups")
    }

    // =====================================

    // WHEN EXPRESSION MULTIPLE OPTION

    when(nilai){
        //Grouping
            // if(nilai == 'A' || nilai =='B' || nilai = 'C')
        'A', 'B', 'C' -> println("Selamat Anda Lulus")
        else -> println("Maaf,Anda tidak lulus")
    }

    // ======================================

    // WHEN EXPRESSION IN

    nilai = 'E'
    val nilaiLulus: Array<Char> = arrayOf('A', 'B', 'C')
    when(nilai){
        // apakah nilai = E ada didalam nilaiLulus?
        in nilaiLulus -> println("SELAMAT ANDA LULUS")
        !in nilaiLulus -> println("MAAF, TIDAK LULUS")
    }

    // ======================================

    // WHEN EXPRESSION IS
    val name = "Eko"
    when(name){
        // apakah variabel name itu tipe datanya string?
        is String -> println("Name is String")
        !is String -> println("Name is not String")
    }

    // ========================================

    /*
     WHEN SEBAGAI PENGGANTI IF ELSE

     - Selain pengecekan terhadap variabel
     - When juga dapat digunakan sebagai pengganti if else
     - Untuk mengganti if else dengan when, kita tidak perlu menggunakan variabel dalam when

     */
    val nilaiUjian = 90
    when{
        nilaiUjian > 90 -> println("Amazing")
        nilaiUjian > 80 -> println("Good Job")
        nilaiUjian > 60 -> println("Not Bad")
        else -> println("Ngulang tahun depan")
    }

}