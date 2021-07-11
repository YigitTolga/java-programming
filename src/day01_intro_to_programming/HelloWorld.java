package day01_intro_to_programming;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!"+ "\"");
        String button1="//a[@title='Reset']";
        String button2="div[@class='column-manager dropdown']";
        String follow = "//following-sibling::";

        String xpath = "\""+button1+follow+button2+"\"";
        System.out.println(xpath);

    }

}
