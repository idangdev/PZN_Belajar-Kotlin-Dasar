/*

IF EXPRESSION

- Dalam Kotlin, if adalah salah satu kata kunci yang digunakan untuk percabangan
- Percabangan artinya kita bisa mengeksekusi kode program tertentu ketika suatu kondisi terpenuhi
- Hampir di semua bahasa pemrograman mendukung if expression

ELSE EXPRESSION

- Blok if akan dieksekusi ketika kondisi if bernilai true
- Kadang kita ingin melakukan eksekusi program tertentu jika kondisi if bernilai false
- Hal ini bisa dilakukan menggunakan else expression

ELSE IF EXPRESSION

- Kadang dalam If, kita butuh membuat beberapa kondisi
- Kasus seperti ini, di Kotlin kita bisa menggunakan Else If expression


 */

fun main() {
    val nilai = 95

    if (nilai > 90){
        println("Cool")
    }else if(nilai > 75){
        println("Good Job")
    }else if (nilai > 60){
        println("Not Bad")
    }
    else{
        println("Try again next year")
    }
}