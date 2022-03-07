fun main() {
    val getJam:(Int)->String = {
        "Total = ${it/3600} : ${(it%3600)/60} : ${((it%3600)%60)}"
    }
    val getDetik = fun(jam:Int, menit:Int, detik:Int): Int{
        return jam*3600+menit*60+detik
    }
    fun getTotal(vararg values:Int):Int{
        var total = 0
        for(value in values){
            total += value
        }
        return total
    }
    println(getJam(getTotal(
        getDetik(0,15,29),
        getDetik(0,10,5),
        getDetik(0,3,8),
        getDetik(0,2,32),
        getDetik(0,11,52),
        getDetik(0,17,12),
        getDetik(0,13,12),
        getDetik(0,7,58),
        getDetik(0,10,16),
        getDetik(0,5,44),
        getDetik(0,8,5),
        getDetik(0,9,53),
        getDetik(0,14,57),
        getDetik(0,10,59),
        getDetik(0,5,17),
        getDetik(0,4,33),
        getDetik(0,7,15),
        getDetik(0,5,49),
        getDetik(0,6,39),
        getDetik(0,6,25),
        getDetik(0,6,26),
        getDetik(0,4,52),
        getDetik(0,7,43),
        getDetik(0,4,54),
        getDetik(0,8,2),
        getDetik(0,6,8),
        getDetik(0,7,23),
        getDetik(0,4,21),
        getDetik(0,5,19),
        getDetik(0,8,3),
        getDetik(0,16,11),
        getDetik(0,11,36),
        getDetik(0,9,2),
        getDetik(0,5,53),
        getDetik(0,6,2),
        getDetik(0,13,33),
        getDetik(0,11,6),
        getDetik(0,10,52),
        getDetik(0,5,14),
        getDetik(0,5,24),
        getDetik(0,2,20),
    )))
}