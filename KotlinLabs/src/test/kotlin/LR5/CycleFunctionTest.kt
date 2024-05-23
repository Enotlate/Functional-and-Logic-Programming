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
}

    @Test
    fun testcountOddDigitsAboveThree(){
        val main = CycleFunction()
        assertEquals(1,main.countOddDigitsAboveThree(12345)) // Ожидаемый результат: 1
        assertEquals(3,main.countOddDigitsAboveThree(98765)) // Ожидаемый результат: 3
        assertEquals(0,main.countOddDigitsAboveThree(2468)) // Ожидаемый результат: 0
    }
    @Test
    fun testNOD() {
        val main = CycleFunction()
        assertEquals(6, main.nod(24, 18)) // Ожидаемый результат: 6
        assertEquals(25, main.nod(100, 75)) // Ожидаемый результат: 25
        assertEquals(4, main.nod(20, 28)) // Ожидаемый результат: 4
    }
}