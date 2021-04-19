package seven.multiThread;

import java.util.Arrays;
import java.util.List;

import static java.lang.Integer.sum;

public class StreamExecutor {
    public static void main(String[] args) {

        List<Integer> numbers= Arrays.asList(1,2,34,343,32,434,34);
        int sum=0;
        for(Integer number:numbers){
            sum=sum + number;
           // System.out.println("Which Thread work operation?");
            //System.out.println(Thread.currentThread().getName());
           // System.out.println();
        }
        //2nd way to calculate(using .stream)
        System.out.println("Suma: " + sum);
       int sum1=numbers.stream().parallel()
                        .reduce(0,(x1,x2)->sum(x1,x2));
        System.out.println("Sum1=" + sum1);
    }
        //3rd way with Multi-Thread
        static int sum(int x1,int x2){
            int result=x1+x2;
            System.out.println("Thread name: " + Thread.currentThread().getName() + "get result of operation: "
            + x1 +"+" +x2+ "=" +result);
            return result;
        }
}
