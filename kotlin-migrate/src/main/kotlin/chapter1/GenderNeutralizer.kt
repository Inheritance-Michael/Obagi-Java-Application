package chapter1

fun main() {

}

fun getParagraph(): String{
   val paragraph = ""
   readlnOrNull().toString()
    return paragraph
}

fun wordFish(): String{
   val paragraph = getParagraph()
    val genderMap: MutableMap<String, String> = HashMap()

   genderMap["woman"] = "person"
    genderMap["man"] = "person"
    genderMap["husband"] = "spouse"
    genderMap["wife"] = "spouse"
    genderMap["son"] = "child"
    genderMap["daughter"] = "child"

    return paragraph
}