fun main() {
    //For => digunakan melakukan perulangan iterasi dari data iterator
    val hewans = arrayOf("Sapi","Macan","anjing")
    for(hewan in hewans){
        println(hewan)
    }

    //For Range
    for(value in 1..10 step 3){
        println(value)
    }
}