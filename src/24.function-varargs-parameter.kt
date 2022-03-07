//varags harus ditempatkan di paling kanan
fun finalValue(name:String, vararg values:Int){ //values otomatis jadi  array
    var total = 0
    for(value in values){
        total+=value
    }
    total/=values.size
    println("Final Values $name = $total")
}

fun main() {
    finalValue("Arfian",10,10,10,10,9,9,10)
    finalValue("Rudy",10,9,9,7)
}