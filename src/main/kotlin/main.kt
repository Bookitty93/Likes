fun main() {
    val likes: Int = 1

    if (likes == 11) {
        println("понравилось $likes людям")
    } else if (likes % 10 == 1) {
        println("понравилось $likes человеку")
    } else println("понравилось $likes людям")
}