package topics

import java.util.*

fun main() {
    println(getLengthWithNull(null))
}

fun say(text: String): Unit {
    for (item in text.split("")) println(item)
}

fun reverseAndCheck(text: String) = text == StringBuilder(text).reverse().toString()

fun strikePrint(text: String, count: Int): Unit {
    for (i in 1..count) {
        println(text)
        Thread.sleep(1000)
    }
}

fun printOnlyEven(vararg numbers: Int): Unit =
    numbers.forEach { number -> if (number%2 == 0) print(number) }

fun <T> getLengthWithNull(numbers: T?): Int = (numbers?.toString())?.length ?: -1
