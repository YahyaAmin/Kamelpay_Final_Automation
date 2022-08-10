package Hooks;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class CLI {
    public static void executeCommand(String [] command) {
        try {

            Process process = Runtime.getRuntime().exec(command);
            process.waitFor();

        } catch (IOException | InterruptedException e) {
            System.out.println("Cause is: " + e.getCause());
            System.out.println("Message is: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {

        String projectpath = System.getProperty("user.dir");
        System.out.println(projectpath);

        String commandpath = "cd "+projectpath;
        System.out.println(commandpath);

//        String[] cmdArray = new String[1];
        String command = "mvn verify -DskipTests";
//        cmdArray[0] = commandpath + command;
//        cmdArray[2] = "mvn verify -DskipTests";
//
//        System.out.println(Arrays.deepToString(cmdArray));

        //executeCommand(new String[] {projectpath, command});

        executeCommand(new String[] {projectpath, command});
    }




}
