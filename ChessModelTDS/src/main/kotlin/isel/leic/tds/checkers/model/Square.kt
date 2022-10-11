package isel.leic.tds.checkers.model

class Square(){
    var r = Row(0)
    var c = Column('a')
    constructor(row:Row, column:Column) : this() {
        r = row
        c = column
    }

    constructor(row:Int, column: Int): this(){
        r = row.indexToRow()
        c = column.indexToColumn()
    }
    companion object {
        //val values =

    }

    override fun toString(): String {
        return "${r.number}${c.symbol}"
    }


    val black: Boolean = r.index % 2 != 0 && c.index % 2 != 0
                        || r.index % 2 == 0 && c.index % 2 == 0



}


fun String.toSquareOrNull():Square? {
    println(this[0])
    Square().c = this[0]





}