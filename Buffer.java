package com.cts.training;

public class Buffer {
	public static void main(String args[])
	{
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("hello tfh");
		System.out.println(sb.capacity());
		sb.append("This is myversion for development");
		System.out.println(sb.capacity());
		sb.insert(7, "dear");
	    System.out.println(sb);
	    sb.replace(7, 20, "hello");
	    System.out.println(sb);
		sb.delete(7, 20);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
	}

}
