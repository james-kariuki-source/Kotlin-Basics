fun main(){
    var g = 1

  outer@  do{
        println(g)
        g++
        //continue

        var l = 0
        while(l <= 5){
            println("----$l")
            l++
            break@outer
            println("This should not be printed.")
        }
        println("This should be printed.")
    } while(g <= 5)
}

