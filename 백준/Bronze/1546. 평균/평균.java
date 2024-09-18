import java.util.Scanner;

public class Main{
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        double[] score = new double[N];
        double maxScore = 0;
        
        for(int i = 0; i < N; i++){
            score[i] = sc.nextDouble();
            if(score[i] > maxScore){
                maxScore = score[i];
            }
        }
        
        double sum = 0;
        
        for(int i = 0; i < N; i++){
            score[i] = (score[i] / maxScore) * 100;
            sum += score[i];
        }
        System.out.println(sum / N);
    }
}