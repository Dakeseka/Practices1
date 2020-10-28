package se.Lexicon;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class App
{
    public static void main( String[] args ) {
        System.out.println("Hello World!");

        //First one: Create a String with your first name as content. Print out the String object to the console.

        String firstName1 = "David";
        System.out.println(firstName1);

        //Create two Strings. One with your first name and the other with your
        //last name. Print out both Strings to the console with a ” ” separating
        //them.

        String firstName2 = "David";
        String lastName = "Callander";
        System.out.println(firstName2 + " " + lastName);

        //Create two variables with decimal values. Create a third decimal
        //variable called result. Assign the sum of the two first variables to
        //result.

        double decimal1 = 2.5;
        double decimal2 = 3.5;
        double result = decimal1 + decimal2;
        System.out.println(result);

    }
}