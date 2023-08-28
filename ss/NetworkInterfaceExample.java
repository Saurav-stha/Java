import java.net.*;
import java.util.*;

public class NetworkInterfaceExample {
    public static void main(String[] args) {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterface = networkInterfaces.nextElement();
                Enumeration<InetAddress> addresses = networkInterface.getInetAddresses();
                
                System.out.println("Network Interface: " + networkInterface.getDisplayName());
                while (addresses.hasMoreElements()) {
                    InetAddress address = addresses.nextElement();
                    System.out.println("IP Address: " + address.getHostAddress());
                }
                System.out.println();
            }
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
