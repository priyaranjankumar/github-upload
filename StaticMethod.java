class Student{
    int id;
    String name;
    static int age=20;
    static void test(){
        age=24;
            
        // can only change static data value 
        // super can not be used in static
    }
    Student(int id, String name){
        this.id= id;
        this.name= name;
    }
    void display(){
        System.out.println(id+" : "+name+" : "+age);
    }
}
public class StaticMethod {
    public static void main(String[] args) {
        //calling static function before invoking the object
        Student.test();
        Student s1 = new Student(100, "Subham Mishra");
        s1.display();
    }
    
}
