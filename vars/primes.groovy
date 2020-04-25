@Grab('org.apache.commons:commons-math3:3.4.1')
import org.apache.commons.math3.primes.Primes

def call(int... numbers) {
    for (int num : numbers ) {
        if (Primes.isPrime(num)) {
            echo "Number ${num} is prime."
        }
    }
}

def print(int... numbers) {
    call(numbers)
}

int count(int... numbers) {
    int i = 0
    for (int num : numbers ) {
        if (Primes.isPrime(num)) {
            ++i
        }
    }
    return i
}