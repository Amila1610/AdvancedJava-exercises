package seven.multiThread;

import java.util.Arrays;
import java.util.List;

public class MultiThreadingExample {
    public static final int MAX=25000;

    public static void main(String[] args) {
        List<Double> numbers= Arrays.asList(1.0,2.0,34.34,343.12,32.23,434.2,34.6);
        System.out.println("Processor core available: " + Runtime.getRuntime().availableProcessors());

        long currentTimeInMiliseconds=System.currentTimeMillis();

        double result= numbers.parallelStream()
                              .map(MultiThreadingExample::compute)
                               .reduce(0.0,(x1,x2)->x1+x2);
        System.out.println(result);
        
        long time=System.currentTimeMillis()-currentTimeInMiliseconds;
        long seconds=time/1000;
        System.out.println("He needed: " + seconds + " seconds to get the job done(compute).");
    }

    static double compute(double value){
        System.out.println("Thread's name: " + Thread.currentThread().getName());
        double sum=0;
        for(int i=0;i<MAX;i++){
            int j;
            for(j=0; j<MAX; j++){
                sum=sum+Math.sqrt(i*j);
            }
        }
        return value+sum;
    }
}
