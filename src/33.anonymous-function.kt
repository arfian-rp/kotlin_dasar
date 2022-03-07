fun main() {
    //Lamda => baris terakhir sebagai return (tidak fleksible)
    //Anonymous function digunakan agar dapat sefleksible function
    val anonymousUpper = fun(value:String):String{
        return when{
            value.isBlank()->"Ups"
            else->value.uppercase()
        }
    }
    println(anonymousUpper("hendrich"))
}