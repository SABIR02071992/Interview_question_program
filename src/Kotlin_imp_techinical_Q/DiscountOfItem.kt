package Kotlin_imp_techinical_Q


fun main() {


    // Cart banate waqt direct values pass kar rahe hain
    val cart = listOf(
        LineItem(Item("Pizza", 500.0), 3),
        LineItem(Item("Burger", 200.0), 1),
        LineItem(Item("Pasta", 300.0), 2)
    )

    var grandTotal = 0.0

    for (line in cart) {
        var total = line.item.price * line.quantity

        // Step 1: Same item 2 or more times => 10% discount
        if (line.quantity >= 2) {
            total -= (total * 0.10)
            println("Applied 10% discount on ${line.item.name}")
        }

        println("${line.item.name} total = ₹$total")
        grandTotal += total
    }

    // Step 2: If total >= 25000 => 5% discount
    if (grandTotal >= 25000) {
        grandTotal -= (grandTotal * 0.05)
        println("Applied additional 5% discount for bill >= 25000")
    }

    println("Final Payable Amount = ₹$grandTotal")
}

// Product
data class Item(val name: String, val price: Double)

// LineItem = product + quantity
data class LineItem(val item: Item, val quantity: Int)

