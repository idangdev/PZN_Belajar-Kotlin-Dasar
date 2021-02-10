/*

FUNCTION INFIX NOTATION

- Infix Notation adalah operasi yang biasa dilakukan di operasi matematika, dimana dia
  melakukan operasi terhadap dua data
- Hampir semua operasi matematika adalah infix notation
        - Contohnya +(plus), -(minus)
        - Cuman bisa kita gunakan kalo emang ada 2 data yang di operasikan
        - 2 (kiri) + 2(kanan)
- Di kotlin, kita bisa membuat function infix notation juga
- Untuk menggunakan function infix notation, tidak wajib menggunakan tanda . (titik)
        - nama.hello()  -> Infix, String hello()

SYARAT

- Harus sebagai function member (akan dibahas di OOP) atau function extension
        - Karena dia ngelakuin operasi terhadap 2 data
          maka dia harus dibuat sebagai functin extension
- Harus memiliki 1 parameter (tidak bisa lebih dari 1 ataupun kosong)
- Parameter tidak boleh varargs dan tidak boleh memiliki nilai default value


CATATAN

- Di java tidak bisa


=====================================

KODE

infix fun String.to(type: String): String{
    if (type == "UP"){
        return this.toUpperCase()
    }else{
        return this.toLowerCase()
    }
}

fun main(){
    val result: String = "Eko" to "UP"      // kalo di infix 1 + 1, mirip banget
}

 */

infix fun String.to(type: String): String{
    if(type == "UP"){
        return this.toUpperCase()
    }else{
        return this.toLowerCase()
    }
}

fun main() {
    // BUKAN INFIX
    val resultNoInfix = "Eko Kurniawan".to("UP")
    println(resultNoInfix)

    // INFIX
    val resultInfix = "Eko Kurniawan" to "UP"
    println(resultInfix)

    // sebelumnya kita pernah pake
    // downTo itu infix
    // CTRL + Klik downTo
    1000 downTo 1

}