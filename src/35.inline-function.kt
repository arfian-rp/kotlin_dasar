inline fun helloInline(name:(String)->String):String{
    return "Hello, ${name("Beni")}"
}
inline fun helloInlineNoInline(first:(String)->String,
                               noinline last:(String)->String):String{
    //noinline digunakan apabila kita tidak ingin HOF tersebut dijadikan function biasa
    return "Hello, ${first("VLADIMIR")} ${last("petkovic")}"
}
fun main() {
    //menggunakan HOF akan berdampak pada peforma aplikasi
    //inline function adalah kemampuan kotlin mengubah HOS jadi function biasa
    //inline function tidak bisa ditaruh di local
    println(helloInline({value:String->value.uppercase()}))
    println(helloInlineNoInline({value:String->value.lowercase()}, {value:String->value.uppercase()}))
}