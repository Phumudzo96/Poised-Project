public class Customer {
    // Listing variable attributes for the 'Customer' class.
    String name;
    int number;
    String email;
    String address;

    // Writing a constructor method to create a customer object.
    public Customer(String name, int number, String email, String address) {
        this.name = name;
        this.number = number;
        this.email = email;
        this.address = address;

    }

    public String getName() {
        return name;
    }

    public int getnumber() {
        return number;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String DisplayCustomer() {

        String output = "Name: " + name;
        output += "\nNumber: " + number;
        output += "\nEmail Address: " + email;
        output += "\nPhysical Address: " + address;

        return output;
    }
}
