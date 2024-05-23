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
    }

    @Test
    fun testmultiplyDigitsRecursiveDown(){
        val main = RecursionFunctions()
        assertEquals(120,main.multiplyDigitsRecursiveDown(12345)) // Ожидаемый результат: 120
        assertEquals(3024,main.multiplyDigitsRecursiveDown(9876)) // Ожидаемый результат: 3024
        assertEquals(3125,main.multiplyDigitsRecursiveDown(55555)) // Ожидаемый результат: 3125
    }

    @Test
    fun testcountOddDigitsAboveThreeRecursiveUp(){
        val main = RecursionFunctions()
        assertEquals(1,main.countOddDigitsAboveThreeRecursiveUp(12345)) // Ожидаемый результат: 1
        assertEquals(3,main.countOddDigitsAboveThreeRecursiveUp(98765)) // Ожидаемый результат: 3
        assertEquals(0,main.countOddDigitsAboveThreeRecursiveUp(2468)) // Ожидаемый результат: 0
    }

    @Test
    fun testcountOddDigitsAboveThreeRecursiveDown(){
        val main = RecursionFunctions()
        assertEquals(1,main.countOddDigitsAboveThreeRecursiveDown(12345)) // Ожидаемый результат: 1
        assertEquals(3,main.countOddDigitsAboveThreeRecursiveDown(98765)) // Ожидаемый результат: 3
        assertEquals(0,main.countOddDigitsAboveThreeRecursiveDown(2468)) // Ожидаемый результат: 0
    }

    @Test
    fun testnodRecursiveDown() {
        val main = RecursionFunctions()
        assertEquals(6, main.nodRecursiveDown(24, 18)) // Ожидаемый результат: 6
        assertEquals(25, main.nodRecursiveDown(100, 75)) // Ожидаемый результат: 25
        assertEquals(4, main.nodRecursiveDown(20, 28)) // Ожидаемый результат: 4
    }

}