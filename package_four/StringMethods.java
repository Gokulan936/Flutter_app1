package package_four;

public class StringMethods {
    public static void main(String[] args){
        String str="Hello World";
        String str1="    Hello World    ";

        String replace=str.replace('l', 'x');
        System.out.println(replace);

        String lower=str.toLowerCase();
        System.out.println(lower);

        String upper=str.toUpperCase();
        System.out.println(upper);

        int length=str.length();
        System.out.println(length);

        boolean isEqual=str.equals("Hello World");
        System.out.println(isEqual);

        String concadeted=str.concat("- Java Programming");
        System.out.println(concadeted);

        String indexrange=str.substring(0,5);
        System.out.println(indexrange);


        boolean isStringEqual=str.equalsIgnoreCase("hello WOrld");
        System.out.println(isStringEqual);

        System.out.println("Original"+':'+str1);
        String trims=str1.trim();
        System.out.println("Trimmed"+":"+trims);        


    } 
}
