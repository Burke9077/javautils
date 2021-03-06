package com.burke9077.javautils.security;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Digest is a simple way to get various Message Digests when given either a 
 * String or byte array.
 
 * @author burke9077@gmail.com
 */
public class Digest {
	
	private Digest() { }
    
    public static String getMD2String(byte[] _hash) throws NoSuchAlgorithmException {
        MessageDigest _digest = MessageDigest.getInstance("MD2");
        return toHash(_hash, _digest);
    }
    
    public static byte[] getMD2(byte[] _hash) throws NoSuchAlgorithmException {
        MessageDigest _digest = MessageDigest.getInstance("MD2");
        return _digest.digest(_hash);
    }
    
    public static String getMD2String(String _hash) throws NoSuchAlgorithmException {
        MessageDigest _digest = MessageDigest.getInstance("MD2");
        return toHash(_hash, _digest);
    }
    
    public static byte[] getMD2(String _hash) throws NoSuchAlgorithmException {
        MessageDigest _digest = MessageDigest.getInstance("MD2");
        return _digest.digest(_hash.getBytes());
    }
    
    public static String getMD5String(byte[] _hash) throws NoSuchAlgorithmException {
        MessageDigest _digest = MessageDigest.getInstance("MD5");
        return toHash(_hash, _digest);
    }
    
    public static byte[] getMD5(byte[] _hash) throws NoSuchAlgorithmException {
        MessageDigest _digest = MessageDigest.getInstance("MD5");
        return _digest.digest(_hash);
    }
    
    public static String getMD5String(String _hash) throws NoSuchAlgorithmException {
        MessageDigest _digest = MessageDigest.getInstance("MD5");
        return toHash(_hash, _digest);
    }
    
    public static byte[] getMD5(String _hash) throws NoSuchAlgorithmException {
        MessageDigest _digest = MessageDigest.getInstance("MD5");
        return _digest.digest(_hash.getBytes());
    }
    
    public static String getSHAString(byte[] _hash) throws NoSuchAlgorithmException {
        MessageDigest _digest = MessageDigest.getInstance("SHA");
        return toHash(_hash, _digest);
    }
    
    public static byte[] getSHA(byte[] _hash) throws NoSuchAlgorithmException {
        MessageDigest _digest = MessageDigest.getInstance("SHA");
        return _digest.digest(_hash);
    }
    
    public static String getSHAString(String _hash) throws NoSuchAlgorithmException {
        MessageDigest _digest = MessageDigest.getInstance("SHA");
        return toHash(_hash, _digest);
    }
    
    public static byte[] getSHA(String _hash) throws NoSuchAlgorithmException {
        MessageDigest _digest = MessageDigest.getInstance("SHA");
        return _digest.digest(_hash.getBytes());
    }
    
    public static String getSHA1String(byte[] _hash) throws NoSuchAlgorithmException {
        MessageDigest _digest = MessageDigest.getInstance("SHA1");
        return toHash(_hash, _digest);
    }
    
    public static byte[] getSHA1(byte[] _hash) throws NoSuchAlgorithmException {
        MessageDigest _digest = MessageDigest.getInstance("SHA1");
        return _digest.digest(_hash);
    }
    
    public static String getSHA1String(String _hash) throws NoSuchAlgorithmException {
        MessageDigest _digest = MessageDigest.getInstance("SHA1");
        return toHash(_hash, _digest);
    }
    
    public static byte[] getSHA1(String _hash) throws NoSuchAlgorithmException {
        MessageDigest _digest = MessageDigest.getInstance("SHA1");
        return _digest.digest(_hash.getBytes());
    }
    
    public static String getSHA256String(byte[] _hash) throws NoSuchAlgorithmException {
        MessageDigest _digest = MessageDigest.getInstance("SHA-256");
        return toHash(_hash, _digest);
    }
    
    public static byte[] getSHA256(byte[] _hash) throws NoSuchAlgorithmException {
        MessageDigest _digest = MessageDigest.getInstance("SHA-256");
        return _digest.digest(_hash);
    }
    
    public static String getSHA256String(String _hash) throws NoSuchAlgorithmException {
        MessageDigest _digest = MessageDigest.getInstance("SHA-256");
        return toHash(_hash, _digest);
    }
    
    public static byte[] getSHA256(String _hash) throws NoSuchAlgorithmException {
        MessageDigest _digest = MessageDigest.getInstance("SHA-256");
        return _digest.digest(_hash.getBytes());
    }
    
    public static String getSHA384String(byte[] _hash) throws NoSuchAlgorithmException {
        MessageDigest _digest = MessageDigest.getInstance("SHA-384");
        return toHash(_hash, _digest);
    }
    
    public static byte[] getSHA384(byte[] _hash) throws NoSuchAlgorithmException {
        MessageDigest _digest = MessageDigest.getInstance("SHA-384");
        return _digest.digest(_hash);
    }
    
    public static String getSHA384String(String _hash) throws NoSuchAlgorithmException {
        MessageDigest _digest = MessageDigest.getInstance("SHA-384");
        return toHash(_hash, _digest);
    }
    
    public static byte[] getSHA384(String _hash) throws NoSuchAlgorithmException {
        MessageDigest _digest = MessageDigest.getInstance("SHA-384");
        return _digest.digest(_hash.getBytes());
    }
    
    public static String getSHA512String(byte[] _hash) throws NoSuchAlgorithmException {
        MessageDigest _digest = MessageDigest.getInstance("SHA-512");
        return toHash(_hash, _digest);
    }
    
    public static byte[] getSHA512(byte[] _hash) throws NoSuchAlgorithmException {
        MessageDigest _digest = MessageDigest.getInstance("SHA-512");
        return _digest.digest(_hash);
    }
    
    public static String getSHA512String(String _hash) throws NoSuchAlgorithmException {
        MessageDigest _digest = MessageDigest.getInstance("SHA-512");
        return toHash(_hash, _digest);
    }
    
    public static byte[] getSHA512(String _hash) throws NoSuchAlgorithmException {
        MessageDigest _digest = MessageDigest.getInstance("SHA-512");
        return _digest.digest(_hash.getBytes());
    }
        
    /**
     * This method utilizes a MessageDigest object to calculate the checksum.
     * @param _toHash-the byte[] that will be used to calculate the checksum.
     * @param _algorithm-a MessageDigest object that will be used to calculate
     * the checksum.
     * @return A string object containing the checksum.
     */
    public static String toHash(byte[] _toHash, MessageDigest _algorithm) {
        _algorithm.update(_toHash);
        byte[] md_result = _algorithm.digest();
        StringBuilder sb_stringResult = new StringBuilder();
        for (int i=0; i < md_result.length; i++) {
            sb_stringResult.append(Integer.toString((md_result[i] & 0xff) + 
                    0x100, 16).substring(1));
        }
        return sb_stringResult.toString();
    }
    
    /**
     * This method utilizes the toHash(byte[]) method to calculate the checksum
     * when given a String object.
     * @param _toHash-a string object that will be used to calculate the
     * checksum.
     * @param _algorithm-a MessageDigest object that will be used to calculate
     * the checksum.
     * @return A string object containing the MD5 sum.
     */
    public static String toHash(String _toHash, MessageDigest _algorithm) {
        return toHash(_toHash.getBytes(), _algorithm);
    }
}