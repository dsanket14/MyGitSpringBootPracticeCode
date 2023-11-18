import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
        1.Running Java File with single command
         initially using--> javac class.java -->to compile pgm
         --- java fileName---> to run pgm (java 11 uses only this)
        2.Java 11 adds a few new methods to the String class
         : isBlank-->check blank or not
           lines-->use to split by \n
           strip, stripLeading, stripTrailing--> removes spaces which unicode aware which is evaluation of trim()
           repeat-->repeat given string.
         */

        String multiLineString="India is my country. \nI am Indian.\n I Love my Country";
        List<String> list=multiLineString.lines()
                .filter(i->!i.isBlank())
                        .map(String::strip)
                                .collect(Collectors.toList());
        System.out.println("Initial String :"+multiLineString);
        System.out.println("Java 11 String :"+list);
        System.out.println("Repeat String :"+list.get(0).repeat(5));

        /*
        3.Local-Variable Syntax for Lambda
         */
        List<String> sampleList = Arrays.asList("Java", "Kotlin");
        String resultString = sampleList.stream()
                .map((var x) -> x.toUpperCase())
                .collect(Collectors.joining(", "));

        System.out.println("Java 11 use of var :"+resultString);
        /*
            6.Reading/Writing Strings to and from the Files
        */
        Path path = Files.writeString(Files.createTempFile("test", ".txt"), "This was posted on JD");
        System.out.println("File Written Successfully :"+path);
        String s = Files.readString(path);
        System.out.println(s);
        Files.deleteIfExists(path);
        System.out.println("File Deleted Successfully :"+path);

    }

        /*
           4.Nested Based Access Control
           private method accessible in nested class
            */
    private void myPrivate() {
    }

    class Nested {

        public void nestedPublic() {
            myPrivate();
        }
    }
}