/*

BREAK AND CONTINUE

- Break & Continue adalah kata kunci yang bisa digunakan dalam semua perulangan di Kotlin
- Break digunakan untuk menghentikan seluruh perulangan
- Continue adalah digunakan untuk mengehntikan perulangan yang berjalan, dan langsung
  melanjutkan ke perulangan selanjutnya

 */

fun main() {

    // ================================================================

    // BREAK

    var i = 0
    while (true){   // tidak akan pernah berhenti jika tidak pakai break
        println("Break Me")
        i++
        if (i > 1000){
            break
        }
    }

     // ===============================================================

    // CONTINUE

    for (i in 1..1000){
        if (i % 2 == 0){
            continue
        }
        println(i)
    }




}