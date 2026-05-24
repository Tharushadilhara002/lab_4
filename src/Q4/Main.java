package Q4;

public class Main {
    public static void main(String[] args) {
        // Constructor ekena object hadanawa
        Bicycle bike1 = new Bicycle("Kamal Perera", "0771234567");
        System.out.println("Bicycle 1 Owner : " + bike1.getOwnerName());
        System.out.println("Phone No        : " + bike1.getPhoneNo());

        System.out.println();

        // Owner object hadala set karanawa
        Owner newOwner = new Owner("Nimal Silva", "0769876543");
        Bicycle bike2 = new Bicycle();
        bike2.setOwner(newOwner);
        System.out.println("Bicycle 2 Owner : " + bike2.getOwnerName());
        System.out.println("Phone No        : " + bike2.getPhoneNo());
    }
}