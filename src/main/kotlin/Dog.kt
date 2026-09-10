class Dog: Moveable {
    override val thing: String = "Dog"
    override fun move() {
        println("Dog thing: $thing")
    }
}