package assignment;

import java.io.*;
import java.util.*;

public class Tester {
    public static void main(String[] args) throws IOException {

        // testing if less than four arguments are input, should print "Must input four arguments"
                //RandomWriter.main(new String[]{"test_books/CatInTheHat.txt" , "output.txt", "0"});

        // testing if k is negative, should print "Level of analysis must be greater than or equal to zero"
                //RandomWriter.main(new String[]{"test_books/CatInTheHat.txt" , "output.txt", "-1", "10"});

        // testing if length is negative, should print "Length of output must be greater than or equal to zero"
                //RandomWriter.main(new String[]{"test_books/CatInTheHat.txt" , "output.txt", "1", "-2"});

        // testing if source is less than k, should print "Source must be greater than level of analysis"
                //RandomWriter.main(new String[]{"test_books/CatInTheHat.txt" , "output.txt", "50", "60"});

        // testing if input file can be opened, should print "Input file cannot be opened"
                //RandomWriter.main(new String[]{"test_books/input.txt" , "output.txt", "2", "3"});

        // testing if output file can be opened/created, should print "Output file cannot be created"
                //RandomWriter.main(new String[]{"test_books/CatInTheHat.txt" , ".txt", "2", "30"});

        // testing that seed is as many characters as level
                //RandomWriter.main(new String[]{"test_books/CatInTheHat.txt" , "output.txt", "3", "3"});

        // testing that choices arraylist includes all possible characters, should print ""
                //RandomWriter.main(new String[]{"test_books/CatInTheHat.txt" , "output.txt", "3", "3"});

        // testing read method
                // RandomWriter.main(new String[]{"test_books/CatInTheHat.txt" , "output.txt", "10", "40"});
                // RandomWriter obj1 = (RandomWriter) RandomWriter.createProcessor(Integer.parseInt("10"));
                // obj1.readText("test_books/CatInTheHat.txt");
                // System.out.println(obj1.input);

        // testing write method
                // RandomWriter.main(new String[]{"test_books/MuchAdo.txt" , "output.txt", "10", "40"});
                // File f = new File("output.txt");
                // Scanner s = new Scanner(f);
                // String output = "";
                // while (s.hasNext())
                // {
                //   output += s.nextLine() + "\n";
                // }
                // System.out.println(output); //matches with output

         // testing edge/corner case
                // RandomWriter.main(new String[]{"test_books/CatInTheHat.txt" , "output.txt", "3", "3000000"});

         // testing that output length is equal to length 
                // RandomWriter.main(new String[]{"test_books/MuchAdo.txt" , "output.txt", "10", "40"});
                // File f = new File("output.txt");
                // Scanner s = new Scanner(f);
                // String output = "";
                // while (s.hasNext())
                // {
                //   output += s.nextLine() + "\n";
                // }
                // System.out.println(output); //matches with output
                // System.out.println(output.length()-1); // -1 to eliminate new line
                
    }

}
