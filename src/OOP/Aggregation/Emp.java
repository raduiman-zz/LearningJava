package OOP.Aggregation;

public class Emp {
    int id;
    String name;
    Address address;

    public Emp(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    void display() {
        System.out.println(id + " " + name);
        System.out.println(address.city + " " + address.state + " " + address.country);
    }

    public static void main(String[] args) {
        Address address1 = new Address("Cavnic", "Maramures", "Romania");
        Address address2 = new Address("Baia Mare", "Maramures", "Romania");
        Emp e = new Emp(111, "asdfasd", address1);
        Emp e1 = new Emp(112, "fasdad", address2);
        e.display();
        e1.display();
    }
}
