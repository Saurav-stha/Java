import java.net.*;

public class LocalIPAddressAndHostName {
    public static void main(String[] args) {
        try {
            InetAddress localhost = InetAddress.getLocalHost();
            String localIPAddress = localhost.getHostAddress();
            String localHostName = localhost.getHostName();

            System.out.println("Local IP Address: " + localIPAddress);
            System.out.println("Local Hostname: " + localHostName);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
