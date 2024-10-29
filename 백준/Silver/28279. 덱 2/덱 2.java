import java.util.*;
import java.io.*;

public class Main{
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        
        int N = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < N; i++){
            String[] command = br.readLine().split(" ");
            
            switch (command[0]) {
                case "1":  // 덱의 앞에 추가
                    deque.addFirst(Integer.parseInt(command[1]));
                    break;
                case "2":  // 덱의 뒤에 추가
                    deque.addLast(Integer.parseInt(command[1]));
                    break;
                case "3":  // 덱의 앞에서 제거
                    sb.append(deque.isEmpty() ? -1 : deque.pollFirst()).append('\n');
                    break;
                case "4":  // 덱의 뒤에서 제거
                    sb.append(deque.isEmpty() ? -1 : deque.pollLast()).append('\n');
                    break;
                case "5":  // 덱의 크기 출력
                    sb.append(deque.size()).append('\n');
                    break;
                case "6":  // 덱이 비어 있는지 확인
                    sb.append(deque.isEmpty() ? 1 : 0).append('\n');
                    break;
                case "7":  // 덱의 앞 요소 출력
                    sb.append(deque.isEmpty() ? -1 : deque.peekFirst()).append('\n');
                    break;
                case "8":  // 덱의 뒤 요소 출력
                    sb.append(deque.isEmpty() ? -1 : deque.peekLast()).append('\n');
                    break;
            }
        }
        System.out.print(sb);
    }
}