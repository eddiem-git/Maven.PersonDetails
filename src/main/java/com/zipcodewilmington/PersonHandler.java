package com.zipcodewilmington;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {

        this.personArray = personArray;
    }

    //given
    public String whileLoop() {
        String result = "";
        // create a `counter`
        // while `counter` is less than length of array
        // begin loop
        int counter = 0;
        //when
        while (counter < personArray.length ) {

            Person currentPerson = personArray[counter];
            String stringRepresentation = currentPerson.toString();
            result += stringRepresentation;
            counter++;
        }
        // use `counter` to identify the `current Person` in the array
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable

        // end loop
        //then
        return result;
    }


    public String forLoop() {
        StringBuilder result = new StringBuilder();

        // identify initial value

        // identify terminal condition
        // identify increment
        for (int i = 0; i <= personArray.length - 1; i++) {
            // use the above clauses to declare for-loop signature
            // begin loop
            // use `counter` to identify the `current Person` in the array
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable
            // end loop
            Person currentPerson = personArray[i];
            String stringRepresentation = currentPerson.toString();
            result.append(stringRepresentation);

            }
            return result.toString();
        }


        public String forEachLoop () {
           String result = "";
            // identify array's type
            // identify array's variable-name
            // use the above discoveries to declare for-each-loop signature
            for( Person person : personArray) {

                result += person.toString();
            }  // begin loop
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable
            // end loop
            return result;
        }


        public Person[] getPersonArray () {
            return personArray;
        }
    }
