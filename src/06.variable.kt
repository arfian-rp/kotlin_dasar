    //CONSTANT => immutable data yang bisa diakses untuk keperluan global
    const val APP = "Belajar Kotlin" //wajib pakai val
    const val VERSION = "1.0.0" //kebiasaannya UPPER_CASE

fun main() {
    //mutable (bisa diubah, tipe data sama) => var
    //immutable (tidak bisa diubah) => val
    //val/var namaVariable:TipeData = isiVariable
    //*direkomendasikan pakai immutable

    var v1 = "HENDRA"

    //MUTABLE
    var name1: String = "Ardi"
    println(name1)
    name1 = "Syahrul"
//    name1 = 1 //error
    println(name1)

    //MUTABLE
    val name2: String = "Edi"
    println(name2)
//    name2 = "Syahrul" //error

    //NULLABLE
    //kotlin mendukung variable yang boleh null
    var fistName: String? = "Yuli" //tambahkan ?
    fistName = null //boleh null
//    println(fistName.length) //bisa error kalau null
    println(fistName?.length) //cara mengatasi

    //CONSTANT
    println("$APP v: $VERSION")
}