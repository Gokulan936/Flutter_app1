package package_four;
import java.util.*;

public class Strings {
    public static void main(String[] args){
     Scanner scanner=new Scanner(System.in);
     int size=scanner.nextInt();
     String[] a=new String[size];
     for(int i=0;i<size;i++){
        a[i]=scanner.nextLine();
     }
     
     for(String var:a){
        System.out.println(var);
     }
    }
}
