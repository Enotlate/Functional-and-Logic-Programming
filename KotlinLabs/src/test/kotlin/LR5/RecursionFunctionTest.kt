package LR5

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
class RecursionFunctionTest {

    @Test
    fun testmultiplyDigitsRecursiveUp(){
        val main = RecursionFunctions()
        assertEquals(120,main.multiplyDigitsRecursiveUp(12345)) // Ожидаемый результат: 120
        assertEquals(3024,main.multiplyDigitsRecursiveUp(9876)) // Ожидаемый результат: 3024
        assertEquals(3125,main.multiplyDigitsRecursiveUp(55555)) // Ожидаемый результат: 3125
        assertEquals(1,main.multiplyDigitsRecursiveUp(11111)) // Ожидаемый результат: 1
        assertEquals(432,main.multiplyDigitsRecursiveUp(43433)) // Ожидаемый результат: 432
        assertEquals(5184,main.multiplyDigitsRecursiveUp(99881)) // Ожидаемый результат: 5184
    }

    @Test
    fun testmultiplyDigitsRecursiveDown(){
        val main = RecursionFunctions()
        assertEquals(120,main.multiplyDigitsRecursiveDown(12345)) // Ожидаемый результат: 120
        assertEquals(3024,main.multiplyDigitsRecursiveDown(9876)) // Ожидаемый результат: 3024
        assertEquals(3125,main.multiplyDigitsRecursiveDown(55555)) // Ожидаемый результат: 3125
        assertEquals(1,main.multiplyDigitsRecursiveDown(11111)) // Ожидаемый результат: 1
        assertEquals(432,main.multiplyDigitsRecursiveDown(43433)) // Ожидаемый результат: 432
        assertEquals(5184,main.multiplyDigitsRecursiveDown(99881)) // Ожидаемый результат: 5184
    }

    @Test
    fun testcountOddDigitsAboveThreeRecursiveUp(){
        val main = RecursionFunctions()
        assertEquals(1,main.countOddDigitsAboveThreeRecursiveUp(12345)) // Ожидаемый результат: 1
        assertEquals(3,main.countOddDigitsAboveThreeRecursiveUp(98765)) // Ожидаемый результат: 3
        assertEquals(0,main.countOddDigitsAboveThreeRecursiveUp(2468)) // Ожидаемый результат: 0
        assertEquals(2,main.countOddDigitsAboveThreeRecursiveUp(56784)) // Ожидаемый результат: 2
        assertEquals(1,main.countOddDigitsAboveThreeRecursiveUp(45321)) // Ожидаемый результат: 2
        assertEquals(5,main.countOddDigitsAboveThreeRecursiveUp(55555)) // Ожидаемый результат: 5
    }

    @Test
    fun testcountOddDigitsAboveThreeRecursiveDown(){
        val main = RecursionFunctions()
        assertEquals(1,main.countOddDigitsAboveThreeRecursiveDown(12345)) // Ожидаемый результат: 1
        assertEquals(3,main.countOddDigitsAboveThreeRecursiveDown(98765)) // Ожидаемый результат: 3
        assertEquals(0,main.countOddDigitsAboveThreeRecursiveDown(2468)) // Ожидаемый результат: 0
        assertEquals(2,main.countOddDigitsAboveThreeRecursiveDown(56784)) // Ожидаемый результат: 2
        assertEquals(1,main.countOddDigitsAboveThreeRecursiveDown(45321)) // Ожидаемый результат: 2
        assertEquals(5,main.countOddDigitsAboveThreeRecursiveDown(55555)) // Ожидаемый результат: 5
    }

    @Test
    fun testnodRecursiveDown() {
        val main = RecursionFunctions()
        assertEquals(6, main.nodRecursiveDown(24, 18)) // Ожидаемый результат: 6
        assertEquals(25, main.nodRecursiveDown(100, 75)) // Ожидаемый результат: 25
        assertEquals(4, main.nodRecursiveDown(20, 28)) // Ожидаемый результат: 4
        assertEquals(5, main.nodRecursiveDown(100, 55)) // Ожидаемый результат: 5
        assertEquals(8, main.nodRecursiveDown(64, 24)) // Ожидаемый результат: 8
        assertEquals(9, main.nodRecursiveDown(81, 18)) // Ожидаемый результат: 9
    }




    @Test
    fun testRecursiveDigitOperation() {
        val main = RecursionFunctions()
        // Тест для умножения цифр числа
        assertEquals(2, main.recursiveDigitOperation(12, 1) { digit, product -> digit * product })
        assertEquals(3, main.recursiveDigitOperation(3, 1) { digit, product -> digit * product })
        assertEquals(1, main.recursiveDigitOperation(0, 1) { digit, product -> digit * product })

        // Тест для подсчета нечетных цифр больше 3
        assertEquals(1, main.recursiveDigitOperation(12345, 0) { digit, count ->
            count + if (digit > 3 && digit % 2 != 0) 1 else 0
        })
        assertEquals(0, main.recursiveDigitOperation(24680, 0) { digit, count ->
            count + if (digit > 3 && digit % 2 != 0) 1 else 0
        })
        assertEquals(3, main.recursiveDigitOperation(13579, 0) { digit, count ->
            count + if (digit > 3 && digit % 2 != 0) 1 else 0
        })
    }
}