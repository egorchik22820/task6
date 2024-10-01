fun main() {
    // Ввод первой цифры
    println("Введите первую цифру:")
    val digit1 = readLine()?.toIntOrNull()

    // Ввод второй цифры
    println("Введите вторую цифру:")
    val digit2 = readLine()?.toIntOrNull()

    // Проверка на корректность ввода и диапазон от 0 до 9
    if (digit1 == null || digit2 == null || digit1 !in 0..9 || digit2 !in 0..9) {
        println("Введены некорректные цифры.")
        return
    }

    // Проверка, что цифры разные
    if (digit1 == digit2) {
        println("Цифры должны быть различными.")
        return
    }


    if (digit1 % 2 != 0 && digit2 % 2 != 0) {
        println("Можно создать нечетное число: ${digit2}${digit1} или ${digit1}${digit2}")
    } else if (digit1 % 2 != 0) {
        println("Можно создать нечетное число: ${digit2}${digit1}")
    } else if (digit2 % 2 != 0) {
        println("Можно создать нечетное число: ${digit1}${digit2}")
    } else {
        println("Создать нечетное число невозможно.")
    }
}
