public class main {
    public static void main(String[] args) {
        System.out.println("Losowanie 6 liczb");
        int [] wylosowane =new int[6];
        for(int i=0; i<wylosowane.length;i++){
            wylosowane[i] =(int)(Math.random()*100 +1);
        }
        for(int wylosowaneWartosc :wylosowane){
            System.out.println(wylosowaneWartosc+"");
        }
    }
}

