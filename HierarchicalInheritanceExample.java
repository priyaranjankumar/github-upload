class Test{
int a=100;
}
class Test1 extends Test{
int b=100;
}
public class HierarchicalInheritanceExample extends Test{
    public static void main(String[] args) {
        HierarchicalInheritanceExample h1 =new HierarchicalInheritanceExample();
        System.out.println(h1.a);
        Test1 t1= new Test1();
        System.out.println(t1.a+t1.b);
    }
    
}
