package com.bol.demo.game

class Pit(
    val next: Pit? = null,
    val stones: List<Int> = listOf()
)