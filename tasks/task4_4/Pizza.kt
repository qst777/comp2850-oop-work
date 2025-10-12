fun main() {
    val menuText = """
        PIZZA MENU
        (a) Margherita
        (b) Quattro Stagioni
        (c) Seafood
        (d) Hawaiian
        Choose your pizza (a-d): 
    """.trimIndent()

    var order: String

    while (true) {
        print(menuText)
        order = readln().lowercase()

        if (order in listOf("a", "b", "c", "d")) {
            println("Order accepted!")
            break
        } else {
            println("Order has to be one of the 4 choices.\n")
        }
    }
}
