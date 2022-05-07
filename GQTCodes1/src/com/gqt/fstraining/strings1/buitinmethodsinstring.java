package com.gqt.fstraining.strings1;

public class buitinmethodsinstring {

	public static void main(String[] args) {
		String s1 = "RajaRamMohanRoy";
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.startsWith("Raja"));
		System.out.println(s1.endsWith("Roy"));
		System.out.println(s1.endsWith("Ram"));
		System.out.println(s1.contains("Ram"));
		System.out.println(s1.charAt(0));
		System.out.println(s1.length());
		System.out.println(s1.indexOf("a"));
		System.out.println(s1.concat("India"));
		System.out.println(s1.getClass());
		System.out.println(s1.isBlank());
		System.out.println(s1.isEmpty());
		System.out.println(s1.lastIndexOf('R'));
		System.out.println(s1.lastIndexOf("Ra"));
		}
	}
