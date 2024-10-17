import java.util.*;

public class Main{
    
    static class Member{
        int age;
        String name;
        int order;
        
        public Member(int age, String name, int order){
            this.age = age;
            this.name = name;
            this.order = order;
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        List<Member> members = new ArrayList<>();
        
        for(int i = 0; i < N; i++){
            int age = sc.nextInt();
            String name = sc.next();
            members.add(new Member(age, name, i));
        }
        
        Collections.sort(members, (m1, m2) -> {
            if(m1.age == m2.age){
                return Integer.compare(m1.order, m2.order);
            }else{
                return Integer.compare(m1.age, m2.age);
            }
        });
        
        StringBuilder sb = new StringBuilder();
        
        for(Member m : members){
            sb.append(m.age).append(' ').append(m.name).append('\n');
        }
        
        System.out.print(sb);
        sc.close();
    }
}
