import java.util.*;
public class Score {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String score = "0";
        user1 a = new user1();
        user2 b = new user2();
        HeadQuater obj = new HeadQuater();
        obj.register(a);
        obj.register(b);
        while (!score.isEmpty()) {
            System.out.print("Enter Score ");
            score = inp.nextLine();
            if (!score.isEmpty()) {
                obj.setSomeData(score);
            }
            inp.close();
        }
        
    }  
    
}
