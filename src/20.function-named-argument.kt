fun fullName(firstName:String, lastName:String){
    println("$firstName $lastName")
}
fun main() {
    //named argument => fitur dimana bisa menyebutkan bama parameter saat memanggil function
    fullName(
        lastName = "messi",
        firstName = "lionel"
    )
}