fun main() {
    //label => penanda
    //membuat label di kotlin, cukup dengan menambahkan nama label diikuti dengan char @
    //fungsi label adalah bisa diintegrasikan dengan break continue dan return

    loopI@ for(i in 1..5){
        loopj@ for(j in 1..5){
            println("$i x $j = ${i*j}")
            if(j==3){
                break@loopI //menghentikan loopI
            }
        }
    }
}