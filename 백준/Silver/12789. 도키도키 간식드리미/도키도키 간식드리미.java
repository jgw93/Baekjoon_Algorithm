import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i = 0; i < N; i++){
            queue.offer(sc.nextInt());
        }
        
        Stack<Integer> stack = new Stack<>();
        int target = 1;
        
        while(!queue.isEmpty()){
            if(queue.peek() == target){
                queue.poll();
                target++;
            }else if(!stack.isEmpty() && stack.peek() == target){
                stack.pop();
                target++;
            }else{
                stack.push(queue.poll());
            }
        }
        
        while(!stack.isEmpty() && stack.peek() == target){
            stack.pop();
            target++;
        }
        System.out.println(target > N ? "Nice" : "Sad");
        sc.close();
    }
}