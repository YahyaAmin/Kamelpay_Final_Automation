package Hooks;

public class RunnerForGoodWindows {

    public static void mvnCommandRunner(){
        GoodWindowsExec.main(new String[] {"cd C:\\Users\\abc\\Documents\\GitHub\\Kamelpay_Final_Automation"});
        GoodWindowsExec.main(new String[] {"mvn verify -DskipTests"});
    }

    public static void main(String[] args) {

        mvnCommandRunner();
    }



}
