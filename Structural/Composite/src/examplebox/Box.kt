package examplebox

import javax.naming.OperationNotSupportedException

class Box : BoxInterface {
    override var boxList: ArrayList<BoxInterface> = ArrayList()

    override fun insert(box: BoxInterface) {
        throw OperationNotSupportedException("Operation is not supported")
    }
}