import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Client implements Runnable

{

    private Socket client;
    private BufferedReader in;
    private PrintWriter out;

    @Override
    public void run() {
        try{
            Socket client = new Socket("172.26.240.1", 9999);

        }
        catch(IOException e){
            // Todo: handle
        }
    }
}
