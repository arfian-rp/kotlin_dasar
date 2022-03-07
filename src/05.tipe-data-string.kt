fun main() {
    var firstName: String = "Arfian"
    var lastName: String = "Pradana"
    var addr: String = """
        
        jalan belum jadi,
        RT 01 RW 01
        
    """.trimIndent() //trimIndent agar tidak ada tab
    //atau .trimMargin(*penanda default |*) tetapi ditambahkan |
    println(firstName)
    println(lastName)
    println(addr)

    //MENAMBAH STRING
    var fullName: String = firstName+" "+lastName
//    atau (TEMPLATE)
//    var fullName: String = "${firstName} ${lastName} ${10+1}"
//    var fullName: String = "$firstName $lastName"
    println(fullName)

    //TEMPLATE
    var desc: String = "$fullName length=${fullName.length}"
    println(desc)
}