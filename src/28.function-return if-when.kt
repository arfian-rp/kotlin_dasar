fun main() {
    fun sayHello(name:String=""):String{
        return if (name==""){
            "Hello Bro"
        }else{
            "Hello $name"
        }
    }
    println(sayHello())
    println(sayHello("Arfian"))

    fun sayHello2(name:String=""):String{
        return when(name){
            ""->"Hello Bro"
            else->"Hello $name"
        }
    }
    println(sayHello2())
    println(sayHello2("Arfian"))
}