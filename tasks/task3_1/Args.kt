// Task 3.1: command line arguments
import kotlin.system.exitProcess

fun main(arg: Array<String>) {
  if (arg.size != 2) {
    println("Error: filename required as sole argument")
    exitProcess(1)
  }
  
  println("${arg[0]} ${arg[1]}")
}
