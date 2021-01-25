/*

FUNCTION VARARGS PARAMETER

Varargs (Variabel Argument)

- Parameter yang berada di posisi terakhir, memiliki kemampuan dijadikan sebuah VARARGS
- Varargs artinya datanya bisa menerima lebih dari satu input, atau anggap saja semacam Array.
- Apa bedanya dengan parameter biasa dengan tipe data Array?
    - Jika parameter tipe Array, kita wajib membuat array terlebih dahulu sebelum mengirimkan ke function
    - Jika parameter menggunakan varargs, kita bisa langsung mengirim data nya, jika lebih dari satu,
      cukup gunakan tanda koma


CATATAN

- Kemampuan ini diturunkan oleh Java
- Parameter paling belakang, bisa dibikin VARARGS
- Kenapa tidak dibikin array saja?
    - Karena bikin array itu ribet


fun finalValue(name: String, vararg values: Int){       // harus paling belakang. dan bukan sebagai Integer lg
    var total = 0.0                                     // melainkan jd Array = arrayOf(Int)
    for(value in values){
        total += value
    }
    total /= values. size
    println("Final Value $name = $total")
}

===============================================

ERROR

fun hitungTotal(vararg values: Int, name: String){
    // . . .
}

karena vararg wajib berada di paling belakang

 */

fun hitungTotalArray(values: Array<Int>): Int{
    var total = 0

    for(value in values){
        total += value
    }

    return total
}

fun hitungTotalVarargs(vararg values: Int): Int{
    var total = 0

    for (value in values){
        total += value
    }

    return total
}

fun main() {

    // ARRAY

    // Kalo pake array. kita harus bikin variabel array dulu
    val valuesArray = arrayOf(10,10,10,10)
    val resultArray = hitungTotalArray(valuesArray)

    println(resultArray)


    // VARARGS

    // Disini gk perlu bikin variabel seperti diatas
    // dan semua data hitungTotalVarargs(10,10,10,10) akan otomatis dikonversi menjadi array
    // ketika masuk kedalam parameter hitungTotal(vararg values: Int)
    val resultVarargs = hitungTotalVarargs(10,10,10,10)
    println(resultVarargs)

    // ============================================================

    // Kita juga bisa mengosongkan datanya. itu berarti kita memberikan nilai 0 (jadi ini gk wajib)
    val resultVarargs2 = hitungTotalVarargs()
    println(resultVarargs2)
}
