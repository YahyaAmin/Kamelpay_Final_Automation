package Tests;

import org.apache.commons.lang3.RandomStringUtils;
import java.util.Random;
import java.util.Random;

public class Useful_functions {

    public static String getRandomNumberLowerAndUpperBound(int lowerbound, int upperbound) {

        //random no of characters
        Random rand = new Random();
        int random_integer = rand.nextInt(upperbound - lowerbound) + lowerbound;


        String characters = "0123456789";
        String pwd = RandomStringUtils.random(random_integer, characters);
        return pwd;
    }



public static int getRandomDigit(int upperbound) {
    Random rand = new Random();

    // Obtain a number between [0 - 49].
    int n = rand.nextInt(upperbound) + 1;

// Add 1 to the result to get a number from the required range
// (i.e., [1 - 50]).
    return n;

}





}
