package LR5

import javax.swing.text.StyledEditorKit.BoldAction

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
    fun recursiveDigitOperation(
        num: Int,
        initialValue: Int,
        operation: (Int, Int) -> Int,
        filter: (Int) -> Boolean
    ): Int {
        return if (num == 0) initialValue else {
            if (filter(num % 10)) {
                operation(
                    num % 10,
                    recursiveDigitOperation(num / 10, initialValue, operation, filter)
                )
            } else {
                recursiveDigitOperation(num / 10, initialValue, operation, filter)
            }
        }


    }


//    Задача 7


//      Находит сумму простых делителей числа.
    fun reduceFilterList(list: List<Int>, operation: (Int, Int) -> Int, filter: (Int) -> Boolean, initValue: Int = 0, curIndex: Int = 0): Int {
        return if (curIndex == list.size) {
            initValue
        } else if (filter(list[curIndex])) {
            reduceFilterList(list, operation, filter, operation(list[curIndex], initValue), curIndex + 1)
        } else {
            reduceFilterList(list, operation, filter, initValue, curIndex + 1)
        }
    }
    fun sumNonPrimeDivisors(num: Int): Int {
        val divisors = findDivisors(num)
        return reduceFilterList(divisors, {el, acc -> el + acc}, {isPrime(it)})
    }

//      Нахождение всех делителей числа

    private fun findDivisors(number: Int): List<Int> {
        return if (number == 1) {
            listOf(1)
        } else {
            findDivisors(number, number - 1, mutableListOf())
        }
    }


//      Хвостовая рекурсия для нахождения всех делителей числа

    private tailrec fun findDivisors(
        originalNumber: Int,
        currentDivisor: Int,
        divisors: MutableList<Int>
    ): List<Int> {
        if (currentDivisor == 0) {
            return divisors
        }

        if (originalNumber % currentDivisor == 0) {
            divisors.add(currentDivisor)
        }

        return findDivisors(originalNumber, currentDivisor - 1, divisors)
    }

//      Находит все простые делители числа.
    fun isPrime (num: Int): Boolean {
        if (num == 1) return false
        return isPrime(num, 2)
    }


    fun isPrime (num: Int, currentnum: Int): Boolean {
        return if (num <= currentnum) {
            true
        } else if (num % currentnum == 0) {
            false
        } else {
            isPrime(num, currentnum + 1)
        }
    }


    fun countDigits(num: Int): Int = num.toString().length

    fun proizDivisorsCountDigits(num: Int): Int {
        val divisors = findDivisors(num)
        val sumDigits = recursiveDigitOperation(num, 0, {el, acc -> acc + el}, {true})
        return reduceFilterList(divisors, {el, acc -> acc * el}, {sumDigits > recursiveDigitOperation(it, 0, {el, acc -> acc + el}, {true})},1)

    }


    fun getFunction(functionName: String): ((Int) -> Int)? {
        return when (functionName) {
            "multiplyDigitsRecursiveUp" -> ::multiplyDigitsRecursiveUp
            "countOddDigitsAboveThreeRecursiveUp" -> ::countOddDigitsAboveThreeRecursiveUp
            "sumNonPrimeDivisors" -> ::sumNonPrimeDivisors
            else -> null
        }
    }


}
