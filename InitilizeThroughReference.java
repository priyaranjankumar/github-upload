class student{
    //main outside the class
    int id;
    String name;
}
class InitilizeThroughReference {
    public static void main(String[] args) {
        student s1= new student();
        s1.id=100;
        s1.name="Subham";
        System.out.println(s1.id);
        System.out.println(s1.name);
    }
}
