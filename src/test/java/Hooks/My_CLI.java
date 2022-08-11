package Hooks;
import java.io.IOException;

public class My_CLI {


    public static void main(String[] args) throws InterruptedException, IOException {

        try {

            String[] cmd = new String[3];
            cmd [0] = "/cmd.exe";
            cmd [1] = "/C";
            cmd[2] = "javac -version";
            Runtime rt = Runtime.getRuntime();
            Process proc = rt.exec(cmd);
            int exitVal = proc.waitFor();
            System.out.println("ExitValue: " + exitVal);
        }

        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}
