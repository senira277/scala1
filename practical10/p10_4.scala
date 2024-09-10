package p10

object p10_4 {
  class Account(private var balance: Double) {

    // Deposit money into the account
    def deposit(amount: Double): Unit = {
      require(amount > 0, "Deposit amount must be positive")
      balance += amount
    }

    // Withdraw money from the account
    def withdraw(amount: Double): Unit = {
      require(amount > 0, "Withdrawal amount must be positive")
      if (amount <= balance) balance -= amount
    }

    // Transfer money to another account
    def transfer(to: Account, amount: Double): Unit = {
      require(amount > 0, "Transfer amount must be positive")
      if (amount <= balance) {
        this.withdraw(amount)
        to.deposit(amount)
      }
    }

    // Get the current balance
    def getBalance: Double = balance

    // Apply interest based on the current balance
    def applyInterest(): Unit = {
      if (balance > 0) {
        balance += balance * 0.05 // Positive balance: deposit interest of 5%
      } else {
        balance += balance * 0.1 // Negative balance: overdraft interest of 10%
      }
    }

    override def toString: String = s"Account balance: $$${balance}"
  }

  class Bank(val accounts: List[Account]) {

    // 4.1: List of accounts with negative balances
    def accountsWithNegativeBalance: List[Account] = {
      accounts.filter(_.getBalance < 0)
    }

    // 4.2: Calculate the sum of all account balances
    def totalBalance: Double = {
      accounts.map(_.getBalance).sum
    }

    // 4.3: Apply interest to all accounts and return the final balances
    def applyInterestToAll(): Unit = {
      accounts.foreach(_.applyInterest())
    }
  }

  // Example Usage
  object BankApp extends App {

    // Create accounts with different balances
    val account1 = new Account(1000.0) // Positive balance
    val account2 = new Account(-500.0) // Negative balance
    val account3 = new Account(200.0) // Positive balance
    val account4 = new Account(-100.0) // Negative balance

    // Create a bank with a list of accounts
    val bank = new Bank(List(account1, account2, account3, account4))

    // 4.1: List accounts with negative balances
    val negativeBalanceAccounts = bank.accountsWithNegativeBalance
    println("Accounts with negative balances:")
    negativeBalanceAccounts.foreach(println)

    // 4.2: Calculate the total balance of all accounts
    val totalBalance = bank.totalBalance
    println(s"Total balance of all accounts: $$${totalBalance}")

    // 4.3: Apply interest to all accounts and display final balances
    bank.applyInterestToAll()
    println("Final balances after applying interest:")
    bank.accounts.foreach(println)
  }

}
