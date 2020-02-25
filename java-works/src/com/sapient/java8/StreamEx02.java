package com.sapient.java8;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.function.Consumer;
import java.util.regex.Pattern;
import java.util.stream.Stream;

//split stream
public class StreamEx02 {
	public static void main(String[] args)throws FileNotFoundException,IOException {
		//a,b,c,d,e
		
		String readLine="a,b,c,d,e";
		Pattern pattern=Pattern.compile(",");
		pattern.splitAsStream(readLine).forEach(System.out::println);
		
		
		
		
		try(Stream<String> string=Files.lines(Paths.get("emp.txt"))){
			Pattern patte=Pattern.compile(":");
			//patte.splitAsStream((CharSequence) string).forEach(System.out::println);
			
		
			string.forEach(new Consumer<String>() {
				
				@Override
				public void accept(String t)
				{
					patte.splitAsStream(t).forEach(System.out::println);
				}
			});
			
		}
		
		
	}

}
