fun main(args: Array<String>) {
    var setElement= setOf(1,2,3,11,44,55,55)

    for (element in setElement){
        println(element)
    }

    var setEmenetM= mutableListOf(1,2,3,11,44,55,55)
    setEmenetM.add(77)
    for (element in setEmenetM){
        println(element)
    }
}
