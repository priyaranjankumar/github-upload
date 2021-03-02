import org.graalvm.compiler.hotspot.phases.OnStackReplacementPhase;

public class ObjectandClassExample {
    //main within the class
    int id;
    String name;
    public static void main(String[] args) {
        ObjectandClassExample obj1= new ObjectandClassExample();
        System.out.println(obj1.id);
        System.out.println(obj1.name);
    } 
    
}
