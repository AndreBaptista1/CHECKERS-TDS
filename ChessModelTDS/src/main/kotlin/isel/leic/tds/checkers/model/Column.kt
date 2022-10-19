package isel.leic.tds.checkers.model


class Column private constructor(val symbol:Char) {

    companion object{
        operator fun invoke(symbol: Char) = symbol.toColumnOrNull()!!
        val values = (0 until  BOARD_DIM).map { it -> Column((it + 'a'.code).toChar()) } //'a' = 97, ..., 'h' = 104
    }

    val index
        get() = symbol-'a'
}

//fun Column(symbol: Char) = symbol.toColumnOrNull()!!

fun Char.toColumnOrNull() = Column.values.firstOrNull { this == it.symbol }



fun Int.indexToColumn() = Column.values.elementAt(this)