package examplebox

class CompoundBox : BoxInterface {
    override var boxList: ArrayList<BoxInterface> = ArrayList()

    override fun insert(box: BoxInterface) {
        boxList.add(box)
    }
}