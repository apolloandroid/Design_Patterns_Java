package examplecpu

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val computer = Computer(CPU(), Memory(), HardDrive())
        computer.startComputer()
    }
}