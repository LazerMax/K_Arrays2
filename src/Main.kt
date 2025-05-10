import kotlin.math.max
import kotlin.math.min

fun main() {
    // Задание 1
    println("-----Задание 1-----")
    val a = 5
    val b = 8

    val maxi = max(a, b)
    val mini = min(a, b)

    val mass = (mini..maxi).toList().toIntArray()

    println("Диапазон: $a - $b")
    println("Массив: ${mass.contentToString()}")

    // Задание 2
    println()
    println("-----Задание 2-----")

    val arr = mutableListOf<Int>()

    arr.addAll(listOf(8, 21, 5, 90, 11, 0))
    arr.add(0, 90)
    arr.removeAt(4)
    arr.add(-35)

    println("Измененный массив: ${arr.joinToString(", ")}")

    // Задание 3
    println()
    println("-----Задание 3-----")

    val num = mutableListOf<Int>()
    num.addAll(listOf(24, -63, 67, -12, 88, 94, -28, 82, 0, 53))

    val minim = num.minOrNull()
    val maxim = num.maxOrNull()

    println("Минимальный элемент: $minim")
    println("Максимальный элемент: $maxim")

    //Задание 4
    println()
    println("-----Задание 4-----")

    val num2 = listOf(24, -63, 67, -12, 88, 94, -28, 82, 0, 53)
    println("Второй самый маленький элемент: ${num2.sorted()[1]}")

    //Задание 5
    println()
    println("-----Задание 5-----")

    val num3 = listOf(24, -63, 67, -12, 88, 94, -28, 82, 0, 53)
    val sort_mas = num3.sorted()
    println("Отсортированный массив: $sort_mas")

    //Задание 6
    println()
    println("-----Задание 6-----")

    val numbers = listOf(5, 8, 18, 34, 3, 56, 43, 27, 4, 23)

    val sr_ar = numbers.average()
    println("Среднее арифметическое: $sr_ar")
    println("Элементы больше среднего:")

    for (i in numbers) {
        if (i > sr_ar) {
            println(i)
        }
    }
}