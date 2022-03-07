fun funSejajarDgnMain(){
//dapat diakses dari file manapun
}
fun main() {
    fun sayHello(){ //inner function
        //cuma bisa diakses di function main ini
        println("Hello")
    }
    sayHello()
}