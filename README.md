# Java Multithreading Tasks

This repository contains several exercises that demonstrate key concepts in Java multithreading, including creating threads, using the Runnable interface, applying `sleep()` and `join()`, and implementing thread communication with `wait()` and `notify()` using a shared `BankAccount` object.

---

## 🚀 Task 1 — Basic Thread Creation

### ✔ Create a Thread by Extending `Thread`
In this task, a class extends the `Thread` class and overrides the `run()` method.  
When the thread starts, it prints a simple message such as **"Hello from thread"**.

**Concepts practiced:**
- Extending `Thread`
- Overriding `run()`
- Starting a thread using `.start()`

---

## 🚀 Task 2 — Implementing the Runnable Interface

A second thread is created by implementing the `Runnable` interface.  
The `run()` method prints the current thread's name along with a message.

**Concepts practiced:**
- Implementing `Runnable`
- Passing a Runnable to a `Thread` object
- Using `Thread.currentThread().getName()`

---

## ⏱ Task 3 — Thread Sleep & Join

### ✔ Using `Thread.sleep()`
A loop prints numbers from **1 to 5**, waiting **1 second** between each number to simulate delay.

### ✔ Using `Thread.join()`
Two threads are created and started.  
The **main thread waits** for both to finish using the `join()` method before continuing.

**Concepts practiced:**
- Pausing threads
- Coordinating execution between threads
- Forcing the main thread to wait

---

## 🏦 Task 4 — Synchronized Bank Account (wait/notify)

This is the main multithreading challenge.  
A shared `BankAccount` object is accessed by two different threads:

### ✔ Depositor Thread
- Deposits money every few seconds.
- After depositing, it calls `notify()` to wake up waiting withdrawers.

### ✔ Withdrawer Thread
- Tries to withdraw money.
- If the balance is insufficient, it calls `wait()` and pauses until a deposit occurs.

### ✔ BankAccount Class (Key Rules)
- The methods `deposit()` and `withdraw()` must be synchronized.
- `withdraw()` uses `wait()` when balance is too low.
- `deposit()` uses `notify()` after increasing balance.
- Both operations simulate real delays (1–2 seconds) to mimic real-world banking transactions.

**Concepts practiced:**
- Thread synchronization
- Critical sections (`synchronized`)
- Inter-thread communication (`wait()` / `notify()`)
- Producer-consumer pattern
- Safe shared resource access

---

## 🧠 Concepts Learned

### ✔ Thread Creation Methods
- Extending `Thread`
- Implementing `Runnable`

### ✔ Thread Coordination
- `sleep()`
- `join()`

### ✔ Thread Safety
- `synchronized` keyword
- Shared resource protection

### ✔ Inter-Thread Communication
- `wait()` → thread pauses until notified
- `notify()` → wakes up one waiting thread
- Real-world scenario: ATM & bank deposits

## 📝 Summary

This project provides a practical demonstration of:
- How threads work internally
- How to control execution order
- How to safely share data across threads
- How to use wait/notify to coordinate actions between threads

It forms a solid understanding of **Java Multithreading**, preparing you for advanced concurrency and real-world backend development.

---
