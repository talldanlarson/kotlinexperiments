class Ball: Moveable {
    override val thing: String
        get() = "Ball"
    override fun move() {
        println("Thing: $thing")
    }
}