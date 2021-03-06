package christmas;

import util.Input;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class Santa {
    //Properties for the Santa class
    private String directoryName;
    private String fileName;
    private String logFileName;
    private Path directoryPath;
    private Path filePath;
    private Path logFilePath;
    private List<String> fileLines;
    private List<String> logFileLines;

    //public static Array property that stores 9 (or 10) instances of Reindeer objects
    public static Reindeer[] reindeers = new Reindeer[10];




    //Getters and Setters for properties
    public String getDirectoryName() {
        return directoryName;
    }

    public void setDirectoryName(String directoryName) {
        this.directoryName = directoryName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getLogFileName() {
        return logFileName;
    }

    public void setLogFileName(String logFileName) {
        this.logFileName = logFileName;
    }

    public Path getDirectoryPath() {
        return directoryPath;
    }

    public void setDirectoryPath(Path directoryPath) {
        this.directoryPath = directoryPath;
    }

    public Path getFilePath() {
        return filePath;
    }

    public void setFilePath(Path filePath) {
        this.filePath = filePath;
    }

    public Path getLogFilePath() {
        return logFilePath;
    }

    public void setLogFilePath(Path logFilePath) {
        this.logFilePath = logFilePath;
    }

    public List<String> getFileLines() {
        return fileLines;
    }

    public void setFileLines(List<String> fileLines) {
        this.fileLines = fileLines;
    }

    public List<String> getLogFileLines() {
        return logFileLines;
    }

    public void setLogFileLines(List<String> logFileLines) {
        this.logFileLines = logFileLines;
    }



    //Santa Constructor
    public Santa(String directoryName, String fileName, String logFileName) throws IOException {
        this.directoryName = directoryName;
        this.fileName = fileName;

        //Instantiating Path values
        this.directoryPath = Paths.get(directoryName);
        this.filePath = Paths.get(directoryName, fileName);
        this.logFilePath = Paths.get(directoryName, logFileName);

        //Check if LOGFILE exists, and create if it doesn't currently exist
        if(Files.notExists(this.logFilePath)) {
            try {
                Files.createFile(this.logFilePath);
            } catch (IOException e) {
                throw new IOException("Unable to create the logfile (" + this.logFileName + ")!");
            }
        }

        //Check if DIRECTORY exists, and create if it doesn't currently exist
        if(Files.notExists(this.directoryPath)) {
            try {
                Files.createDirectories(this.directoryPath); //will create any missing parent directories along with the enclosing directory
            } catch (IOException e) {
                throw new IOException("Unable to create the data directory (" + this.directoryName + ")!");
            }
        }

        //Check if FILE exists, and create if it doesn't currently exist
        if(Files.notExists(this.filePath)) {
            try {
                Files.createFile(this.filePath);
            } catch (IOException e) {
                Files.write(this.logFilePath, Arrays.asList(e.getMessage()), StandardOpenOption.APPEND);
                throw new IOException("Unable to create the data file (" + this.fileName + ")!");
            }
        }

    }



    //Custom Method to writeToLog
    public void writeToLog(String message) throws IOException {
        try {
            // write the string 'message' to the log file of THIS INSTANCE of a Santa object
            Files.write(this.logFilePath, Arrays.asList(message), StandardOpenOption.APPEND);
        } catch (IOException e) {
            Files.write(this.logFilePath, Arrays.asList(e.getMessage()), StandardOpenOption.APPEND);
            throw new IOException("Unable to write custom message to log file");
        }
    }



    //Method to writeToFiles
    public void writeToFile(String message) throws IOException {
        try {
            // write the string 'message' to the FILE of THIS INSTANCE of a Santa object
            Files.write(this.filePath, Arrays.asList(message), StandardOpenOption.APPEND);
        } catch (IOException e) {
            Files.write(this.filePath, Arrays.asList(e.getMessage()), StandardOpenOption.APPEND);
            throw new IOException("Unable to write custom message to log file");
        }

    }



    //Method to prompt user to tell Santa what they want for Christmas
    public void santaAsks() throws IOException {
        Input input = new Input();
        boolean userContinues = true;
        boolean userChoice;


        String userName = input.getString("HO! HO! HO! Santa here 🎅 What is your name, user?");
        System.out.println("❄️❄️❄️❄️❄️❄️❄️❄️❄️❄️❄️❄️❄️❄️❄️❄️❄️❄️❄️❄️❄️❄️❄️❄️");

        System.out.printf("Nice to meet you, %S!%n", userName.toUpperCase());

        System.out.println("\nI'm making my Christmas List for next year and \nI noticed that I didn't seem to have your list. \n\nLet's fix that!");
        System.out.println("❄️❄️❄️❄️❄️❄️❄️❄️❄️❄️❄️❄️❄️❄️❄️❄️❄️❄️❄️❄️❄️❄️❄️❄️");


        //User Prompt
        do {
            System.out.println("Add one item to your Christmas List:");
            String newItem = input.getString();

            writeToFile(newItem);

            userChoice = input.yesNo("Would you like to finalize your Christmas List?[yes/no]:");

            //Conditional to see if user wants to finalize their list
            if(userChoice) {
                userContinues = false;
            } else {
                String anotherNewItem = input.getString("Enter a new item to add to your Christmas List:");
                writeToFile(anotherNewItem);

                //Asking user if they want to finalize their list
                boolean newUserChoice = input.yesNo("Would you like to finalize your Christmas List?[yes/no]:");

                //Conditional to see if user wants to finalize their list
                if(newUserChoice) {
                    userContinues = false;
                }
            }
        } while(userContinues);


        //Final Message to User
        System.out.println("❄️❄️❄️❄️❄️❄️❄️❄️❄️❄️❄️❄️❄️❄️❄️❄️❄️❄️❄️❄️❄️❄️❄️❄️");
        System.out.printf("Thank you for your input, %S!%n%n", userName);
        System.out.println("Here is your Christmas List:");

        List<String> christmasList = Files.readAllLines(filePath);

        for (int i = 0; i < christmasList.size(); i += 1) {
            System.out.println((i + 1) + ": " + christmasList.get(i));
        }

        System.out.println("❄️❄️❄️❄️❄️❄️❄️❄️❄️❄️❄️❄️❄️❄️❄️❄️❄️❄️❄️❄️❄️❄️❄️❄️");
    }





     //Math Method
     public static void main(String[] args) throws IOException {
//        //TODO: Instantiate a Santa Object
//         Santa christmasList = new Santa("data", "christmasList.txt", "christmasList.log");
//
//         christmasList.santaAsks();


         //TODO: Creating Instances of Santa's Reindeer
         Reindeer dasher = new Reindeer("Dasher");
         Reindeer dancer = new Reindeer("Dancer");
         Reindeer prancer = new Reindeer("Prancer");
         Reindeer vixen = new Reindeer("Vixen");
         Reindeer comet = new Reindeer("Comet");
         Reindeer cupid = new Reindeer("Cupid");
         Reindeer donner = new Reindeer("Donner");
         Reindeer blitzen = new Reindeer("Blitzen");
         Reindeer rudolph = new Reindeer("Rudolph");
         Reindeer olive = new Reindeer("Olive");



         //TODO: Give each Reindeer instance a position in the Array you just created.
         // Array was created at the top of the class (see properties for santa class).
         reindeers[0] = dasher;
         reindeers[1] = dancer;
         reindeers[2] = prancer;
         reindeers[3] = vixen;
         reindeers[4] = comet;
         reindeers[5] = cupid;
         reindeers[6] = donner;
         reindeers[7] = blitzen;
         reindeers[8] = rudolph;
         reindeers[9] = olive;

         //Printing contents within Array to assure they were saved at the appropriate
         //position within the Array
         for(Reindeer reindeer : reindeers) {
             System.out.println(reindeer.getName());
         }

     }
}
