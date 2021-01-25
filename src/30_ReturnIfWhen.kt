/*

RETURN IF & WHEN

- Kadang salam sebuah function, kita sering menggunakan If expression
  atau when expression, lalu di dalam blok nya kita mengembalikan nilai untuk sebuah function
- Kotlin mendukung return if atau when, dimana fitur ini bisa mempermudah
  kita ketika ingin mengembalikan nilai dalam if atau when

===================================

KODE

fun sayHello(name: String = ""): String{
    return if(name == ""){
        "Hello Bro"
    }else{
        "Hello $name"
    }
}

sayHello("Eko")

 */

fun main() {

    fun sayHelloIf(name: String = ""): String{

        // RETURN IF

 /*
         BIASANYA KITA MEMBUATNYA
        if (name == ""){
            return "Hello Bro"
        }else{
            return "Hello $name"
        }

  */

        // KITA BISA
        return if (name == ""){
             "Hello Bro"
        }else{
             "Hello $name"
        }
    }

    println(sayHelloIf())
    println(sayHelloIf("Eko"))

    // ======================================

    // RETURN WHEN

    fun sayHelloWhen(name: String = ""): String{

/*
         BIASANYA KITA MEMBUATNYA
        when(name){
            "" -> return "Hello Bro!"
            else -> return "Hello $name"
        }

 */
        return when(name){
            "" -> "Hello Bro!"
            else -> "Hello $name"
        }
    }
}