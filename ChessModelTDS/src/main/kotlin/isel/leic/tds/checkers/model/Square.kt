package isel.leic.tds.checkers.model

class Square(){
    var row = Row(0)
    var column = Column('a')
    constructor(row:Row, column:Column) : this() {
        this.row = row
        this.column = column
    }

    constructor(row:Int, column: Int): this(){
        this.row = row.indexToRow()
        this.column = column.indexToColumn()
    }
    companion object {
        val values
            get() = (0..BOARD_DIM).map{Square(it.indexToRow(),it.indexToColumn())}

    }

    override fun toString(): String {
        return "${row.number}${column.symbol}"
    }


    val black: Boolean = row.index % 2 != 0 && column.index % 2 != 0
                        || row.index % 2 == 0 && column.index % 2 == 0



}


fun String.toSquareOrNull():Square? {
    return null
}