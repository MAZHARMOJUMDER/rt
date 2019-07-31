//A distinction between a class and a method/function to be noted is that a class is parameter-less and a function must have a parameter (can be empty parameter)
public class nissan {
    //it's a good practice to always initialize or set value AND assign a default value to it
     int year=0;  //year is of integer datatype
     int hp=0;    // hp is also integer datatype
     String model=""; // A model name is of String datatype

    public int getYear() {  //This is my method/function. getYear method/function
        return year; // a function with a datatype must return a value of the same datatype
    }

    public void setYear(int year) { // setYear method/function
        this.year = year;  //A void function DOES NOT have a return value
    } //This is another method or function where include parameter ()

    public int getHp() { //getHp method/function
        return hp;
    } //another method/function

    public void setHp(int hp) { //setHp method/function
        this.hp = hp;
    } //another method

    public String getModel() { //getModel method/function
        return model;
    }//another method

    public void setModel(String model) { //setModel method/function
        this.model = model;
    }//another method .In this method i wont get return value because void function doesnt have a return value.
}
