import kotlin.system.exitProcess

fun main(args: Array<String>) {
  if (args.size != 3){
    println("Error: Not the correct number of grades. It should be three.")
    exitProcess(1)
  }

  val grades = args.map { it.toInt() }

  for (grade in grades) {
    if (grade !in 0..100) {
      println("Error: All grades must be between 0 and 100")
      exitProcess(1)
    }
  }

  val gradeAverage = grades.sum() / grades.size

  print ("Your grade everage is $gradeAverage")
}