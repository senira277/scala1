package p10

object p10_3 {

  class Account(private var balance: Double) {

    // Deposit method to add money to the account
    def deposit(amount: Double): Unit = {
      require(amount > 0, "Deposit amount must be positive")
      balance += amount
      println(s"Deposited $$${amount}, new balance is $$${balance}")
    }

    // Withdraw method to subtract money from the account
    def withdraw(amount: Double): Unit = {
      require(amount > 0, "Withdrawal amount must be positive")
      if (amount <= balance) {
        balance -= amount
        println(s"Withdrew $$${amount}, new balance is $$${balance}")
      } else {
        println(s"Insufficient balance to withdraw $$${amount}")
      }
    }

    // Transfer method to transfer money from this account to another account
    def transfer(to: Account, amount: Double): Unit = {
      require(amount > 0, "Transfer amount must be positive")
      if (amount <= balance) {
        this.withdraw(amount) // Withdraw from this account
        to.deposit(amount)    // Deposit to the other account
        println(s"Transferred $$${amount} to the target account")
      } else {
        println(s"Insufficient balance to transfer $$${amount}")
      }
    }

  }

  // Example usage
  def main(args: Array[String]): Unit = {
    val account1 = new Account(1000.0)
    val account2 = new Account(500.0)

    account1.deposit(200)
    account1.withdraw(300)
    account1.transfer(account2, 400)
  }
}
