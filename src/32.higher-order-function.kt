fun hello(value:String, transformer:(String)->String):String{
    //hof => function yang menggunakan function lain sebagai parameter atau mengembalikan function
    return "Hello ${transformer(value)}"
}
fun main() {
    println(hello("michael", {value:String -> value.uppercase()} ))
    println(hello("GHANI", {value:String -> value.lowercase()} ))

    //trailling lamda
    println(hello("Tyson"){value:String->
        value.uppercase()})
}