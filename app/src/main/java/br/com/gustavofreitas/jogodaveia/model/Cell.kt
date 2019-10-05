package br.com.gustavofreitas.jogodaveia.model

data class Cell(var player: Player) {
    val isEmpty: Boolean
        get() = player.value.isEmpty()
}