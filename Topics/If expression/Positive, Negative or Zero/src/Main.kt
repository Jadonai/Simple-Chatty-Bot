fun main() {

    val entry = readln().toInt()

    if (entry >= Int.MIN_VALUE && entry <= Int.MAX_VALUE) {
        if (entry < 0) {
            println("negative")
        } else if (entry == 0) {
            println("zero")
        } else {
            println("positive")
        }
    }

}
