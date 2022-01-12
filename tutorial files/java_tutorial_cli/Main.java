import org.apache.commons.cli.*;
import org.apache.commons.cli.Options;
import java.io.* ;


//most parts of the code are borrowed from
//https://stackoverflow.com/questions/367706/how-do-i-parse-command-line-arguments-in-java
public class Main {


    public static void main(String[] args) throws Exception {

        Options options = new Options();

        Option input = new Option("i", "input", true, "input file path");
        input.setRequired(true);
        options.addOption(input);

        Option output = new Option("o", "output", true, "output file");
        output.setRequired(true);
        options.addOption(output);

        CommandLineParser parser = new DefaultParser();
        HelpFormatter formatter = new HelpFormatter();
        CommandLine cmd = null;//not a good practice, it serves it purpose 

        try {
            cmd = parser.parse(options, args);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
            formatter.printHelp("utility-name", options);

            System.exit(1);
        }
        

        String inputFilePath = cmd.getOptionValue("input");
        String outputFilePath = cmd.getOptionValue("output");
        
        FileWriter fw = new FileWriter(outputFilePath);
        fw.write ("hello I am writing a file \n") ;
        FileReader fr = new FileReader(inputFilePath);        
       int i ;
       while ((i = fr.read()) != -1)
 
            // Print all the content of a file
            fw.write((char)i);
        fw.close() ;
        //System.out.println(inputFilePath);
        //System.out.println(outputFilePath);

    }

}
