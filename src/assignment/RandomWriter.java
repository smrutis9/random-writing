package assignment;
import java.io.*;
import java.util.*;

/*
 * CS 314H Assignment 2 - Random Writing
 *
 * Your task is to implement this RandomWriter class
 */
public class RandomWriter implements TextProcessor {
    public int level;
    public String input;
    public String output;

    public static void main(String[] args) throws IOException {
      // validating that there are four inputs
      if (args.length != 4)
      {
        System.err.println("Must input four arguments");
        return;
      }

      // assigning arguments to variables
      String inputFilename = args[0]; //source
      String outputFilename = args[1]; //result
      int level = Integer.parseInt(args[2]); //k
      int length = Integer.parseInt(args[3]);

      //validating that k is 0 or greater
      if (level<0)
      {
        System.err.println("Level of analysis must be greater than or equal to zero");
        return;
      }

      //validating that output length is 0 or greater
      if (length<0)
      {
        System.err.println("Length of output must be greater than or equal to zero");
        return;
      }

      

      // validating that input file can be opened
      File inputFile = new File(inputFilename);
      if (!inputFile.canRead())
      {
        System.err.println("Input file cannot be opened");
        return;
      }

      // validating that output file can be created
      File outputFile = new File(outputFilename);
      if (!(outputFile.canWrite()&& outputFile.canRead()))
      {
        System.err.println("Output file cannot be created");
        return;
      }

      //creating randomwriter object and implementing methods read and write
      RandomWriter obj = new RandomWriter(level);
      obj.readText(inputFilename);
      obj.writeText(outputFilename, length);
      }
    

    // Unless you need extra logic here, you might not have to touch this method
    public static TextProcessor createProcessor(int level) {
      return new RandomWriter(level);
    }

    private RandomWriter(int level) {
      // Do whatever you want here
      this.level = level;
    }


    public void readText(String inputFilename) throws IOException {
      // reading input file
      File f = new File(inputFilename);
      Scanner s = new Scanner(f);
      
      // adding every character in input file to string to manipulate string
      input = "";
      while (s.hasNext())
      {
        input += s.nextLine() + "\n";
      }
      //validating that source has more than k characters
      if (input.length()<level)
      {
        System.err.println("Source must be greater than level of analysis");
        return;
      }
      s.close();
    }

    public void writeText(String outputFilename, int length) throws IOException {
      // creating output file
      FileWriter outputFile = new FileWriter(outputFilename);
      // random object to use random class
      Random r = new Random();

      // get random index that initial seed will start with
      int seedIndex = r.nextInt(input.length()-level);

      // creating seed
      String seed = input.substring(seedIndex, seedIndex+level);
      

      // creating arraylist to store possible values
      ArrayList<String> choices = new ArrayList<String>();
      String output = "";
      int indexChoices;

      // outputting length
      // addressing corner case
      while (output.length() < length)
      {
      for (int j = 0; j < length; j++)
      {
        // iterating through string of input
        for (int i=0; i < input.length()-level+1;i++)
        {
          // adding character after seed to arraylist of all single characters that follow each appearance of seed in the input
          if (seed.equals(input.substring(i, i+level)) && (i+level) != input.length())
          {
            choices.add(input.charAt(i+level)+"");
          }
        }
        // getting random index of choices to add to string
        while (choices.size()==0)
        {
          seedIndex = r.nextInt(input.length()-level);
          seed = input.substring(seedIndex, seedIndex+level);
          for (int i=0; i < input.length()-level+1;i++)
          {
          // adding character after seed to arraylist of all single characters that follow each appearance of seed in the input
          if (seed.equals(input.substring(i, i+level)) && (i+level) != input.length())
          {
            choices.add(input.charAt(i+level)+"");
          }
          }
        }
        
        indexChoices = r.nextInt(choices.size()); 
        // adding value in index to output string
        output += choices.get(indexChoices);
        // adding output to output file
        outputFile.write(choices.get(indexChoices));
        outputFile.flush(); // StackOverflow: https://stackoverflow.com/questions/1742361/flush-in-java-io-filewriter
        // adding new character to seed
        seed += choices.get(indexChoices);
        // changing seed to new seed that cuts off first character of previous seed
        seed = seed.substring(1);
        // clear choices for next character
        choices.clear();
        }
      }
      outputFile.close();
    }
}