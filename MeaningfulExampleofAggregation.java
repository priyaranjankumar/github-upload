class Address{
    String city,country;
    Address(String city,String country){
        this.city=city;
        this.country=country;
    }
}
class Employee{
    Address address;
    int id;
    String name;
    Employee(int id, String name, Address address){
        this.id= id;
        this.name=name;
        this.address= address;
        
    }
    void show(){
        System.out.println(id +" : "+name+" : "+address.city+" : "+address.country);
    }
}
public class MeaningfulExampleofAggregation {
    public static void main(String[] args) {
        Address a1= new Address("city", "country");
    Employee e1 = new Employee(100, "name", a1);
    e1.show();
    }


    
}
