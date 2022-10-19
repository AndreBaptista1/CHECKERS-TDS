package isel.leic.tds.checkers.model

class Square private constructor(val row:Row, val column: Column){

    companion object {
        val values = Row.values.flatMap { row -> Column.values.map { col-> Square(row,col)}}
        operator fun invoke(row: Row, column: Column) = values.first{it.row == row && it.column == column }

        operator fun invoke(row:Int, column:Int) = values.first{it.row == row.indexToRow() && it.column== column.indexToColumn()}
          //(0..BOARD_DIM).map{}//Square(it.indexToRow(),it.indexToColumn())}

    }

    override fun toString(): String {
        return "${row.number}${column.symbol}"
    }


    val black: Boolean = (row.index%2!=0 && column.index%2==0) || (row.index%2==0 && column.index%2!=0)


    val white: Boolean = !black

}


fun String.toSquareOrNull():Square? = Square.values.firstOrNull{it.toString()==this}
