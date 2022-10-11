package isel.leic.tds.checkers.model


class BetaColumn public constructor(val symbol:Char) {

    companion object{
        val values = (0 until  BOARD_DIM).map { it -> BetaColumn((it + 'a'.code).toChar()) } //'a' = 97, ..., 'h' = 104
    }

    val index
        get() = symbol-'a'
}

fun Column(symbol: Char) = symbol.toColumnOrNull()!!

fun Char.toColumnOrNull() = BetaColumn.values.firstOrNull { this == it.symbol }

fun Int.indexToColumn() = BetaColumn.values.elementAt(this)