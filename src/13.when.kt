fun main() {
    //dibahasa pemrograman lain namanya switch expression
    //di kotlin disebut when expression
    val finalExam = 'A'
    when(finalExam){
        'A' -> println("Amazing")
        'B' -> {
            println("Good")
        }
        'C' -> println("Not Bad")
        'D','E','F' -> println("Bad")
        else -> {
            println("Ups")
        }
    }

    //WHEN Expression In (apakah nilai tersebut ada didalam Array)
    val passValue = arrayListOf('A','B','C')
    when(finalExam){
        in passValue -> println("Pass")
        !in passValue -> println("Try Again")
    }

    //WHEN Expression Is (contoh cek tipe data)
    val nama = "Arfian"
    when(nama){
        is String -> println("ini String")
        !is String -> println("ini Bukan String")
    }

    //WHEN pengganti ifElse
    val examValue = 97
    when{
        examValue > 80 -> println("Good")
        examValue > 60 -> println("Nor Bad")
        else -> println("Try again next year")
    }
}