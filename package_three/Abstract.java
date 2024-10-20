package package_three;

abstract class Gokul{
    int[] salary={200,100,130,400,103};
    String[] name={"Gokul","Rakesh","Pavan","Karthikha","Maajida"};
    abstract void Display();
}

class Infoysis extends Gokul{
    void Display(){
        int size=salary.length;
        for(int i=0;i<size;i++){
            System.out.println(name[i]+":"+salary[i]);
        }

    }
}
// class Sundar extends Gokul{
//     void Company(){
//         System.out.println("Karthikha : ZOHO");
//         System.out.println("Salary : "+salary);
//     }
// }
// class Gokulan extends Gokul{
//     void Company(){
//         salary=200;
//         System.out.println("Gokulan : ZOHO");
//         System.out.println("Salary : "+salary);
//     }
// }
public class Abstract {
    public static void main(String[] args){
        // Sundar k=new Sundar();
        // Gokulan g=new Gokulan();
        // g.Company();
        // k.Company();
        Infoysis i=new Infoysis();
        i.Display();
    }
}
