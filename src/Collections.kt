fun main(args: Array<String>) {
    var map= hashMapOf("nama_depan" to "Ahmad","nama_belakang" to "Jailani")
    map.put("nama_panggilan","Jae")
    println(map.get("nama_panggilan"))
    println(map["nama_panggilan"])

    var ar= arrayOf(1,10,22,11)
    println(ar[0])
    var list= mutableListOf(11,22,33,22)
    list[0]=22
    for(item in list){
        println(item)
    }
}