import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        double totalP = 0;
        double totalC = 0;
        
        for (int i = 0; i < 20; i++) {
            String[] input = br.readLine().split(" ");
            double C = Double.parseDouble(input[1]);
            double gp = getgp(input[2]);
            
            if (gp >= 0) {
                totalP += C * gp;
                totalC += C;
            }
        }
        
        double gpa = totalP / totalC;
        bw.write(String.format("%.4f\n", gpa));
        bw.flush();
        bw.close();
        br.close();
    }
    
    public static double getgp(String G) {
        switch (G) {
            case "A+": return 4.5;
            case "A0": return 4.0;
            case "B+": return 3.5;
            case "B0": return 3.0;
            case "C+": return 2.5;
            case "C0": return 2.0;
            case "D+": return 1.5;
            case "D0": return 1.0;
            case "F":  return 0.0;
            case "P":  return -1.0;
            default:   return 0.0;
        }
    }
}
