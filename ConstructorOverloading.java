class Student{
    int id,age;
    String name;
    Student(int id, String name){
        this.id= id;
        this.name= name;
    }
    Student(int id, String name, int age){
        this.id= id;
        this.name= name;
        this.age= age;
    }
    void display(){
        System.out.println(id+" : "+name+" : "+age);
    }
}
public class ConstructorOverloading {
    public static void main(String[] args) {
        Student s1= new Student(1000, "Subham");
        Student s2= new Student(1000, "Subham",24);
        s1.display();
        s2.display();
        
    }
    
}
