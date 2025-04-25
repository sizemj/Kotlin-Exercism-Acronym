fun main() {
    val result = generate("Rolling On The Floor Laughing So Hard That My Dogs Came Over And Licked Me")
    println(result)
}

fun generate(phrase: String): Any {
    val wordsInString = phrase.split(" - ", "-", " _", " ")
    val acronymCharList = mutableListOf<Char>()
    var finalAcronym = ""
    var i = 0
    while (i < wordsInString.size) {
        val acronymLetter = (wordsInString[i].first())
        acronymCharList.add((acronymLetter.uppercaseChar()))
        i++
        finalAcronym = acronymCharList.joinToString("")
    }
    return finalAcronym
}




