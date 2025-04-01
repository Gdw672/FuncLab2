fun main() {
    // Задание 1
    print("Введите число: ")
    val number = readLine()?.toIntOrNull() ?: 0
    println(roundNumber(number))

    // Задание 2
    print("Введите количество лет: ")
    val years = readLine()?.toIntOrNull() ?: 0
    println("$years ${getYearEnding(years)}")
}

fun roundNumber(number: Int): String {
    return when {
        number in 1000..9999 -> "${number / 1000}K"
        number < 1000 -> number.toString()
        else -> number.toString()
    }
}

fun getYearEnding(years: Int): String {
    return when {
        years % 100 in 11..14 -> "лет"
        years % 10 == 1 -> "год"
        years % 10 in 2..4 -> "года"
        else -> "лет"
    }
}