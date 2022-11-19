fun main() {
    val account = BankAccount()
    account.amount = 500
    account.amount = 1000
    account.amount = 10000
    account.amount = 1000000
}

class BankAccount {
    var interestRate = 0.0
    var amount: Int = 0
        get() = field
        set(value) {
            interestRate = if (value < 1000)
                1.0
            else if (value < 10000)
                0.5
            else
                0.2
            field = value
            println("The client has $value and has an interest rate of $interestRate")
        }
}