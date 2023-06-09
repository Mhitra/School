import java.net.InetAddress;
import java.net.UnknownHostException;

 class task1 {
  public static void main(String[] args) {
    try {
      InetAddress localhost = InetAddress.getLocalHost();
      String hostAddress = localhost.getHostAddress();
      String hostName = localhost.getHostName();
      System.out.println("Localhost address: " + hostAddress);
      System.out.println("Localhost name: " + hostName);
    } catch (UnknownHostException e) {
      System.err.println("Could not resolve localhost");
    }
  }
}


