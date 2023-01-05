fun main() {

    val a = readln().toInt()
    val b = readln().toInt()

    var result: Long = 1
    for (i in a until b) {

        result *= i.toLong()

    }

    println(result)


/*for(i in Int.MIN_VALUE until Int.MAX_VALUE ){
    for(j in Int.MIN_VALUE until Int.MAX_VALUE ){

        var result = i*j.toLong()
        println(result)

    }
                }*/
}