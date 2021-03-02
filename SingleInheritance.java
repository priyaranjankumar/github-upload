class Test{
    int d =100;
}
public class SingleInheritance extends Test {
    int f=100;
    public static void main(String[] args) {
        SingleInheritance s1= new SingleInheritance();
        System.out.println(s1.d+s1.f);
    }
}
