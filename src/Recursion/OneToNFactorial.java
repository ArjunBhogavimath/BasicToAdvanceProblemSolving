package Recursion;//1.5 recursion
//factorial number not greater than n
//striver a to z course sheet
import java.util.ArrayList;
import java.util.List;
public class OneToNFactorial {
    public static List<Long> factorialNumbers(long n) {
        // Write Your Code Here
        List<Long> list = new ArrayList<>();
        list.add(1L);
        if(n==1L) return list;
        return recurFactorial(list,1l,n,1l);
    }
    public static List<Long> recurFactorial(List<Long> list,Long fact,Long n,Long i){
        i++;
        if(fact*i>n){
            return list;
        }
        fact= fact*i;
        list.add(fact);
        return recurFactorial(list, fact, n, i);
    }
}

//basic formula is
//x =2 fact = 1 , fact = fact*x;
// x++;
//code
/*
 long x = 2;
        long fact = 1;
        list.add(1L);
        while(fact*x<=n){
            long temp = 0;
            fact = fact*x;
            temp = fact;
            list.add(temp);
            x++;
        }
        return list;
*/


//recursion method
//in recursive method, i'll pass list with fact and i
//fact will have total factorial
//i will be incremented 1 by 1
//so the base case will be when fact*i>n we should return the list
//otherwise do fact*i and store it in fact and add it to the list
//and aftrwads call the function again with the present values
