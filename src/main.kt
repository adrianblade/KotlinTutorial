/**
 * Created by Adrian on 02/04/2017.
 */
fun main(args: Array<String>) {
    println("Hello World")
    addTwoNumbers(first = 2, second = 3)
    println(addNumbers(1, 2, 3, 4, 5, 6))
}

fun printHello() {
    println("Hello")
}


fun addTwoNumbers(first: Int, second: Int): Int {
    return first + second;
}

fun addNumbers(vararg numbers: Int): Int {
    return numbers.sum();
}