package Hooks;

public class RunnerForGoodWindows {

    public static void mvnCommandRunner(){
        String [] arr = new String[2];
        arr [0] = "cd C:\\Users\\abc\\Documents\\GitHub\\Kamelpay_Final_Automation";
        arr [1] = "mvn verify -DskipTests";
        //GoodWindowsExec.main(arr);
        GoodWindowsExec.main(new String [] {"cd C:\\Users\\abc\\Documents\\GitHub\\Kamelpay_Final_Automation"  "mvn verify -DskipTests"});
        //GoodWindowsExec.main(new String[] {"mvn verify -DskipTests"});
    }

    public static void main(String[] args) {
        mvnCommandRunner();
    }



}
