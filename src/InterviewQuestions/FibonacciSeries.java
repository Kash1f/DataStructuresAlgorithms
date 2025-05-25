package InterviewQuestions;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, sum = 0;

        System.out.print(n1 + " " + n2);

        for (int i = 2; i < 10; i++) {
            sum = n1 + n2;
            System.out.print(" " + sum);
            n1 = n2;
            n2 = sum;

        }
    }
}

/*

| Iteration (i) | `n1` (before) | `n2` (before) | `sum = n1 + n2` | Output            | `n1` (after) | `n2` (after) |
| ------------- | ------------- | ------------- | --------------- | ----------------- | ------------ | ------------ |
| 2             | 0             | 1             | 1               | 0 1 1             | 1            | 1            |
| 3             | 1             | 1             | 2               | 0 1 1 2           | 1            | 2            |
| 4             | 1             | 2             | 3               | 0 1 1 2 3         | 2            | 3            |
| 5             | 2             | 3             | 5               | 0 1 1 2 3 5       | 3            | 5            |
| 6             | 3             | 5             | 8               | 0 1 1 2 3 5 8     | 5            | 8            |
| 7             | 5             | 8             | 13              | ... 13            | 8            | 13           |
| 8             | 8             | 13            | 21              | ... 21            | 13           | 21           |
| 9             | 13            | 21            | 34              | ... 34            | 21           | 34           |

In this code, we are printing the Fibonacci series using a for loop. The first two numbers, 0 and 1, are printed before the loop. Then the loop runs from i = 2 to i < 10, meaning it will run 8 times to generate the next 8 Fibonacci numbers.

Inside the loop, three main things happen:

1. Add the previous two numbers:
We calculate the next number in the Fibonacci series by adding the last two numbers. These two numbers are stored in n1 and n2, and the result is saved in the variable sum.

Example:
If n1 = 1 and n2 = 2, then sum = 1 + 2 = 3.

2. Print the result:
We print the new number (sum) using System.out.print(" " + sum);.
This prints the number with a space before it so that the output looks nice and separated.

Example output:
0 1 1 2 3 5 8 13 21 34

3. Update the numbers:
After printing the sum, we update the values of n1 and n2 for the next loop.

n1 = n2 → The second number becomes the new first number.

n2 = sum → The new sum becomes the new second number.

This prepares us to calculate the next Fibonacci number in the next loop.

Example:
If n1 = 1, n2 = 2, and sum = 3, then after updating:
n1 = 2, n2 = 3 → next sum will be 2 + 3 = 5.

This cycle repeats, generating and printing the Fibonacci numbers one by one.


 */