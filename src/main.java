import java.util.HashSet;
import java.util.Set;

public class main {
    public static void main(String[] args) {
       Set<Integer> wylosowane = new HashSet<>();
       for(int i = 0 ; i<6;i++){
           wylosowane.add((int)(Math.random()*10));
       }
        System.out.println("wylosowane:"+wylosowane);
    }
}

