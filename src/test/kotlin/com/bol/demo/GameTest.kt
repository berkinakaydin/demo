package com.bol.demo

import com.bol.demo.game.Game
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class GameTest {
    @Test
    fun `a game should contain two players`() {
        val game = Game()

        assertEquals(game.players.size, 2)
    }

    @Test
    fun `each player should have 6 small pits and one big pit`() {
        val players = Game().players
        val numberOfSmallPits = 6

        players.forEach { player ->
            assertEquals(numberOfSmallPits, player.smallPits.size)
            assertNotNull(player.largePit)
        }
    }
}