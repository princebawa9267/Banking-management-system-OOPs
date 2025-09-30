# 🏦 Bank Account Simulation (Java OOP Project)

This is a simple **Bank Account Simulation** program built in **Java** using **Object-Oriented Programming (OOP)** principles.  
It allows a user to deposit money, withdraw money (with balance check), view current balance, and track transaction history.  

---

## 🚀 Features
- Deposit money 💰  
- Withdraw money (throws **custom exception** if insufficient balance) ❌  
- Check current balance 📊  
- Transaction history with **date and type** (Deposit / Withdraw) 📜  
- Menu-driven console application with input validation ✅  

---

## 🛠️ Technologies Used
- **Java** (Core Java concepts)  
- **OOPs Concepts**
  - Encapsulation → Balance and transaction details hidden in `Account` class  
  - Abstraction → Defined transaction types using `enum`  
  - Polymorphism → Different transaction operations (deposit/withdraw)  
  - Exception Handling → Custom exception `InsufficientBalanceException`  

---

## 📂 Project Structure
BankAccountSimulation/
  ├── Main.java # Entry point with menu-driven simulation
  
  ├── Account.java # Handles balance, deposits, withdrawals, and transaction history
  
  ├── Transaction.java # Represents a transaction with amount, date, and type
  
  ├── TransactionType.java # Enum for transaction types (DEPOSIT, WITHDRAW)
  
  ├── InsufficientBalanceException.java # Custom exception for low balance


---

## 📖 How It Works
1. Run the program → `Main.java`  
2. Menu Options:  
   - **1** → Withdraw money  
   - **2** → Deposit money  
   - **3** → Check balance  
   - **4** → View transaction history  
   - **5** → Exit  
3. All transactions are stored in a list and displayed with **amount, type, and timestamp**.  

---

## 💡 Example Run
```
Hello Sir, Bank Account Simulation

Withdraw money

Deposit money

Check balance

Transaction history

Exit
Choose from 1 to 5 : 2
Enter amount to be deposit : 500
$ 500.0 is credited to account. Your new balance : $500.0

Choose from 1 to 5 : 1
Enter amount to withdraw : 200
Withdraw successful 200.0. New Balance : 300.0

Choose from 1 to 5 : 4
Your account history
$ 500.0 Deposited at Mon Sep 29 18:30:45 IST 2025
$ 200.0 Withdrawen at Mon Sep 29 18:32:10 IST 2025

```


---

## 📌 Key Learning Outcomes
- Implementing **custom exceptions** in Java.  
- Using **ArrayList** to store transaction history.  
- Applying **OOP principles** to a real-world banking scenario.  
- Practicing **menu-driven console applications**.  

---

## ▶️ How to Run
1. Clone this project or copy files.  
2. Compile Java files:  
   ```bash
   javac Main.java Account.java Transaction.java TransactionType.java InsufficientBalanceException.java
   java Main
   ```



