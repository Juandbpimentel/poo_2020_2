import java.util.Vector;

public class helloworld{
    public static void main(String args[]){
        Vector<Long> fibonacci = new Vector<Long>();
        fibonacci.add((long)0);
        fibonacci.add((long)1);
        //int soma = 0;
        System.out.println(fibonacci.get(0));
        for(int i = 1;fibonacci.get(i-1)<=100 ; i++){
            if(i<2){
                System.out.println(fibonacci.get(i));
            }else{
                fibonacci.add(fibonacci.get(i-1)+fibonacci.get(i-2));
                System.out.println(fibonacci.get(i));
            }

        }
        //System.out.println();
    }
} 