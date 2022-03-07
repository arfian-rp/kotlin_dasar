infix fun String.to(type:String):String{
    when(type){
        "UP"->return this.uppercase()
        else->return this.lowercase()
    }
}
fun main() {
    //infix notation => operasi yang biasa dilakukan di operasi matematika
    //f infix notation harus sebagai function extension
    //harus memiliki 1 param dan tidak memiliki varargs
    println("arfian" to "UP")
    println("ARFIAN".to("DOWN")) //juga bisa
}