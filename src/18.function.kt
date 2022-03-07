fun helloWorld(){
    println("Hello, World!")
}
fun hello(name:String, value: Int?){ //tanda ? artinya tidak wajib
    if(value == null) println("Hi, $name")
    else println("Hi, $name. ${value}")
}
fun main() {
    helloWorld()
    helloWorld()
    helloWorld()

    hello("Rudy", null) //function param
    hello("Rudy",19)
}
