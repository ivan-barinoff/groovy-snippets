class Test {
    static main(args) {
        println factorial(5)
    }

    static factorial(n) {
        int sum = 1
        for (i in 2..n) {
            sum *= i
        }
        sum
    }
}
