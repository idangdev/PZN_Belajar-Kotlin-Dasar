/*

FUNCTION RETURN TYPE

- Seperti yang sudah dibahas sebelumnya, bahwa function itu bisa mengembalikan data
- Untuk memberitahu bahwa function mengembalikan data, kita harus menuliskan tipe data
  kembalian dari function tersebut
- Jika function tersebut kita deklarasikan dengan tipe data pengembalian, maka wajib di dalam
  function nya kita harus mengembalikan data
- Untuk mengembalikan data dari function, kita bisa menggunakan kata kunci return, diikuti dengan datanya

 */

fun jumlahkan(a: Int, b: Int): Int{
    val total = a + b
    return total
}

// return didalam if else
fun bagi(a: Int, b: Int): Int{
    if(b == 0){
        return 0
    }else {
        val result = a / b
        return result
    }

}

fun main(){

    // MEMANGGIL FUNCTION JUMLAHKAN

    println(jumlahkan(10, 10))
    println(jumlahkan(100, 100))

    val result = jumlahkan(200, 200)
    println(result)

    // terbuang sia - sia
    // karena datanya tidak ditampung di variabel ataupun di masukkan sebagai value parameter
    jumlahkan(5,5)

    // ============================

    // MEMANGGIL FUNCTION BAGI

    println(bagi(100, 10))
    println(bagi(100, 0))     // akan error , karena tidak bisa dibagi 0,
                                    // jd kita harus menambahkan if else pada function bagi

}