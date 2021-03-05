fun main() {

    fun hello(name: String, transformer: (String) -> String): String{
        val nameTransform = transformer(name)
        return nameTransform
    }

    val toUpper = fun(name: String): String{
        if (name == ""){
            return "WOYYY"
        }else{
            return "${name.toUpperCase()}"
        }
    }

    println(hello("Wildan", fun(name: String): String{
        if(name == ""){
            return "WOOOOY"
        }else{
            return name.toUpperCase()
        }
    }))

}