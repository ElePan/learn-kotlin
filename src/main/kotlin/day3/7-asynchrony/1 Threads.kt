package day3.`7-asynchrony`

import kotlin.concurrent.thread

fun main() {
    //4 ways to manage threads with kotlin

    //Java stile - 1st option
    class SimpleThread: Thread() {
        override fun run(){
            //code
        }
    }
    val st = SimpleThread()
    st.start()

    //Java stile - 2nd option
    class SimpleRunnable: Runnable {
        override fun run(){
            //code
        }
    }
    val sr = Thread(SimpleRunnable())
    sr.start()

    //Java8 stile - 3rd option
    val thread = Thread {
        //code
    }
    thread.start()

    //Kotlin stile - 4rt option
    val kthread = thread(start = false, isDaemon = false, name = "k_thread", priority = 1) {
        //code
    }
    kthread.start()
}
