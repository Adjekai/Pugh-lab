import java.io.*;
import org.apache.commons.cli.*;
public class readme {

    public static void main(String[] args) {

        Options options = new Options();

        Option input = new Option("i", "input", true, "input file path");
        input.setRequired(true);
        options.addOption(input);

        Option output = new Option("o", "output", true, "output file");
        output.setRequired(true);
        options.addOption(output);

        CommandLineParser parser = new DefaultParser();
        HelpFormatter formatter = new HelpFormatter();
        CommandLine cmd = null;
        File originalFile = new File("readme.txt");
        File newFile = new File(originalFile.getParent(), "writeme.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(originalFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(newFile))) {
            String s;
            while ((s = br.readLine()) != null) {
                bw.write(s);
                bw.newLine();
                bw.flush();
                bw.close();
            }
        } catch (IOException e) {
            System.err.println("error during copying: " + e.getMessage());
            
        }
    }
}