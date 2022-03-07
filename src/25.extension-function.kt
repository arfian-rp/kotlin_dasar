//function extension => kemampuan menambahkan function pada tipe data yang sudah ada
fun String.hello():String{
    return "Hello $this"
}
fun main() {
     val name = "Arfian"
    println(name.hello())
}

//harap bijak menggunakan extension function