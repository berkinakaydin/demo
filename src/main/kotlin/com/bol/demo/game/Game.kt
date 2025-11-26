package com.bol.demo.game

class Game {
    val player1 = Player(1)
    val player2 = Player(2)
    val players = listOf(player1, player2)

    private var currentPlayer = player1

    init {
        setUp()
    }

    fun setUp() {
        player1.connectToOpponent(player2)
        player2.connectToOpponent(player1)
    }

    fun makeMove(pitIndex: Int){
        val opponent = if (currentPlayer == player1) player2 else player1

        var currentPit = currentPlayer.smallPits[pitIndex]
        var numberOfStones = currentPit.capacity

        currentPit.capacity = 0

        //validate
        if (numberOfStones < 1){
            return
        }

        //move
        while (numberOfStones > 0){
            var nextPit = currentPit.next

            // Skip opponent's large pit
            if (nextPit == opponent.largePit) {
                nextPit = nextPit.next
            }

            nextPit.capacity += 1

            numberOfStones--
            currentPit = nextPit
        }

        //deal switch player
    }
}