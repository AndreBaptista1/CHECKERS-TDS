package isel.leic.tds.checkers.model;

const val BOARD_DIM = 8;

class Row(val number:Int){

    companion object{
        val values = (BOARD_DIM downTo 1).map{Row(it)}
    }

    val index
        get() = values.indexOf(this)


}

fun Int.toRowOrNull() = Row.values.firstOrNull{it.number == this }

fun Int.indexToRow() = Row.values.elementAt(this)
