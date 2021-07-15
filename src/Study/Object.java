package Study;

import java.util.Arrays;

public class Object {
    public static void main(String[] args) {
        // 012345678910
        String word = "Java is fun Java";
        int sizeOfWord = word.length();

        word.substring(2);

        System.out.println(word.substring(word.indexOf("a")));
        System.out.println(word.charAt(3));

        System.out.println(word.indexOf('a'));
        System.out.println(word.indexOf("1", 2));
        System.out.println(word.replace('a', 'd'));
        System.out.println(word.contains("J")); //return boolean
        System.out.println(word.equals("Java")); //return boolean
        System.out.println(word.trim()); //return String, just trimming space beginning and end of the word.
        String word1 = "";
        System.out.println(word1.isEmpty()); // return boolean, checking variable is there any value or not.
        System.out.println(word.endsWith("is fun")); //return boolean, checking variable ending with it.
        String[] arr = word.split(" "); // return array
        String nonDup = "";
        for (String each : arr) {
            if (!nonDup.contains(each)) {
                nonDup += " " + each;
            }
        }

                 //heap
        //String reverse=""; garbage collector.
        //String reverse="A";
        //String reverse="AG";
        //String reverse="AGL";
        //String reverse="AGLO";
        //String reverse="AGLOT";

        System.out.println(nonDup.trim());
        word.charAt(0);
        String word2 = "TOLGATT";
        String reverse = "";
        for (int i = word2.length()-1; i >= 0; i--) {
            reverse += word2.charAt(i);
        }
        System.out.println(reverse);
        System.out.println(word2.replace(word2.charAt(1)+"", "Sds"));
        System.out.println(word2.lastIndexOf('A'));
        System.out.println(word2.concat(word));
        System.out.println(word2.replaceAll("T", "B"));
        System.out.println(word2.startsWith("L", 2));//Return boolean

    }
}
//a
//v
