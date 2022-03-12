fun main() {
    val animals = arrayOf("Dog", "Tiger", "Panther", "Elephant", "Hare")

    for(index in animals.indices) {
        println("Index $index Element: ${animals[index]}")
    }
}