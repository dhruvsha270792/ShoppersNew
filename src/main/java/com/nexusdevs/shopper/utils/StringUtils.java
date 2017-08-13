package com.nexusdevs.shopper.utils;

import java.security.MessageDigest;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StringUtils {
	
	private static Logger logger = LoggerFactory.getLogger(StringUtils.class);
	
	public static String getvalue(String regex, int groupPostion, String targetStr) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(targetStr);
		if (matcher.find()) {
			return matcher.group(groupPostion);
		}
		return null;
	}

	private final static char[] NUM_TO_CHAR_ARR = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c',
			'd', 'e', 'f' };

	public static String getMD5Hash(String s) {
		try {
			if (s == null) {
				return null;
			}
			MessageDigest digest = MessageDigest.getInstance("MD5");
			digest.update(s.getBytes());
			byte[] bs = digest.digest();
			String hexString = getHexString(bs);
			return hexString;
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
		return null;
	}
	
	public static String getHexString(byte[] barr) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < barr.length; i++) {
			byte b = barr[i];
			sb.append(NUM_TO_CHAR_ARR[(b >> 4) & 0x0f]);
			sb.append(NUM_TO_CHAR_ARR[b & 0x0f]);
		}
		return sb.toString();
	}	
}