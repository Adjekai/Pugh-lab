# java_tutorial_cli
Steps to run first java code which uses apache command line.
This code takes and input file through command line interface and generates an output file in which all the data in the input file is writtenplus a header sentence will be added. This code is for tutorial and educational purposes only.


The code can be run by simply typiing the following command:

java -jar Main.jar -i input_file.txt -o output_file.txt


To compile and run the code, perform the following steps:

1- Add the path of the command line package to java classpath.

export CLASSPATH=${CLASSPATH}:/path_to_clone_dir/java_tutorial_cli/commons-cli-1.4.jar

2- Compile the code which creates a Main.class file. 

javac Main.java

3- Run the code:

java Main -i input_file.txt -o output_file.txt


To compile the code and create a jar file including dependency jar files, perform the following steps:

1- Add the path of the command line package to java classpath.

export CLASSPATH=${CLASSPATH}:/path_to_clone_dir/java_tutorial_cli/commons-cli-1.4.jar

2- Compile the code which creates a Main.class file. 

javac Main.java

3- Create a jar file by letting java knows the classpaths through manifest.txt file.

jar -cvfm Main.jar Manifest.txt Main.class

4- Run the jar file

java -jar Main.jar -i input_file.txt -o output_file.txt




