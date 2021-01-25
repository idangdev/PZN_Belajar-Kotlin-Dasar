/*

TIPE DATA RANGE

- Kadang kita ingin membuat array yang berisi data yang angka berurutan
- Membuat array dengan jumlah data sedikit mungkin mudah, tapi bagaimana jika data angka yang
  berurutannya sangat banyak, misal dari 1 sampai 1000
- Kotlin mendukung tipe data range, yang digunakan untuk kebutuhan seperti ini
- Cara membuat range di Kotlin sangat mudah cukup menggunakan tanda .. (titik dua kali) :
    - 0..10 : Range dari 0 sampai 10
    - 1..100 : Range dari 1 sampai 100


 */

fun main() {

    // RANGE
    val range = 0..1000

    // ============================

    // OPERASI RANGE
    // count, contains(value), first, last, step
    println(range.count())
    println(range.contains(100))
    println(range.first)
    println(range.last)
    println(range.step)


    // ============================
    // RANGE TERBALIK
    val range2 = 1000 downTo 0


    // ==========================
    // RANGE DENGAN STEP

    val range3 = 0..1000 step 5
    val range4 = 1000 downTo 0 step 5

}