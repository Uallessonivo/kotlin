package dataStructures

import java.util.PriorityQueue

// PriorityQueue = FIFO data structure. serves elements with the highest priorities first
// before elements with lower priority (ex A, B, C, D) / (1, 2, 3, 4, 5)


fun main() {
    val myQueue = PriorityQueue<String>()

    // Enqueue
    myQueue.offer("Karen")
    myQueue.offer("Chad")
    myQueue.offer("Steven")
    myQueue.offer("Harold")


    println(myQueue)
}

