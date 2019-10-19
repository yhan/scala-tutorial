class Person(val age: Int, val name: String, val genre: Char) {
    def this(age: Int) {
        this(age, "", Char.MaxValue)
    }

    def this(age: Int, name:String) {
        this(age, name, Char.MaxValue)
    }

    def show: Unit = {
        println(s"$name has $age years old")
    }
}
