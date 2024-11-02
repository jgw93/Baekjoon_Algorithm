import java.util.*;
import java.io.*;

public class Main{
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];
        int[] frequency = new int[8001];
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i < N; i++){
            numbers[i] = Integer.parseInt(br.readLine());
            sum += numbers[i];
            
            if(numbers[i] > max) max = numbers[i];
            if(numbers[i] < min) min = numbers[i];
            
            frequency[numbers[i] + 4000]++;
        }
        
        double mean = (double) sum / N;
        System.out.println(Math.round(mean));
        
        Arrays.sort(numbers);
        System.out.println(numbers[N / 2]);
        
        int mode = 0;
        int maxFreq = 0;
        boolean second = false;
        
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > maxFreq) {
                maxFreq = frequency[i];
                mode = i - 4000;
                second = true;
            } else if (frequency[i] == maxFreq && second) {
                mode = i - 4000;
                second = false;
            }
        }
        System.out.println(mode);
        
        System.out.println(max - min);
    }
}