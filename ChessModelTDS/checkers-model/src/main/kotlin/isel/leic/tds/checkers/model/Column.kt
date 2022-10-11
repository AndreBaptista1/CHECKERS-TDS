package isel.leic.tds.checkers.model

class Column(val symbol: Char) {
    companion object{
        val values =  (1 .. BOARD_DIM).map { it -> Column((it + 96).toChar()) }
    }

    val index get() = values.indexOf(this)
}

fun Char.toColumnOrNull() = Column.values.firstOrNull{it.symbol == this}

fun Int.indexToColumn() = Column.values.elementAt(this)

