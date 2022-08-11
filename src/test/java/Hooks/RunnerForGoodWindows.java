package Hooks;

import java.io.File;

public class RunnerForGoodWindows {

    public static void mvnCommandRunner(){
        String [] arr = new String[2];
        arr [0] = "cd C:\\Users\\abc\\Documents\\GitHub\\Kamelpay_Final_Automation";
        arr [1] = "mvn verify -DskipTests";
        //GoodWindowsExec.main(arr);
        //GoodWindowsExec.main(new String [] {"cd C:\\Users\\abc\\Documents\\GitHub\\Kamelpay_Final_Automation"});
        //GoodWindowsExec.main(new String[] {"mvn verify -DskipTests"});

        File dir = new File ("C:\\Users\\abc\\Documents\\GitHub\\Kamelpay_Final_Automation");
        GoodWindowsExec.main(new String[] {"mvn verify -DskipTests"}, dir );
    }

    public static void main(String[] args) {
        mvnCommandRunner();
    }



}
