/*
 * Complete the 'birthdayCakeCandles' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY candles as parameter.
 */

fun birthdayCakeCandles(candles: Array<Int>): Int {
    var max = -1
    for (i in candles.indices) {
        if (candles[i] > max)
            max = candles[i]
    }

    return getCountOfElementInArray(candles, max)
}

fun getCountOfElementInArray(array: Array<Int>, number: Int): Int {
    var count = 0
    array.forEach {
        if (it == number)
            count++
    }
    return count
}

fun main() {
    val candles = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = birthdayCakeCandles(candles)

    println(result)
}
