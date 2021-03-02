class Test{
    void display(){
        System.out.println(" Simple Print Stream Out");
    }
}
public class AggregationExample {
    Test t;
    // Aggregation 
    // Has a Relations
    void show(){
        t = new Test();
        t.display();
    }
    
    public static void main(String[] args) {
        AggregationExample ag= new AggregationExample();
        ag.show();
    }
}
