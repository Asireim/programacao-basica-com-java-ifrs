package moduloI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercicio12 {
    public static void main(String[] args) {

        List<String> dias = new ArrayList<>(Arrays.asList("first", "second", "third", "fourth", "fifth", "sixth",
                "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"));

        List<String> presentes = new ArrayList<>(Arrays.asList("a partridge in a pear tree.",
                "two turtle doves,",
                "three french hens,",
                "four calling birds,",
                "five gold rings,",
                "six geese a-laying,",
                "seven swans a-swimming,",
                "eight maids a-milking,",
                "nine ladies waiting,",
                "ten lords a-leaping,",
                "eleven pipers piping,",
                "twelve drummers drumming,"));

        for (int i = 0; i < dias.size(); i++) {

            System.out.println("On the " + dias.get(i) +
                    " day of Christmas, my love gave to me");

            for (int j = i; j >= 0; j--) {
                if (j == 0 && i > 0) {
                    System.out.println("and " + presentes.get(j));
                } else {
                    System.out.println(presentes.get(j));
                }
            }

            System.out.println();
        }
    }
}
