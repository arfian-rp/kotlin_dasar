fun main() {
    //dapat digunakan disemua perulangan
    for(value in 1..100){
        if(value==3) continue //berhenti perulangan yang sedang berjalan dan langsung melanjutkan ke perulangan selanjutnya
        println("Loop ke $value")
        if(value==7) break //berhenti dari seluruh perulangan
    }
}