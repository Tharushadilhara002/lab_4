package Q4;

public class Bicycle {
    // Data Member - Owner object use karanawa (String valin nemei)
    private Owner owner;

    // No-Arg Constructor
    public Bicycle() {
        this.owner = new Owner(); // default owner
    }

    // Parameterized Constructor
    public Bicycle(String name, String num) {
        this.owner = new Owner(name, num);
    }

    // Owner object getter
    public Owner getOwner() {
        return owner;
    }

    // Owner object setter
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    // Convenience methods
    public String getOwnerName() {
        return owner.getOwnerName();
    }

    public void setOwnerName(String name) {
        owner.setOwnerName(name);
    }

    public String getPhoneNo() {
        return owner.getPhoneNo();
    }

    public void setPhoneNo(String num) {
        owner.setPhoneNo(num);
    }
}