fun main() {
    fun faktorial(angka:Int):Int{
        if(angka==0||angka==1)return 1
        else if(angka==2)return 2
        else{
            return angka*faktorial(angka-1) //memanggil diri sendiri
        }
    }
    println(faktorial(2))
}