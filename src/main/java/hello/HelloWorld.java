package hello;

import java.nio.charset.Charset;
import java.util.Date;
import java.util.TimeZone;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("*** args ***"); 
		for (String arg: args) {
			System.out.println(arg);
		}
		System.out.println("******");
		System.out.println();
		System.out.println("*** jvm ***");
		System.out.println(Charset.defaultCharset().displayName());
		System.out.println(TimeZone.getDefault());
        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("java.vendor"));
		System.out.println(new Date());
		System.out.println("******");
		System.out.println();
	}
}
