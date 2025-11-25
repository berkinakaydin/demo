package com.bol.demo

import org.junit.Test
import kotlin.test.assertEquals

class GameTest {
    @Test
    fun `a game should contain two players`(){
        val game = Game()

        assertEquals(game.players.size == 2)
    }
}