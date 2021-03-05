/*

KOMENTAR

- Komentar terbaik pada kode adalah kode itu sendiri
- Saat membuat kode, kita perlu membuat kode semudah mungkin untuk dibaca
- Namun kadang juga kita butuh menambahkan komentar di kode Kotlin kita

Untuk multipile line itu bisa sebenernya dipakai didalam function. tapi itu jarang banget.
biasanya dipakai diluar functoin

 */

/**
 * This is multi line comment
 */

fun contohFunctoin(){

}

// JAVADOC
/**
 * Contoh function dengan parameter
 * @param name nama parameter
 */
fun contohFunctoinParameter(name: String){

}

fun main() {
    //memanggil contoh function
    contohFunctoin()
    contohFunctoinParameter("Wildan")   // memanggil contoh function parameter

}
