javautils
=========

JavaUtils is a package designed to simplify some Java operations, that can then be called as a method.

JavaUtils provides the following classes and functions:

-javautils.digest.EzDigest: simplified hashes and message digests
-javautils.network.Ping: simplified network reachability via ICMP echo request (ping)

=========

Examples
=========
javautils.digest.EzDigest class:
	import java.security.NoSuchAlgorithmException;
	import javautils.digest.EzDigest;
	
	public class Testing {
	
	    public static void main(String[] args) {
	        try {
	            System.out.println("SHA256: " + EzDigest.getSHA256String("Test"));
	            System.out.println("MD5 : " + EzDigest.getMD5String("Test"));
	        } catch (NoSuchAlgorithmException ex) {
	            System.out.println(ex.getCause());
	        }
	    }
	}
	
javautils.network.Ping class:
	import java.io.IOException;
	import javautils.network.Ping;

	public class Testing {
    
    public static void main(String[] args) {
        try {
            System.out.println("Is google.com reachable? " + Ping.isNetworkAddressReachable("google.com"));
        } catch (IOException ioe) {
            // Something is wrong with the network
        } catch (InterruptedException ie) {
            // The system waitFor process was interrupted
        }
    }
}