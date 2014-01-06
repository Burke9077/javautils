javautils
=========

JavaUtils is a package designed to simplify some Java operations, that can then be called as a method.

JavaUtils provides the following classes and functions:
javautils.digest.EzDigest: simplified hashes and message digests

=========

Below is an example of the javautils.digest.EzDigest class:

	import java.security.NoSuchAlgorithmException;
	import javautils.digest.EzDigest;
	public class Testing {
	    public static void main(String[] args) {
	        try {
	            System.out.println("SHA256: " + EzDigest.getSHA256("Test"));
	            System.out.println("MD5 : " + EzDigest.getMD5("Test"));
	        } catch (NoSuchAlgorithmException ex) {
	            System.out.println(ex.getCause());
	        }
	    }
	}