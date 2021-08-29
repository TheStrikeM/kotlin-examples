package yandex

import topics.Classes

fun main() {
    println(concatAndRemove(listOf<Int>(1,2,5,7,9,50).toIntArray(), listOf<Int>(1,3,7).toIntArray()))
}

fun concatAndRemove(firstArray: IntArray, secondArray: IntArray): IntArray {
    val resultArray: MutableList<Int> = mutableListOf();
    firstArray.forEach { item ->
        run {
            secondArray.forEach { secondItem ->
                run {
                    if (item == secondItem) resultArray.add(item)
                }
            }
        }
    }
    println(resultArray)
    return resultArray.toIntArray()
}
