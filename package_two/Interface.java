package package_two;

interface Father{
    abstract void art();
    abstract void run();
}
interface Mother{
    abstract void cook();
    abstract void sing();
}

class Interface implements Father,Mother{
    
    public void art(){
        System.out.println("Drawing Well");
    }
    
    public void run(){
        System.out.println("Running Fast");
    }
    
    public void cook(){
        System.out.println("Cooking Well");
    }
    public void sing(){
        System.out.println("Singing Wll");
    }
    public static void main(String[] args){
    
    Interface n=new Interface();
    n.art();
    n.run();
    n.cook();
    n.sing();
    
        
    }
}