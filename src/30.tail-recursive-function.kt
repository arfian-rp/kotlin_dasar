fun main() {
    //tailrec => apabila tidak tailrec maka akan terjadi stack overflow
    tailrec fun display(value:Int){ //automatic dicompile jadi loop
        println(value)
        if(value>0) display(value-1) //syaratnya harus memanggil diri sendiri
    }
    display(5)

    tailrec fun factorialTail(value:Int,total:Int=1):Int{
        return when(value){
            1->total
            else->factorialTail(value-1,total*value)
        }
    }
    println(factorialTail(10))
}