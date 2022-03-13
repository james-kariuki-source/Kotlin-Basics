fun main(){
    for(i in 1..10) {
        val before = if (i == 1){
            "*"
            }
            else if(i in 4..7){
                "->"
            }
            else{
                "-"
            }
        println("$before $i")
    }
}

/*fun main() {
    val hours = 16
    val time = if (hours in 0..10) {
        "Good morning!"
    } else if (hours == 12) {
        "Time for lunch!"
    } else if (hours < 0 || hours > 24) {
        "Invalid time"
    } else {
        "Good day!"
    }

    println("It's $hours hundred hours, $time")
}*/
