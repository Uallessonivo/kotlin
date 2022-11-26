package dataStructures

import java.util.LinkedList

// Queue = FIFO data structure. First-in First-out. (ex Line of people)
// A collection designed for holding elements prior to processing
// Add = enqueue, offer() -- Adds to the tail
// Remove = dequeue, poll() -- Remove from head

// Uses of Queue
// 1. Keyboard buffer (letters should appear on the screen in the order they're pressed)
// 2. Printer Queue (print jobs should be completed in order)
// 3. Used in LinkedLists, PriorityQueues, Breadth-first search

fun main() {
    val myQueue = LinkedList<String>()

    // Enqueue
    myQueue.offer("Karen")
    myQueue.offer("Chad")
    myQueue.offer("Steven")
    myQueue.offer("Harold")

    // Shows the 1st of Queue
    println(myQueue.peek())

    // Removes the head of Queue
    println(myQueue.poll())

    println(myQueue)
}

