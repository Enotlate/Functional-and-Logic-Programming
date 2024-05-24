package LR5

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
class CycleFunctionTest {

    @Test
    fun testmultiplyDigits(){
        val main = CycleFunction()
        assertEquals(120,main.multiplyDigits(12345)) // Ожидаемый результат: 120
        assertEquals(3024,main.multiplyDigits(9876)) // Ожидаемый результат: 3024
        assertEquals(3125,main.multiplyDigits(55555)) // Ожидаемый результат: 3125
        assertEquals(1,main.multiplyDigits(11111)) // Ожидаемый результат: 1
        assertEquals(432,main.multiplyDigits(43433)) // Ожидаемый результат: 432
        assertEquals(5184,main.multiplyDigits(99881)) // Ожидаемый результат: 5184
}

    @Test
    fun testcountOddDigitsAboveThree(){
        val main = CycleFunction()
        assertEquals(1,main.countOddDigitsAboveThree(12345)) // Ожидаемый результат: 1
        assertEquals(3,main.countOddDigitsAboveThree(98765)) // Ожидаемый результат: 3
        assertEquals(0,main.countOddDigitsAboveThree(2468)) // Ожидаемый результат: 0
        assertEquals(2,main.countOddDigitsAboveThree(56784)) // Ожидаемый результат: 2
        assertEquals(1,main.countOddDigitsAboveThree(45321)) // Ожидаемый результат: 2
        assertEquals(5,main.countOddDigitsAboveThree(55555)) // Ожидаемый результат: 5
    }
    @Test
    fun testNOD() {
        val main = CycleFunction()
        assertEquals(6, main.nod(24, 18)) // Ожидаемый результат: 6
        assertEquals(25, main.nod(100, 75)) // Ожидаемый результат: 25
        assertEquals(4, main.nod(20, 28)) // Ожидаемый результат: 4
        assertEquals(5, main.nod(100, 55)) // Ожидаемый результат: 5
        assertEquals(8, main.nod(64, 24)) // Ожидаемый результат: 8
        assertEquals(9, main.nod(81, 18)) // Ожидаемый результат: 9
    }
}