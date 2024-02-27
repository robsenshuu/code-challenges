package org.example

fun alphanumericSort(input: String): String {
    var lowerCase = ""
    var capitalLetters = ""
    var special = ""
    var even = ""
    var odd = ""
    input.forEach { char ->
        when {
            Character.isDigit(char) -> {
                if(char.toString().toInt() % 2 == 0) {
                    even += char
                } else {
                    odd += char
                }
            }
            (char.code >= 97) && (char.code <= 127) -> lowerCase += char
            (char.code >= 65) && (char.code <= 90) -> capitalLetters += char
            else -> special += char
        }
    }

    return "$lowerCase$capitalLetters$even$odd$special"
}