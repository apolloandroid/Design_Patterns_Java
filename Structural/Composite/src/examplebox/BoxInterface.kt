package examplebox

interface BoxInterface {
    var boxList: ArrayList<BoxInterface>
    fun insert(box: BoxInterface)
    fun getBoxesSize() = boxList.size
    fun getFirstBox(): BoxInterface =
            if (boxList.size == 0) this else boxList[0]
}
