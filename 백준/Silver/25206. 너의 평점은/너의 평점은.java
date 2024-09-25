import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        double totalP = 0;
        double totalC = 0;
        
        for(int i = 0; i < 20; i++){
            String S = sc.next();
            double C = sc.nextDouble();
            String G = sc.next();
            
            double gp = getgp(G);
            if(gp >= 0){
                totalP += C * gp;
                totalC += C;
            }
        }
        double gpa = totalP / totalC;
        System.out.printf("%.4f\n", gpa);
    }
    
    public static double getgp(String G){
        switch(G){
            case "A+": return 4.5;
            case "A0": return 4.0;
            case "B+": return 3.5;
            case "B0": return 3.0;
            case "C+": return 2.5;
            case "C0": return 2.0;
            case "D+": return 1.5;
            case "D0": return 1.0;
            case "F": return 0.0;
            case "P": return -1.0;
            default: return 0.0;
        }
    }
}