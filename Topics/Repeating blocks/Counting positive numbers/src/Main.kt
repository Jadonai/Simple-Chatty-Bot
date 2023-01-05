fun main() {

    val lengthSeq = readln().toInt()
    var num = 0

    repeat(lengthSeq) {

        val entry = readln().toInt()
        if (entry > 0) {
            num += 1
        }
    }
    println(num)

}
