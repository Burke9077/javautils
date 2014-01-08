package javautils.network;

import java.io.IOException;
import java.net.InetAddress;

/**
 * Ping is a simplification of an operating system specific ICMP Echo request 
 * utility.
 * @author burke9077
 */
public class Ping {
    
    /**
     * Given a network address or domain name isNetworkAddressReachable will 
     * return reachability.
     * @param address
     * @return reachability
     * @throws IOException
     * @throws InterruptedException 
     */
    public static boolean isNetworkAddressReachable(String address) throws IOException, InterruptedException {
        String cmd;
        if(System.getProperty("os.name").startsWith("Windows")) {   
                // For Windows
                cmd = "ping -n 1 " + address;
        } else {
                // For Linux and OSX
                cmd = "ping -c 1 " + address;
        }
        Process myProcess = Runtime.getRuntime().exec(cmd);
        myProcess.waitFor();
        if(myProcess.exitValue() == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public static boolean isNetworkAddressReachable(InetAddress inet) throws IOException, InterruptedException {
        return isNetworkAddressReachable(inet.toString());
    }
}
