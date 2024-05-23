package LR5

class CycleFunction {

//    Найти произведение цифр числа.

    fun multiplyDigits(num: Int): Int {
        var product = 1
        var n = num
        while (n != 0) {
            product *= n % 10
            n /= 10
        }
        return product
    }


//Найти количество нечетных цифр числа, больших 3

    fun countOddDigitsAboveThree(num: Int): Int {
        var count = 0
        var n = num
        while (n != 0) {
            val digit = n % 10
            if (digit > 3 && digit % 2 != 0) {
                count++
            }
            n /= 10
        }
        return count
    }

//    Найти НОД двух чисел.

    fun nod(a: Int, b: Int): Int {
        var x = a
        var y = b
        while (y != 0) {
            val temp = y
            y = x % y
            x = temp
        }
        return x
    }

}