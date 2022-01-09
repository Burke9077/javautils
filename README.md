# NOTE: This repo is old and no longer maintained. Other repos (like Apache's utils) should be used instead of these.

javautils
=========

JavaUtils is a package designed to simplify some Java operations, that can then be called as a method.

JavaUtils provides the following classes and functions:  
-com.burke9077.javautils.security.Digest: simplified hashes and message digests  
-com.burke9077.javautils.network.Ping: simplified network reachability via ICMP echo request (ping)
-com.burke9077.javautils.common.StringWorker: simplified regular expression checking

=========

Examples
=========
com.burke9077.javautils.security.Digest class:

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
	
com.burke9077.javautils.network.Ping class:

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
    
com.burke9077.javautils.common.StringWorker class:

    import com.burke9077.javautils.common.StringWorker;
    
    public static void main(String[] args) {
        System.out.println("My String", "^\\w+");
    }
    
Output: My
