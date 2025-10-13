// Task 5.1.1: anagram checking using a function
fun main() {

  println("please write down two words that might be anangrams of each other")

  val word1: String = readln()
  val word2: String = readln()

  println(anagrams(word1, word2))
}

fun anagrams(first: String, second: String): Boolean {
    if (first.length != second.length) {
        return false
    }
    val firstChars = first.lowercase().toList().sorted()
    val secondChars = second.lowercase().toList().sorted()
    return firstChars == secondChars
}