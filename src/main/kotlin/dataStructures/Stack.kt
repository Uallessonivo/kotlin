package dataStructures

import java.util.*

// STACK = LIFO data structure. Last-in First-Out
// stores objects into a sort of "vertical tower"
// push() to add to the top
// pop() to remove from the top

// Uses of stacks?
// 1. undo/redo features in text editors
// 2. moving back/forward through browser history
// 3. backtracking algorithms (maze, file directories)
// 4. calling functions (call stack)

fun main() {
    val stack = Stack<String>()

    // Adding to stack
    stack.push("Minecraft")
    stack.push("Skyrim")
    stack.push("Doom")
    stack.push("GTA V")

    // Remove from top
    stack.pop()

    // Getting the top of stack without removing
    val myFavGame = stack.peek()

    println(stack)
    println(myFavGame)
}