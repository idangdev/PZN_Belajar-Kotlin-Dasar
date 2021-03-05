/*

ANONYMOUS FUNCTION
- Lambda akan menganggap baris terakhir di blok lambda sebagai hasil kembalian
- Kadang kita butuh membuat lambda yang se flexible function, dimana kita bisa mengembalikan
  hasil dimanapun
- Untuk hal ini, kita bisa menggunakan Anonymous Function
- Anonymous Function sebenarnya mirip dengan lambda, hanya cara membuatnya saja yang sedikit beda,
  masing menggunakan kata kunci fun


PENJELASAN MAS EKO

- Seperti yang sebelumnya kita bahas. Blok terakhir yang ada pada lambda akan dijadikan return value nya
- Lambda di Kotlin itu tidak bisa menggunakan kata kunci return. jadi contohnya
       if(){
            return "Hlellel"
       }
  ini tidak bisa
- Trus gimana kalo kita pengen bikin mirip seperti lambda tetapi pengen flexible mungkin seperti kita
  bikin function pada umumnya.
- Lambda itu cocoknya untuk kasus yang sederhana
- Kalo kita bikin kasus yang kompleks bgt bikin function nya, itu tidak bisa menggunakan lambda
- Jadi kita bisa menggunakan Fitur ANONYMOUS FUNCTION untuk mengatasi permasalah ini


==============================================================

KODE: ANONYMOUS FUNCTION

    fun main(){
        val anonymousUpper = fun(value: String): String{
            if(value.isBlank()) {
                return "Ups"
            }
            return value.toUpperCase()
        }

        val result1 = hello("Eko", anonymousUpper)
    }


- Jadi mirip banget seperti kita membuat function biasa
- Hanya saja tidak ada nama function nya
        val anonymousUpper = fun(blablabla)


==================================================================
KODE : ANONYMOUS FUNCTION AS PARAMETER

    fun main(){
        val result1 = hello("Eko", fun(value: String): String{
            if(value.isBlank){
                return "UPS"
            }
            return value.toUpperCase()
        })
    }

 */

fun main() {

    // HIGH-ORDER FUNCTIONS
    fun hello(name: String, transformer: (String) -> String): String{
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    // ANONYMOUS FUNCTION
    val upper = fun(value: String): String{
        if(value == ""){
            return "UPS"
        }else{
            return value.toUpperCase()
        }
    }

    // kode diatas tidak bisa dengan lambda
    // ERROR
//    val upper2 = { value: String ->
//        if(value == ""){
//            return "UPS"
//        }else{
//            return value.toUpperCase()
//        }
//    }


    // MENGAKSES
    println(hello("Eko", upper))
    println(hello("", upper))

// =====================================================

    // Kita juga bisa langsung memasukkan anonymous function kedalam kurung
    println(hello("", fun(value: String): String{
        if (value == ""){
            return "UPS"
        }
        return value.toUpperCase()
    }))


    // KITA ADA 2 PILIHAN DI KOTLIN
        // 1. Bisa bikin Lambda dengan penggunaan sederhana
        // 2. Bisa bikin Anonymous function untuk yang lebih kompleks
}


