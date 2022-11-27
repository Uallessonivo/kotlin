package dataStructures

import java.util.LinkedList

// LinkedList = stores Nodes in 2 parts (data + address)
// Nodes are in non-consecutive memory locations
// Elements are linked using pointers

// Singly Linked List
// Node                     Node                    Node
// [data|address] ->    [data|address] ->       [data|address]
// (ex  [data | next]

// Doubly Linked List
//      Node                              Node                    Node
// [address|data|address] ->    [address|data|address] ->   [address|data|address]
// (ex  [prev | data | next]

// Advantages
// 1. Dynamic data structure (allocates needed memory while running)
// 2. Insertion and deletion of node is easy. 0(1)
// 3. No/Low memory waste

// Disadvantages
// 1. Greater memory usage (additional pointer)
// 2. No random access of elements (no index[i])
// 3. Accessing/searching elements is more time-consuming . O(n)

// Uses?
// 1. Implement stack/queues
// 2. GPS navigation
// 3. Music playlists

fun main() {
    val myQueueList = LinkedList<String>()

    // Queue
    myQueueList.offer("A")
    myQueueList.offer("B")
    myQueueList.offer("C")
    myQueueList.offer("D")
    // Remove from head
    myQueueList.poll()

    // Add
    myQueueList.add(4, "E")
    myQueueList.addFirst("0")
    myQueueList.addLast("0")

    // Remove
    myQueueList.remove( "E")
    myQueueList.removeFirst()
    myQueueList.removeLast()

    println(myQueueList)
    println(myQueueList.peekFirst())
    println(myQueueList.peekLast())
}

