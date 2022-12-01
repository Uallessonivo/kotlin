import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        val job1 = launch {
            println("Job 1 launched")

            val job2 = launch {
                println("Job 2 launched")
                delay(3000L)
                println("Job 2 is finishing")
            }
            job2.invokeOnCompletion { println("Job 2 completed") }

            val job3 = launch {
                println("Job 3 launched")
                delay(3000L)
                println("Job 3 is finishing")
            }
            job3.invokeOnCompletion { println("Job 3 completed") }
        }

        job1.invokeOnCompletion { println("Job 1 completed") }

        delay(500L)
        println("Job1 will be cancelled")
        job1.cancel()
    }
}