import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * Created by 14Viskubova on 10.02.2017.
 */
public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8080);
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            dataOutputStream.writeUTF("ETO YA");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
