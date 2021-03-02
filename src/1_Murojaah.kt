tailrec fun tailFactorialLoop(value: Int, total: Int = 1): Int{
    return when(value){
        1 -> total
        else -> tailFactorialLoop(value - 1, total * value)
    }
}

fun main() {

    println(tailFactorialLoop(10))

}