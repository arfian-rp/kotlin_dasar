fun getFull(first:String, last:String):String{//mengembalikan string
    return "$first $last"
}
fun main() {
    val fullName = getFull("Dedi","Kurniawan")
    println(fullName)
}
