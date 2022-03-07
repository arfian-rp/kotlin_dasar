fun main() {
    //membuat lamda
    val nameLamda: (String) -> String = {value:String ->
        value.uppercase()
    }
    val name = nameLamda("adi")
    println(name)

    //contoh yang lain
    val getFullName: (String,String)->String = {first:String, last:String ->
        "$first $last"
    }
    val fullName = getFullName("Vladimir","Petkovic")
    println(fullName)

    //it => apabila parameter cuma satu (wajib parameter satu)
    val sayHello: (String)->String = {
        "Hello $it" //it merepresentasikan parameter pertama (satu satunya)
    }
    println(sayHello("Dwi"))

    //method references
    fun toUpper(value:String):String = value.uppercase()
    val getUpperName:(String)->String = ::toUpper //reference ke function toUpper
    println(getUpperName("Icha"))

}