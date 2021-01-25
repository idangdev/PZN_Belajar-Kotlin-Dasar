/*

SINGLE EXPRESSION FUNCTION

- Kadang kita sering membuat function yang sangat sederhana
- Misal function yang hanya berisikan kode blok sederhana, misal hanya 1 baris
- Jika kita mengalami hal seperti ini, kita bisa mengubahnya menjadi SINGLE EXPRESSION FUNCTION
- Single Expression Function adalah deklarasi hanya dengan 1 baris kode
- Untuk membuat single expression function, kita hanya butuh tanda = (sama dengan) setelah
  deklarasi nama function dan tipe data pengembalian function

==================================================|
                                                  |
fun double(a: Int): Int = a * 2                   |
fun hi(name: String): Unit = println("Hi $name")  |
                                                  |
==================================================|

PENJELASAN

- Pada kode di atas adalah contoh SINGLE EXPRESSION FUNCTION,
- fun namaFunction(namaParameter: TipeData): TipeDataKembalian = Isi
- Jadi di SINGLE EXPRESSION FUNCTION kita tidak perlu lagi menggunakan kode RETURN. karena sudah otomatis
  Dijadikan return value

 */

//fun kaliDua(a: Int): Int {
//    return a * 2
//}


// JADI SINGLE EXPRESSION FUNCTION
fun kaliDua(a: Int): Int = a * 2

fun sapa(name: String): Unit = println("Hello $name")

fun main() {
    println(kaliDua(10))
    sapa("Eko")
}

