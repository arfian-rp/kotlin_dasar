package `37`.`package`.util

fun sayHello(name:String):String{
    return when{
        name.isBlank()->"Ups"
        else->"Hello, $name"
    }
}