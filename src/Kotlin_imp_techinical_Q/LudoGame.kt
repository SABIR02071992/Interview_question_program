package Kotlin_imp_techinical_Q

import kotlin.random.Random

fun main() {
    var playerA = 0
    var playerB = 0
    var turnA = true // Player A's turn first

    while (playerA < 100 && playerB < 100) {
        val dice = Random.nextInt(1, 7) // roll dice between 1–6

        if (turnA) {
            playerA += dice
            if (playerA > 100) playerA = 100
            println("Player A rolled $dice → Position: $playerA")
        } else {
            playerB += dice
            if (playerB > 100) playerB = 100
            println("Player B rolled $dice → Position: $playerB")
        }

        // Switch turn
        turnA = !turnA

        // Small delay for readability
        Thread.sleep(500)
    }

    // Decide winner
    if (playerA >= 100) {
        println("\n🏆 Player A Wins!")
    } else {
        println("\n🏆 Player B Wins!")
    }
}
