package models

class Person constructor(val name: String, val age: Int, val profession: String){
    fun showInfo(): String {
        return "My name is $name and I'm $age years old, working with $profession"
    }
}