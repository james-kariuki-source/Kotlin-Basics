fun main(){
    println(getMax(10,5,400,3,5,5,2,50))
}

fun getMax(first: Int, vararg others: Int): Int{
    var max = first
    for(i in others){
        if(i > max) max = i
    }
    return  max
}

/*
fun main(){
    println(getMax(others = *intArrayOf(24,54,43,34,6,400)))
}

fun getMax(first: Int = 100, vararg others: Int): Int{
    var max = first
    for(i in others){
        if(i > max) max = i
    }
    return  max
}*/
