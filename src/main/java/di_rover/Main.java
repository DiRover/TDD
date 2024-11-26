package di_rover;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(1, "John");
        phoneBook.add(44, "Smith");
        phoneBook.add(21, "Alan");
        phoneBook.add(17, "Sam");

        phoneBook.printAllNames();
    }
}