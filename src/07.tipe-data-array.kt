fun main() {
    //Array => tipe data yang berisikan kumpulan data dengan tipe yang sama
    //Array di kotlin tidak dinamis
    val members: Array<String> = arrayOf("arfian","ilham","joko")
    val values = arrayOf(100,200,300)//otomatis tipenya int
    println(members)
    println(values)

    //INDEX => sama seperti bahasa yang lain, dimulai dari 0

    //OPERASI ARRAY
    println(members.size) //panjang array
    println(members.get(0)) //ambil data index ke 0
    println(members[0]) //ambil data index ke 0
    members.set(2,"Hadi") //mengubah data di posisi index
    members[1] = "Kayla" //mengubah data di posisi index

    //ARRAY NULLABLE
    var arrayKosong: Array<String?> = arrayOfNulls(3) //size 3
    println(arrayKosong[0])
    println(arrayKosong[1])
    println(arrayKosong[2])
    arrayKosong[1] = "Wahyu"
    println(arrayKosong[1])
}