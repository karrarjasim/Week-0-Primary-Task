
fun main() {
    println(findCharRepetitionPercentage(listOf("a","b","b")));
}

/**
 * This function return the repetition percentage for a character in list of characters.
 * @parama charsList list of characters
 * @return Double
 **/

fun findCharRepetitionPercentage(charsList: List<String>): Double? {
    val totalCount :  Int = charsList.size;
    var repeatTimes : Int = 0;
    charsList.forEach{
        if (it != "a" && it != "b") return -1.0;
        if(it == "a") repeatTimes++;
    }
    return   (repeatTimes.toDouble() / totalCount) * 100
}