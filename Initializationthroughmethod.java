class Student{
    int id;
    String name;

    void getValue(int i, String n){
        id=i;
        name=n;
    }
}
public class Initializationthroughmethod {
    public static void main(String[] args) {
        Student s1= new Student();
        s1.getValue(100,"subham");
        new Student().getValue(100, "Hello"); // calling a anonynous object
        System.out.println(s1.id);
        System.out.println(s1.name);
    }
    
}
