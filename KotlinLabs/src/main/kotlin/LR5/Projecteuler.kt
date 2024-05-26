fun main() {
    fun sumOfDivisors(n: Int): Int {
        return (1 until n).filter { n % it == 0 }.sum()
    }

    val numbers = (1..9999).toList()

    val divisorSums = numbers.associateWith { sumOfDivisors(it) }

    val amicablePairs = divisorSums
        .filter { (a, b) -> a != b && divisorSums[b] == a }
        .keys
        .toSet()

    val sumOfAmicableNumbers = amicablePairs.sum()

    println("Количество всех пар дружных чисел до 10000: ${amicablePairs.size / 2}")
    println("Сумма всех пар дружных чисел до 10000: $sumOfAmicableNumbers")
}