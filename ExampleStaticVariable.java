class Student{
    int id;
    static String name;
    // static variable is used to save memory 
    Student(int id, String name){
        this.id= id;
        this.name= name;

    }
    Student(int id){
        this.id= id;
        
    }
    void display(){
        System.out.println(id+" : "+name);
    }
}
public class ExampleStaticVariable {
    public static void main(String[] args) {
        Student s1 = new Student(100, "Subham");
        Student s2 = new Student(101);
        s1.display();
        s2.display();

    }
    
}
