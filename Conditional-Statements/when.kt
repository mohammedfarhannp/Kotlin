fun main() {
	// when as alternative for if else-if else
    val score = 45
    when {
        score > 50 -> println("Pass")
        score < 50 -> println("Fail")
        else -> println("Just Pass")
    }
}
