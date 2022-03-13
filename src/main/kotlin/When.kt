fun main() {
    val hours = 14
    val isSunday = false

    val time = when {
        isSunday -> "I will sleep all day"
        hours < 5 -> "Why up so early?"
        hours in 1..10  -> "Good morning!"
        hours == 12 -> "Time for lunch!"
        hours == 13 || hours == 14 -> {
            println("Yawn")
            "Time for some rest."
        }
        else -> "Good day!"
    }
    println(time)
}