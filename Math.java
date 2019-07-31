public class Math {

    public Math(int i) {

    }

    public static void main(String[] args) {
        //create an Integer object using one the below given constructors
        //1. Create an Integer object from int
        Math intObj1 = new Math(10);

    /*
    2. Create and Integer object from String. Please note that this method can
    throw NumberFormatException if string doesnt contain parsable number.
    */
        Integer intObj2 = new Integer("10");

        //print value of Integer objects
        System.out.println(intObj1);
        System.out.println(intObj2);
    }
}
