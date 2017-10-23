fun main(args: Array<String>) {
    var arrayList= ArrayList<String>()
    arrayList.add("Ahmad")
    arrayList.add("Jailani")
    arrayList.add("Jepara")

    println("First Name : "+arrayList.get(0))
    println("all element by object")
    for(item in arrayList){
        println(item)
    }
    arrayList.set(0,"Unisnu Jepara")

    println("all element by Index")
    for(index in 0..arrayList.size-1){
        println(arrayList.get(index))
    }

    //Search
    if(arrayList.contains("Jailani")){
        println("Name Is Found")
    }else{
        println("Name is Not Found")
    }
}