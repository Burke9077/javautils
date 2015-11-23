package com.burke9077.javautils.common;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * StringWorker handles common string related functions that are shared by
 * multiple packages of the Automator product.
 * 
 * @author Burke9077@gmail.com
 *
 */
public class StringWorker {

	private StringWorker() { }
	
	/**
	 * searchAndFind is a helper method that takes in an input string and a
	 * regular expression and returns the matched group.
	 * 
	 * @param _inputString String to be searched
	 * @param _regex Regular expression to search
	 * @return String match returned or a null value
	 */
    public static String searchAndFind(String _inputString, String _regex) {
        CharSequence inputStr = _inputString;
        String patternStr = _regex;
        Pattern pattern = Pattern.compile(patternStr);
        Matcher matcher = pattern.matcher(inputStr);
        if (matcher.find()) {
            return matcher.group();
        } else {
            return null;
        }
    }
}