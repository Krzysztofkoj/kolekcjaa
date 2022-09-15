import org.w3c.dom.ls.LSOutput;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class main {
    public static void main(String[] args) {
       Set<Integer> wylosowane = new HashSet<>();
       for(int i = 0 ; i<6;i++){
           wylosowane.add((int)(Math.random()*10));
       }
        System.out.println("wylosowane:"+wylosowane);


        System.out.println("Podaj 6 liczb");
        for(int i=0;i<6;i++){
            System.out.println("Liczba "+i);
            wpisane.add(klawiatura.nextInt());
            int wczytanaWartosc =klawiatura.nextInt();
            while(wpisane.contains(wczytanaWartosc)){
                System.out.println("Taka liczba już została podana podaj inną");
                wczytanaWartosc = klawiatura.nextInt();
            }
            wpisane.add(wczytanaWartosc);
        }
        System.out.println("Wpisane "+wpisane);
    }

    }
}

