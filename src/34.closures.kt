fun main() {
    //closure => kemampuan function berinteraksi dengan data disekitarnya
    var counter:Int=0
    val lamdaIncrement:()->Unit={
        println("Increment")
        counter++
    }

     lamdaIncrement()
     lamdaIncrement()
     lamdaIncrement()
     println(counter)
}