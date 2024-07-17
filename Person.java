//create a class called person.
//create a constructor with 3 parameters(persons name ,age and address).initialize the 3 fields.
//create a method to display persons detail.
//create a method named myDetails that accepts person object as parameter. the method shld call the display details method.
//pass the current instance of the persons object to a method called printCurrentInstance.
//create an obj in main class by your name.


public class Person {
    private String name;
    private int age;
    private String address;

    // Constructor with 3 parameters to initialize the fields
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Method to display person's details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    // Method to accept a Person object and call displayDetails method
    public void myDetails(Person person) {
        person.displayDetails();
    }

    // Method to print the details of the current instance of the Person object
    public void printCurrentInstance() {
        displayDetails();
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create an object in the main class by your name
        Person person = new Person("Wycliffe Muinde", 20, "Naivas,Allsops");
        person.myDetails(person); // Call myDetails method
        person.printCurrentInstance(); // Call printCurrentInstance method
    }
}
