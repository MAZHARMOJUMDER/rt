public class Buff {
    // Static method
    static void myStaticMethod() {
        System.out.println("People are good");
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("I dont like fat people");
    }
    // Main method
    public static void main(String[ ] args) {
        myStaticMethod(); // Call the static method
        // myPublicMethod(); This would output an error

        Buff myObj = new Buff(); // Create an object of MyClass
        myObj.myPublicMethod(); // Call the public method
    }
}