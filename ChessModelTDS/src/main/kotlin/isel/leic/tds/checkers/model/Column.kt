package isel.leic.tds.checkers.model


class Column (val symbol:Char) {


    companion object{
        val values = (1..BOARD_DIM).map { it -> Column((it + 96).toChar()) } //'a' = 97, ..., 'h' = 104
    }

    val index
        get() = values.indexOf(this)
}


fun Char.toColumnOrNull() = Column.values.firstOrNull { this == it.symbol }

fun Int.indexToColumn() = Column.values.elementAt(this)