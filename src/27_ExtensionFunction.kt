/*

EXTENSION FUNCTION

- Extension function adalah kemampuan menambahkan function pada tipe data yang sudah ada
- Extension function adalah salah satu fitur yang sangat powerfull, namun harap bijak
  menggunakannya, karena jika terlalu banyak digunakan, akan membuat program sulit dimengerti,
  karena terlihat seperti magic
- Untuk membuat extension function, kita cukup menambahkan tipe data pada nama function nya,
  lalu diikuti dengan tanda . (titik)
- Untuk mengakses data nya di extension function, kita bisa menggunakan kata kunci this
        - THIS : artinya kita mengakses data yang ada di tipe data tersebut


==================================

KODE

fun String.hello(): String {
    // kalo kita mau ngakses datanya. itu kita pake THIS
    return "Hello $this"
}

fun main(){
    val name: String = "Eko"
    val hello: String = name.hello()
}


 */

fun String.hello(): String{
    return "Hello $this"
}
fun String.printHello(): Unit = println("Hello $this")

fun Int.kaliDua(): Int {
    return this * 2
}

fun Int.kaliTiga(): Int{
    return this * 3
}

fun main() {
    val name = "Eko"
    println(name.hello())

    name.printHello()

    "Kurniawan".printHello()

    println(kaliDua(5))

    4.kaliTiga()
}

