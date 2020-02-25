package com.sapient.day3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadWriteEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int empId;
		String empName;
		double empSal;
		BufferedWriter bw = null;
		System.out.println("Enter EmpId");
		try {
			empId=Integer.parseInt(br.readLine());
			System.out.println("Enter Empname");
			empName=br.readLine();
			System.out.println("Enter empsal");
			empSal=Integer.parseInt(br.readLine());
			
			
			System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''");
			System.out.println("Emp name"+empName);
			System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''");
			System.out.println("Emp ID"+empId);
			System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''");
			System.out.println("EmpSal"+empSal);
			
			File file=new File("emp.txt");
			bw=new BufferedWriter(new FileWriter(file, true));
			bw.append("empid: "+empId);
			bw.append("\n");
			bw.append("EmpName: "+empName+"\n");
			bw.append("EmpSal"+empSal);
			
			



			
			
			
			
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
