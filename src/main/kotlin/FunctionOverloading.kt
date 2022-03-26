fun main(){
    println(max(14, 6, 20))
}

fun max(x: Int, y:Int) = if(x > y) x else y

fun max(x: Double, y: Double) = if(x > y) x else y

fun max(x: Int, y: Int, z: Int) =
    when{
        x >= y && x >= z -> x
        y >= x && y >= z -> y
        else -> z
    }
