package javautils.digest;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * EzDigest is a simple way to get various Message Digests when given either a 
 * String or byte array.
 * @author Matthew Larry Burke
 */
public class EzDigest {
    
    public static String getMD2(byte[] _hash) throws NoSuchAlgorithmException {
        MessageDigest _digest = MessageDigest.getInstance("MD2");
        return toHash(_hash, _digest);
    }
    
    public static String getMD2(String _hash) throws NoSuchAlgorithmException {
        MessageDigest _digest = MessageDigest.getInstance("MD2");
        return toHash(_hash, _digest);
    }
    
    public static String getMD5(byte[] _hash) throws NoSuchAlgorithmException {
        MessageDigest _digest = MessageDigest.getInstance("MD5");
        return toHash(_hash, _digest);
    }
    
    public static String getMD5(String _hash) throws NoSuchAlgorithmException {
        MessageDigest _digest = MessageDigest.getInstance("MD5");
        return toHash(_hash, _digest);
    }
    
    public static String getSHA(byte[] _hash) throws NoSuchAlgorithmException {
        MessageDigest _digest = MessageDigest.getInstance("SHA");
        return toHash(_hash, _digest);
    }
    
    public static String getSHA(String _hash) throws NoSuchAlgorithmException {
        MessageDigest _digest = MessageDigest.getInstance("SHA");
        return toHash(_hash, _digest);
    }
    
    public static String getSHA1(byte[] _hash) throws NoSuchAlgorithmException {
        MessageDigest _digest = MessageDigest.getInstance("SHA1");
        return toHash(_hash, _digest);
    }
    
    public static String getSHA1(String _hash) throws NoSuchAlgorithmException {
        MessageDigest _digest = MessageDigest.getInstance("SHA1");
        return toHash(_hash, _digest);
    }
    
    public static String getSHA256(byte[] _hash) throws NoSuchAlgorithmException {
        MessageDigest _digest = MessageDigest.getInstance("SHA-256");
        return toHash(_hash, _digest);
    }
    
    public static String getSHA256(String _hash) throws NoSuchAlgorithmException {
        MessageDigest _digest = MessageDigest.getInstance("SHA-256");
        return toHash(_hash, _digest);
    }
    
    public static String getSHA384(byte[] _hash) throws NoSuchAlgorithmException {
        MessageDigest _digest = MessageDigest.getInstance("SHA-384");
        return toHash(_hash, _digest);
    }
    
    public static String getSHA384(String _hash) throws NoSuchAlgorithmException {
        MessageDigest _digest = MessageDigest.getInstance("SHA-384");
        return toHash(_hash, _digest);
    }
    
    public static String getSHA512(byte[] _hash) throws NoSuchAlgorithmException {
        MessageDigest _digest = MessageDigest.getInstance("SHA-512");
        return toHash(_hash, _digest);
    }
    
    public static String getSHA512(String _hash) throws NoSuchAlgorithmException {
        MessageDigest _digest = MessageDigest.getInstance("SHA-512");
        return toHash(_hash, _digest);
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