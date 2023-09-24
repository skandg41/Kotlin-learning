fun main(args: Array<String>) {
    val aChar:Char ='a'
    val aNumericChar = '1'
    val sNewLineChar = '\n'

val aString:String = "Hello Kotlin"
    val escaped = "Hello \n World"
    println(escaped)

    val row = """
        Some
             multiline
        text
        is going on
        here
    """.trimIndent()
    println(row)
    val row2 = """
        >>Some
             multiline
        text
        >>is going on
        here
    """.trimMargin(">>")
    print(row2)

    val concatenateString = "Hello" + "Kotlin"

    val concatNumber = " The Number " + 16 + "\n"     // Will concate two strings and form a new string
    println(concatNumber)

    var stringdk = "sfdsfd\n"
    println(stringdk)

    val aNumber = 16
    val concatTemplate = "The number ${1000 + aNumber} $aChar"      // Will be a single string
    println(concatTemplate)

    println(stringdk.isEmpty())

    val someString = "   "
    println(someString.isBlank())

    val anotherString = "Hello Kotlin Workd"
    println(anotherString.contains("Kotlin"))
}