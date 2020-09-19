package models

import java.io.File

class LogWriter constructor(private var fileName: String) {

    private val file: File = File("$fileName.txt")

    init {
        if(file.createNewFile()){
            println("[SUCCESSFULLY] $fileName.txt created")
        }else{
            println("[WARNING] $fileName.txt already exists")
        }
    }

    fun write(str: String) {
        file.appendText("$str")
    }

}