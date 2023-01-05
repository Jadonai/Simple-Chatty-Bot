import kotlin.math.abs
import kotlin.math.absoluteValue

// write your code here

/* Do not change code below */
fun main() {
    val a = readLine()!!.toInt()
    println((getLastDigit(a)).absoluteValue)
}

fun getLastDigit(a: Int)= a % 10
