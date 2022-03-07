fun main() {
    var res1: Double = 10.0 + 1.0 - 2.0 * 8.0 % 3.0
    println(res1)

    var res2 = 10 * 10
    println(res2)

    //AUGMENTED ASSIGMENT
    res1 *= 134
    res1 /= 134
    res1 -= -134
    res1 += 4
    println(res1)

    //UNARY OPERATOR
    res2++
    println(res2)
    res2--
    println(res2)
    println(-res2) //jadi angka negatif
    println(+res2) //jadi angka postitif
    println(!true)

    //POST dan PRE
    var awal = 10
    println(awal++) //post => 10
    println(awal) //=>11
    println(++awal) //pre => 12
    println(awal) //=>12

}