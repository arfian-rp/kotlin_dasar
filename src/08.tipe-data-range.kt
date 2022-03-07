fun main() {
    //range => untuk membut array yang berisi data angka berurutan
    //1..1000 => range 1 sampai 1000
    val range = 1..100
    println(range)

    //OPERASI RANGE
    println(range.count()) //total data di range
    println(range.contains(40)) //mengecek apakh terdapat value tersebut
    println(range.first) //nilai pertama
    println(range.last) //nilai terakhir
    println(range.step) //nilai tiap tingkatan

    //RANGE TERBALIK
    val range2 = 100 downTo  1

    //STEP
    val range3 = 1..100 step 3
    val range4 = 100 downTo 1 step 3

}