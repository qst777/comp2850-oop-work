fun main() {
  val menuText = "PIZZA MENU\n(a) Margherita\n(b) Quattro Stagioni\n(c) Seafood\n(d) Hawaiian\nChoose your pizza (a-d): "
  print(menuText)

  val order = readln().lowercase()

  if (order in "a".."d"){
    println("Order accepted")
  }
  else{
    println("Order has to be one of the 4 choices")
  }
}