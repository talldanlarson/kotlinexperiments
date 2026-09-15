fun main() {
    val file1 = File("File1", 1024, "Alice")
    val file2 = File("File4", 2024, "Carol")
    val file3 = File("File3", 10, "Dave")
    val file4 = File("File2", 10, "Bob")
    val files = listOf(file1, file2, file3, file4)

    files.forEach { println(it) }
    println("\n")

    files.sortedWith(compareBy<File> { it.size}.thenBy{it.owner}).forEach { println(it) }
}