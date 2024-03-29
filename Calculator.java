public class Calculator {

    /**
     * @author Jahidul Islam
     * Declare an String variable named statement
     * */

    String statement;

    /**
     * Create a default constructor of Calculator class and provide a
     * print statement "This constructor can create Basic calculator object" in body
     *
     * */
    public Calculator() {
        // This constructor has one parameter, statement
        System.out.println("This constructor can create Basic calculator object");
    }
    /**
     * Create a parameterized constructor of Calculator class with the String statement parameter
     * Assign description to instance variable statement using this keyword
     *
     * */
    public Calculator(String statement) {
        // This constructor has one parameter, statement
        statement=this.statement;
        System.out.println(statement);
    }


    public int add(int a, int b){
        int result = a+b;
        System.out.println("Total: " + result);
        return result;
    }
    /**
     * Create a method which can multiply two int variables
     * Remember we want to use this method again and again like add() method
     *
     * */

    public int multiply (int a, int b)
    {
        int result = a*b;
        System.out.println("Total: "+ result);
        return result;
    }



    /**
     * Create a method which can divide two int variables
     * Remember we want to use this method again and again like add() method
     *
     * */

    public int divide (int a, int b)
    {
        int result = a/b;
        System.out.println("Total: "+result);
        return result;

    }






    public static void main(String[] args) {
        /**
         * Let us assume that this calculator has two mode Basic and Scientific
         *
         * 1. create an instance of the class Calculator using default constructor named basicCalculator
         * 2. using basicCalculator reference variable add two value 4 and 5
         * 3. using basicCalculator reference variable multiply two value 4 and 5
         *
         * */
        Calculator basicCalculator = new Calculator();
        basicCalculator.add(4,5);
        basicCalculator.multiply(4,5);


        /**
         *
         * 1. create an instance of the class Calculator using parameterized  constructor named scientificCalculator
         * 2. using scientificCalculator reference variable add two value 4 and 5
         * 3. using scientificCalculator reference variable multiply two value 4 and 5
         * */

        Calculator scientificCalculator = new Calculator();
        scientificCalculator.add(4,5);
        scientificCalculator.multiply(4,5);
        scientificCalculator.divide(4,5);
    }
}

