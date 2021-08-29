package topics

data class Classes(private val firstName: String, private val lastName: String, private val age: Int) {
    val children: MutableList<Classes> = mutableListOf()

    init { println("$this has success created") }

    constructor(firstName: String, lastName: String, age: Int, child: Classes):
            this(firstName, lastName, age) {
        children.add(child)
    }
    constructor(child: Classes): this("Genadiy", "Petrovich", 0) {
        children.add(child)
    }
    constructor(): this("Genadiy", "Petrovich", 0)

    override fun toString(): String = "(Classes: $firstName, $lastName, $age)"
}

fun main() {
    println(Classes(Classes()).children)
    println(Classes("Vasiliy", "Vasilievich", 10) == Classes("Vasiliy", "Vasilievich", 10))
}
