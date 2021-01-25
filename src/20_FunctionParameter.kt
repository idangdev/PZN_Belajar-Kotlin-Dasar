/*

FUNCTION PARAMETER

- Saat membuat function, kadang-kadang kita membutuhkan data dari luar, atau kita sebut parameter.
- Di Kotlin, kita bisa menambahkan parameter di function, bisa lebih dari satu
- Parameter tidaklah wajib, jadi kita bisa membuat function tanpa parameter
  seperti sebelumnya yang sudah kita buat
- Namun jika kita menambahkan parameter di function, maka ketika memanggil
  function tersebut, kita wajib memasukkan data ke parameternya

*/

// tanpa embel2 var atau val. karena memang defaultnya val tidak bisa dirubah2 value parameternya

fun sayHello(nama: String){
    // firstName = "Nono"
    // tidak bisa diubah value paramternya, karena sudah pasti val

    println("Hello $nama")
}

// boleh null
fun sayHello2(firstName: String, lastName: String?){

    // validasi apakah null apa tidak
    if (lastName == null){
        println("Hello $firstName")
    }else{
        println("Hello $firstName $lastName")
    }

}

fun main() {

    sayHello("Wildan")

    sayHello2("Eko", "Kurniawan")
    sayHello2("Budi", null)


}