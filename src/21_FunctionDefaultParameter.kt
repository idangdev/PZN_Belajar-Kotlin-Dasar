/*

FUNCTION DEFAULT PARAMETER

 - Di Kotlin, function parameter wajib diisi ketika memanggil function
 - Namun kita juga bisa memasukkan nilai default pada parameter, dengan demikian saat memanggil function tersebut
   kita tidak wajib memasukkan nilai pada parameternya
 - Default parameter ini cocok pada jenis parameter yang sekiranya memang tidak wajib untuk diisi

 */

//fun hello(firstName: String, lastName: String = ""){
fun hello(firstName: String, lastName: String? = null){

    if (lastName == null){
        println("Hello $firstName")
    }else{
        println("Hello $firstName $lastName")
    }
}

fun main() {
    hello("Eko")
    hello("Eko", "Khannedy")
}