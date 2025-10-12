// Task 4.5: summing odd integers with a for loop

fun main() {
  val userNumber: Int

  println("Pick a high number:")
  userNumber = readln().toInt()

  var total = 0
  for (n in 1..userNumber step 2){
    total += n
  }

  println("The total is $total")
}