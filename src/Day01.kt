//https://adventofcode.com/2021/day/1

fun main() {
    fun part1(input: List<String>): Int {
        return input.windowed(2).count { (a, b) -> a < b }
    }

    fun part2(input: List<String>): Int {
        return input
            .windowed(4)
            .count {
                it[0] < it[3]
            }
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
    println(part1(testInput))
    check(part1(testInput) == 7)

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
