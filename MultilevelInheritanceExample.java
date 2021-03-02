class Test{
int a=100;
}
class Test2 extends Test{
int b=100;
}
public class MultilevelInheritanceExample extends Test2 {
    int c=100;
    public static void main(String[] args) {
        MultilevelInheritanceExample m1= new MultilevelInheritanceExample();
        System.out.println(m1.a+m1.b+m1.c);
    }   
}
