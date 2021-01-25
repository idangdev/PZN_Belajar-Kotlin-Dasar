/*

VARIABEL

- Variable adalah tempat untuk menyimpan data
- Kotlin mendukung 2 jenis variabel; Mutable (bisa diubah) dan Immutable (tidak bisa diubah).
- Untuk membuat variable Mutable, di kotlin bisa menggunakan kata kunci var
- Untuk membuat variable Immutable, di kotlin bisa menggunakan kata kunci val


 */

fun main() {

    // VARIABEL

    // Variabel Mutable
    var firstName: String = "Eko"
    var lastName: String = "Khannedy"

    // mengubah variabel
    lastName = "Kurniawan Khannedy"

    //==============================

    // Variabel Immutable
    val firstName2: String = "Eko"
    val lastName2 = "Khannedy"

    // error jika mengubah variabel val
//    lastName2 = "Kurniawan Khannedy"

    // ==============================

    // NULLABLE

    var firstName3: String? = "Eko"
    firstName3 = null

    // error karena firstname3 bisa null
//    println(firstName3.length)
    // cara mengakses yang benar
    println(firstName3?.length)

    // =================================
    // Akses Variabel Constant
    println("Welcome to $APP version $VERSION")

}

// ================================

// VARIABEL CONSTANT
// harus diluar class

const val APP = "Belajar Kotlin"
const val VERSION = "0.0.1"