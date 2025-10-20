package Kotlin_imp_techinical_Q

object DatabaseHelper {
    fun showMessage() {
        println("Database Connected!")
    }
}

// 🔹 Usage
fun main() {
    val db1 = DatabaseHelper
    val db2 = DatabaseHelper

    db1.showMessage()

    println(db1 === db2) // true (same object)
}
