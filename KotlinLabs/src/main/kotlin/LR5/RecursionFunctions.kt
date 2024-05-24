package LR5

class RecursionFunctions {

//    Найти произведение цифр числа с помощью рекурсии вверх

    fun multiplyDigitsRecursiveUp(num: Int): Int {
        return if (num == 0) 1 else num % 10 * multiplyDigitsRecursiveUp(num / 10)
    }

    //    Найти произведение цифр числа с помощью хвостовой рекурсии
    tailrec fun multiplyDigitsRecursiveDown(num: Int, product: Int = 1): Int {
        return if (num == 0) product else multiplyDigitsRecursiveDown(num / 10, product * (num % 10))
    }


//    Найти количество нечетных цифр числа, больших 3 с помощью рекурсии вверх

    fun countOddDigitsAboveThreeRecursiveUp(num: Int): Int {
        return if (num == 0) 0 else {
            val digit = num % 10
            val count = if (digit > 3 && digit % 2 != 0) 1 else 0
            count + countOddDigitsAboveThreeRecursiveUp(num / 10)
        }
    }

    //   Найти количество нечетных цифр числа, больших 3 с помощью хвостовой рекурсии
    tailrec fun countOddDigitsAboveThreeRecursiveDown(num: Int, count: Int = 0): Int {
        return if (num == 0) count else {
            val digit = num % 10
            countOddDigitsAboveThreeRecursiveDown(num / 10, if (digit > 3 && digit % 2 != 0) count + 1 else count)
        }
    }


//   Нахождение НОД двух чисел с помощью хвостовой рекурсии

    tailrec fun nodRecursiveDown(a: Int, b: Int): Int = if (b == 0) a else nodRecursiveDown(b, a % b)


    // Функция высшего порядка для рекурсивного вычисления операции над цифрами числа
    fun recursiveDigitOperation(num: Int, initialValue: Int, operation: (Int, Int) -> Int): Int {
        return if (num == 0) initialValue else operation(
            num % 10,
            recursiveDigitOperation(num / 10, initialValue, operation)
        )
    }



}

