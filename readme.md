# Syllabus

## Introduction

- Ways to define, instantiate, and start a new Thread.
- Getting and setting the name of a Thread.
- Thread Priorities.
- Methods to prevent a Thread from execution:
  - `yield()`
  - `join()`
  - `Sleep()`

## Synchronization

- Inter-Thread Communication.
- Deadlock.
- Daemon Threads.

## Conclusion

After exploring this repository, you will be able to answer the following questions:

1) What is multitasking?
2) What is multithreading, and what are its application areas?
3) What are the advantages of multithreading?
4) When compared with C++, what advantages does Java have in terms of multithreading?
5) In how many ways can we define a thread?
6) Among extending Thread and implementing Runnable, which approach is recommended?
7) What is the difference between `t.start()` and `t.run()`?
8) Explain the thread scheduler.
9) If we are not overriding `run()`, what will happen?
10) Is it possible to overload `run()`?
11) Is it possible to override the `start()` method, and what will happen?
12) Explain the life cycle of a thread.
13) What is the importance of the Thread class `start()` method?
14) After starting a thread, if we try to restart the same thread once again, what will happen?
15) Explain the constructors of the Thread class.
16) How to get and set the name of a thread?
17) Who uses thread priorities?
18) What is the default priority for the main thread?
19) Once we create a new thread, what is its priority?
20) How to get the priority from a thread and set the priority to a thread?
21) If we are trying to set the priority of a thread as 100, what will happen?
22) If two threads have different priorities, then which thread will get a chance first for execution?
23) If two threads have the same priority, then which thread will get a chance first for execution?
24) How can we prevent a thread from execution?
25) What is `yield()` and what is its purpose?
26) Is `join()` overloaded?
27) What is the purpose of the `sleep()` method?
28) What is the `synchronized` keyword? Explain its advantages and disadvantages.
29) What is an object lock, and when is it required?
30) What is a class-level lock, and when is it required?
31) While a thread is executing any synchronized method on a given object, is it possible to execute remaining synchronized methods on the same object simultaneously by another thread?
32) What is the difference between a synchronized method and a static synchronized method?
33) What are the advantages of a synchronized block over a synchronized method?
34) What is a synchronized statement?
35) How can two threads communicate with each other?
36) `wait()`, `notify()`, and `notifyAll()` are available in which class?
37) Why are `wait()`, `notify()`, and `notifyAll()` methods defined in the Object class instead of the Thread class?
38) Without having the lock, is it possible to call `wait()`?
39) If a waiting thread gets a notification, then in which state will it enter?
40) In which methods can a thread release a lock?
41) Explain `wait()`, `notify()`, and `notifyAll()`.
42) What is the difference between `notify()` and `notifyAll()`?
43) Once a thread gives a notification, which waiting thread will get a chance?
44) How can a thread interrupt another thread?
45) What is deadlock? Is it possible to resolve a deadlock situation?
46) Which keyword causes a deadlock situation?
47) How can we stop a thread explicitly?
48) Explain `suspend()` and `resume()`.
49) What is starvation, and explain the difference between deadlock and starvation?
50) What is a race condition?
51) What is a daemon thread? Give an example and purpose of a Daemon Thread.
52) How can we check the daemon nature of a Thread? Is it possible to change the Daemon nature of a Thread? Is the main thread a daemon or non-daemon?
53) Explain ThreadGroup?
54) What is ThreadLocal?

## Thank you! Happy Multithreading!
