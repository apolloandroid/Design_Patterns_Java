package examplecpu

import javax.naming.directory.BasicAttribute

//Facade
class Computer(var cpu: CPU, var memory: Memory, var hardDrive: HardDrive) {
    private val BOOT_ADDRESS = 0L
    private val BOOT_SECTOR = 0L
    private val SECTOR_SIZE = 0

    fun startComputer() {
        cpu.freeze()
        memory.load(BOOT_ADDRESS, hardDrive.read(BOOT_SECTOR, SECTOR_SIZE))
        cpu.jump(BOOT_ADDRESS)
        cpu.execute()
    }
}

// Complex parts
class CPU {
    fun freeze() {
        println("CPU freeze")
    }

    fun jump(position: Long) {
        println("CPU jump")
    }

    fun execute() {
        println("CPU execute")
    }
}

class Memory {
    fun load(position: Long, data: ByteArray) {
        println("Memory load")
    }
}

class HardDrive {
    fun read(lba: Long, size: Int): ByteArray {
        println("CPU freeze")
        return ByteArray(2)
    }
}