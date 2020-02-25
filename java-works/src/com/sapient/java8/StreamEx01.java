package com.sapient.java8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamEx01 {

	public static void main(String[] args)throws FileNotFoundException,IOException {
		// TODO Auto-generated method stub
		try(
			FileReader filereader=new FileReader("emp.txt");
			BufferedReader br=new BufferedReader(filereader);
			){
			br.lines().forEach(System.out:: println);
		}
			//////////////////////////////////////////////////////
		 
		//only with streams
		try(Stream<String> string=Files.lines(Paths.get("emp.txt"))){
			string.forEach(System.out::println);
		}
		
		
		
		
		
		}
	}


