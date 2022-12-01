import kotlinx.coroutines.*

fun main() {
    // Exception behaviour depends on the coroutine builder

    // launch
    // 1. propagates through the parent-child hierarchy
    // 2. the exception will be thrown immediately and jobs will fail
    // 3. use try-catch or an exception handler


    // async
    // 1. exceptions are deferred until the result is consumed
    // 2. if the result is not consumed, the exception is never thrown
    // 3. try-catch in the coroutine or in to await() call

    runBlocking {
        // launch
        val myHandler = CoroutineExceptionHandler { coroutineContext, throwable ->
            println("Exception handled: ${throwable.localizedMessage}")
        }

        val job = GlobalScope.launch(myHandler) {
            println("Throwing exception from job")
            throw IndexOutOfBoundsException("Exception in coroutine")
        }
        job.join()

        // async
        val deferred = GlobalScope.async {
            println("Throwing exception from async")
            throw ArithmeticException("Exception from async")
        }

        try {
            deferred.await()
        } catch (e: ArithmeticException){
            println("Caught ArithmeticException ${e.localizedMessage}")
        }
    }
}