fun main() {
    val user1 = User("James", 26)
    val user2 = User("Beatrice", 22)

    println("His name is ${user1.name}")
    println("Her name is ${user2.name}")
    println("She is ${user2.age} yours old.")
    println("He is ${user1.age} yours old.")
}

class User(val name: String, var age: Int){
}