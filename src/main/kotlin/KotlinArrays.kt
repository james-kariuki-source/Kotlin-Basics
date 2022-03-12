fun main() {
    val names = arrayOf("Jane", "Pete", "Joe","Sue", "Josh")
    val numbers = arrayOf(
        arrayOf(4,5,3),
        arrayOf(9,6,2),
        arrayOf(4,7,0)
    )

    names[0] = "Trixie"

    println("The first element is: ${names[0]}")
    println("The last element is: ${names[names.size - 1]}")
    println("The last element is: ${names[names.lastIndex]}")
    println("The last element is: ${names.last()}")
    println(names[0][3])
    println("String length is: ${names[0].length}")
    println("No of elements in the array is: ${names.size}")

    println("Element of numbers array: ${numbers[1][1]}")
}