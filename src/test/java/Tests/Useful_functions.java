package Tests;

import org.apache.commons.lang3.RandomStringUtils;
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


}
