/*
LABEL

- Label adalah penanda
- Semua expression di Kotlin bisa ditandai dengan label
- Untuk membuat label di Kotlin, cukup menggunakan nama label lalu diikuti dengan karakter @
  tanpa spasi

KODE: LABEL

    fun main(){
        loopI@ for (i in 1..10) {
            loopJ@ for (j in..10){
                println("$i x $j = ${i * j}")
            }
        }
    }

====================================================================

GUNANYA UNTUK APA?

Break, Continue dan Return

- Salah satu kegunaan label adalah, bisa diintegrasikan dengan break,
  continue dan return
- Biasanya break, continue dan return hanya bisa menghentikan proses
  di blok kode tempat mereka berada, namun dengan menggunakan label,
  kita bisa menentukan ke label mana kode akan berhenti

======================================================================

KODE: BREAK TO LABEL

    fun main(){
        loopI@ for (i in 1..10){
            loopJ@ for (j in 1..10){
                println("$i x $j = ${i * j}")
                if (j == 10){
                    break@loopI
                    // kalo cuman break doang. maka yang akan berhenti adalah pengulangan J
                    // tapi dengan adanya label kita bisa break loopI
                }
            }
        }
    }

========================================================================

KODE: CONTINUE TO LABEL

    fun main(){
        loopI@for(i in 1..10){
            loopJ@for(j in 1..10){
                if (j == 5){
                    continue@loopI
                }
                println("$i * $j = ${i * j}")
            }
        }
    }

OUTPUT :
1 * 1 = 1
1 * 2 = 2
1 * 3 = 3
1 * 4 = 4
2 * 1 = 2
2 * 2 = 4
2 * 3 = 6
2 * 4 = 8
3 * 1 = 3
3 * 2 = 6
3 * 3 = 9
3 * 4 = 12
4 * 1 = 4
4 * 2 = 8
4 * 3 = 12
4 * 4 = 16
5 * 1 = 5
5 * 2 = 10
5 * 3 = 15
5 * 4 = 20
6 * 1 = 6
6 * 2 = 12
6 * 3 = 18
6 * 4 = 24
7 * 1 = 7
7 * 2 = 14
7 * 3 = 21
7 * 4 = 28
8 * 1 = 8
8 * 2 = 16
8 * 3 = 24
8 * 4 = 32
9 * 1 = 9
9 * 2 = 18
9 * 3 = 27
9 * 4 = 36
10 * 1 = 10
10 * 2 = 20
10 * 3 = 30
10 * 4 = 40

================================================================

KODE: RETURN TO LABEL

    fun test(name: String, param: (String) -> Unit): Unit = param(name)
    fun main(){
        test("name") testLabel@{
            if (it == "eko"){
                return@testLabel
            }
        }
        println("Eko")
    }

*/


fun labelBreak(){
    loopI@for(i in 1..10){
        loopJ@for(j in 1..10){
            if (i > 5){
                break@loopI
            }
            println("$i * $j = ${i * j}")
        }
    }
}

fun labelContinue(){

        loopI@for(i in 1..10){
            loopJ@for(j in 1..10){
                if (j == 5){
                    continue@loopI
                }
                println("$i * $j = ${i * j}")
            }
        }

}

fun main() {

    fun test(name: String, operation: (String)-> Unit): Unit{
        operation(name)
    }
//    test("Eko"){
//        if(it == ""){
//            //return // gk bisa karena lambda
//        }else{
//            println("Eko")
//        }
//    }

    // bisa kalo kita tambahin label

    test("Eko") test@{
        if(it == ""){
            return@test
        }else{
            println("Eko")
        } 
    }

    // ini cuman akal akalan aja supaya bisa pakai return di lambda
    // mas eko sendiri jarang pake label
    // karena kalo semakin banyak label kita semakin susah ngetrak kemana yaa break nya

}