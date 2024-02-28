package org.example

import java.util.*

/*
    Given a string that may contain parentheses validate if it has all being and ending parentheses
    Examples:

    input:   ()
    output: valid

    input:   (hello, world)
    output: valid

    input:   Random text (as this) is ok().
    output: valid

    input:   )(
    output: invalid

    input:   (Hello (,) world (!))
    output: valid

    input:   )()(
    output: invalid

    input:   ())(()
    output: invalid
*/

// Complexity -> O(N)
// Space -> O(N)
fun balancedParentheses(input: String): Boolean {
    val stack = Stack<Char>()
    val cleanedInput = input.replace(Regex("[^()]"), "")
    cleanedInput.forEach { char ->
        if (char == '(') {
            stack.push('(')
        } else {
            if (stack.isEmpty()) return false
            if(stack.last() == '(') {
                stack.pop()
            } else {
                return false
            }
        }
    }
    return true
}