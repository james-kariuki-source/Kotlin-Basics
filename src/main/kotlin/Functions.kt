fun main(){
    val max = getMax(12, 6)
    hello("Elanga")
    println(max)
    println(getDouble(12))
}

fun hello(name: String){
    println("Hello $name, Welcome to this kotlin file.")
}

fun getMax(num1: Int, num2: Int): Int{
    return if(num1 > num2){
        num1
    } else{
        num2
    }
}

//Single expression function
fun getDouble(multi: Int) = multi*2