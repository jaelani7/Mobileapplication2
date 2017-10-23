fun main(args: Array<String>) {
    for(i in 1..5){
        for(x in 1..5)
            print("*")
        println(" ")
    }

    for(i in 1..5){
        for(x in 1..i)
            print("*")
        println()
    }

    for(i in 1..5){
        for(x in i..4)
            print(" ")
            for(k in 1..i)
                print("*")
        println("")
    }
}