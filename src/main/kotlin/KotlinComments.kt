fun main(args: Array<String>) {
    var low = 20
    val high = 50

    while (low < high) {
        if (checkPrimeNumber(low))
            print(low.toString() + " ")

        ++low
    }
}
//This is an end of line comment
fun checkPrimeNumber(num: Int): Boolean {  //A function to check if value is a prime nmber
    var flag = true

    /* This is a block comment
    for (i in 2..num / 2) {

        if (num % i == 0) {
            flag = false
            break
        }
    }*/

    return flag
}
/** These are documentation comments

*In the above program, we've created a function named
*checkPrimeNumber() which takes a parameter num and
*returns a boolean value.
*If the number is prime, it returns true. If not, it returns false.
*Based on the return value, number is printed on the screen
*inside main() function.
*/
