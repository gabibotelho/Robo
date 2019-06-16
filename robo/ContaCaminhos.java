package robo;
import java.util.concurrent.RecursiveTask;

class ContaCaminhos extends RecursiveTask<Integer> {
    final int n;
    final int m;
    
    ContaCaminhos(int m, int n){
        this.m = m;
        this.n = n;
    }

    @Override
    protected Integer compute(){
        if(n == 0 && m == 0) return 0;
        if(n == 0 || m == 0) return 1;
        
        ContaCaminhos c1 = new ContaCaminhos(m, n - 1);
        c1.fork();
        ContaCaminhos c2 = new ContaCaminhos(n, m-1);
            
        return c2.compute() + c1.join();

    }
    
}

/*
  class Fibonacci extends RecursiveTask<Integer> {
   final int n;
   Fibonacci(int n) { this.n = n; }
   Integer compute() {
     if (n <= 1)
       return n;
     Fibonacci f1 = new Fibonacci(n - 1);
     f1.fork();
     Fibonacci f2 = new Fibonacci(n - 2);
     return f2.compute() + f1.join();
   }
 }
*/