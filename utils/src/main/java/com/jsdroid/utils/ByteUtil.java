package com.jsdroid.utils;


public class ByteUtil {
	public static byte[] stringToBytes(String text, String charset)
			throws Exception {
		return text.getBytes(charset);
	}
	public static byte[] intToByteArray(int n) {
		byte[] b = new byte[4];
		b[0] = (byte) (n & 0xff);
		b[1] = (byte) (n >> 8 & 0xff);
		b[2] = (byte) (n >> 16 & 0xff);
		b[3] = (byte) (n >> 24 & 0xff);
		return b;
	}

	public static int byteArrayToInt(byte[] bArr) {
		if (bArr.length != 4) {
			return -1;
		}
		return (int) ((((bArr[3] & 0xff) << 24) | ((bArr[2] & 0xff) << 16)
				| ((bArr[1] & 0xff) << 8) | ((bArr[0] & 0xff) << 0)));
	}
}
