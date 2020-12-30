package Christmas;

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
        boolean addItem = false;

        String userName = input.getString("Santa here 🎅 What is your name, user?");

        String firstChristmasItem = input.getString("Nice to meet you " + userName + "! \nI'm making my Christmas List for next year and \nI noticed I didn't seem to have your list. Let's fix that! \n Enter one item you would like \nfor Christmas down below:");

        writeToFile(firstChristmasItem);

        addItem = input.yesNo("Would you like to add another item to your Christmas list?[yes/no]:");

        do {
            String newChristmasItem = input.getString("Add an item to your  Christmas List:");
            writeToFile(newChristmasItem);
            addItem = input.yesNo("Would you like to add another item to your Christmas list?[yes/no]:");
        } while(addItem = true);

        System.out.println("Here is your Christmas List:");

        List<String> christmasList = Files.readAllLines(filePath);

        for (int i = 0; i < christmasList.size(); i += 1) {
            System.out.println((i + 1) + ": " + christmasList.get(i));
        }

        System.out.println("Goodbye!");
    }


     //Math Method
     public static void main(String[] args) throws IOException {
        //Instantiate a Santa Object
         Santa christmasList = new Santa("data", "christmasList.txt", "christmasList.log");
//         christmasList.writeToLog("Successfully read the " + christmasList.getFileName() + " file!");

         christmasList.santaAsks();
     }
}
