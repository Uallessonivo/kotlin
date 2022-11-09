import java.util.*

fun stringFunctions(args: Array<String>) {
    // The length of string
    val myPet = "Dog"
    println(myPet.length)

    // Capitalize string
    val myName = "uallesson"
    println(myName.replaceFirstChar { it.uppercase() })

    // Returns a string having leading and trailing whitespace removed
    val myText = "   There are to   many   spaces  "
    println(myText.trim())

    // Returns the character of this string at the specified index.
    val getCharacter = "Uallesson Nunes"
    println(getCharacter[3])

    // Returns a substring of this string that starts at the specified startIndex and continues to the end of the string.
    println(getCharacter.substring(3))
    // Returns the substring of this string starting at the startIndex and ending right before the endIndex.
    println(getCharacter.substring(3, 6))
}