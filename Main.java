class Main {

  public static int summation(int num) {
    if (num == 1) {
      return 1;
    }
    return num + summation(num - 1);
  }

  public static void main(String[] args) {
    // recursion 
    // calling the code/method as the reurn statement
    // Ex: 
    // public int never(int num) {
    //  if (num == 1) {
    //  return 0;
    //   }
    // return never(num - 1);
    // }
    // Recursive methods have 2 things:
    // 1. Base case - prevents the recursion from running forever
    // 2. Recursive call - allows the recursive loop to occur
    // Make a factorial loop
    // 5! = 5*4*3*2*1 = 120
    int answer = factorial(5);
    System.out.println(answer);
    int ans = fibonacci(5);
    System.out.println(ans);
    // Fibonacci
    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
    // using a regular for loop (iterative) have it return the nth term of the fibonacci sequence
    // n = 5, fib = 5
    // n = 13, fib = 13

    //recursive fiboncacci
    // 1. base case
    // 2. recursive call 
    // base case is the first two previous numbers
    // recursive call is adding the previous two numbers
    
    //  A   B   C
    // ___ ___ ___
    // step by step solution for n discks
    // print all the steps of the solution disk 1 is the top disk and disk n is bottom 
    // all the disks start at A and go to C 

    // Miscellaneous
    // random/RNG
    // RNG - random number generator
    // Math class random 
    // Math.random() - it returns a double between 0.0 (inclusive) and 1.0 (exclusive) {0.0 <= x < 1.0}
    // If I wanted number I wanted numbers 0 through 2, 
    
    int myRandomNumber = (int)Math.random() * 3; // .9999999 * 3 = 2
    // If I wanted numbers between 2 through 4,
    int myRandomNumber = (int)Math.random() * 3 + 2;
  }

    public static int fibonacci(int num) {
      if (num == 0) {
        return 0;
      } else if (num == 1) {
        return 1;
      }

      return fibonacci(num - 2) + fibonacci(num - 1);
    }

  // public static int factorial(int num) {
  //   int total = 1;  
  //   for (int i = 1; i < num + 1; i++) {
  //     total = i * total;
  //   }
  //   return total;
  // }

   public static int factorial(int num) {
     if (num == 0) {
       return 1;
     }
     return num * factorial(num - 1);
   }

  // public static int fibonacci(int num) {
  //   int total = 0;  
  //   int first = 1;
  //   int second = 0;
  //   for (int i = 0; i < num; i++){
  //     total = first + second;
  //     second = first;
  //     first = total;
  //   }
  //   return second;
  // }

}