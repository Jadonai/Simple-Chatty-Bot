fun main() {

    val first = readln().toInt()
    val second = readln().toInt()

    val firstRange: IntRange = first..second

    val third = readln().toInt()
    val fourth = readln().toInt()

    val secondRange: IntRange = third..fourth

    val fifth = readln().toInt()

    if (fifth in firstRange || fifth in secondRange) {
        println(true)
    } else {
        println(false)
    }
}
