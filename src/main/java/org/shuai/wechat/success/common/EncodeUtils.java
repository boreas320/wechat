package org.shuai.wechat.success.common;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class EncodeUtils {
	public static String encode(String string) {
		String hexString = "";
		try {
			MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");

			byte[] digest = messageDigest.digest(string.getBytes("utf8"));
			hexString = byteToStr(digest);

		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
		return hexString;
	}

	// public static String bytetoString(byte[] digest) {
	// String str = "";
	// String tempStr = "";
	//
	// for (int i = 1; i < digest.length; i++) {
	// tempStr = (Integer.toHexString(digest[i] & 0xff));
	// if (tempStr.length() == 1) {
	// str = str + "0" + tempStr;
	// }
	// else {
	// str = str + tempStr;
	// }
	// }
	// return str.toLowerCase();
	// }
	private static String byteToStr(byte[] digest) {
		// TODO Auto-generated method stub
		String strDigest = "";
		for (int i = 0; i < digest.length; i++) {
			strDigest += byteToHexStr(digest[i]);
		}
		return strDigest;
	}

	/**
	 * 将字节转换为十六进制字符串
	 * 
	 * @param b
	 * @return
	 */
	private static String byteToHexStr(byte b) {
		// TODO Auto-generated method stub
		char[] Digit = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A',
				'B', 'C', 'D', 'E', 'F' };
		char[] tempArr = new char[2];
		tempArr[0] = Digit[(b >>> 4) & 0X0F];
		tempArr[1] = Digit[b & 0X0F];

		String s = new String(tempArr);
		return s;
	}

}
