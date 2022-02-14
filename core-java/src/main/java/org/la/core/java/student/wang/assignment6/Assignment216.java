package org.la.core.java.student.wang.assignment6;

public class Assignment216 {
    /*
	216
question 4
A prime number is a number that is evenly divisible only by itself and 1. For example, the number 5 is prime because it
can be evenly divided only by 1 and 5. The number 6, however, is not prime because it can be divided evenly by 1, 2, 4,
and 6.
Write a method named isPrime, which takes an integer as an argument and returns true if the argument is a prime number,
or false otherwise. Also write main method that displays prime numbers between 1 to 500.
Show the answer.
*/
    public static void main(String[] args) {
        for (int i = 1; i <= 500; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
/*
1 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 101 103 107 109 113 127 131 137 139 149 151 157 163 167 173 179 181 191 193 197 199 211 223 227 229 233 239 241 251 257 263 269 271 277 281 283 293 307 311 313 317 331 337 347 349 353 359 367 373 379 383 389 397 401 409 419 421 431 433 439 443 449 457 461 463 467 479 487 491 499
 */