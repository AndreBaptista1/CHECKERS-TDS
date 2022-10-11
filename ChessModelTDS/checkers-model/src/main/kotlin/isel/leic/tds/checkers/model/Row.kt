package isel.leic.tds.checkers.model

const val BOARD_DIM = 8
class Row(val number: Int, val index: Int) {

        companion object{
            val values = List(BOARD_DIM){Row(it,it)}.reversed()
        }
}

fun Int.toRowOrNull() = Row.values.firstOrNull{it.number == this}

fun Int.indexToRow() = Row.values.elementAt(this)

