fun main(args: Array<String>) {
    var map=HashMap<Int,String>()
    map.put(1,"Ahmad")
    map.put(2,"Jailani")
    println(map.get(2))

    map.put(2,"Unisnu Jepara")
    for (k in map.keys){
        println(map.get(k))
    }
    var map2=HashMap<String,String>()
    map2.put("nama_depan","Ahmad")
    map2.put("nama_belakang","Jailani")
    println(map2.get("nama_depan"))

    map2.put("nama_belakang","Unisnu Jepara")
    for(j in map2.keys){
        println(j+" "+map2.get(j))
    }
}