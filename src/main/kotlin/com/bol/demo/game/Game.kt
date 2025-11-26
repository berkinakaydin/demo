package com.bol.demo.game

class Game {
    val players = listOf(Player(1), Player(2))

    private var currentPlayer = players[0]

    init {
        setUp()
    }

    fun setUp() {
        players[0].connectToOpponent(players[1])
        players[1].connectToOpponent(players[0])
    }


    fun makeMove(pitIndex: Int){
        var currentPit = currentPlayer.smallPits[pitIndex]
        var numberOfStones = currentPit.capacity

        currentPit.capacity = 0

        //validate
        if (numberOfStones < 1){
            return
        }

        //move
        while (numberOfStones > 0){
            val nextPit = currentPit.next
            nextPit.capacity += 1

            numberOfStones--
            currentPit = nextPit
        }

        //deal switch player
    }
}