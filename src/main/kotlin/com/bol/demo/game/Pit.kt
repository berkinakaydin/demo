package com.bol.demo.game

class Pit(
    var capacity: Int = 0,
) {
    lateinit var next: Pit
}