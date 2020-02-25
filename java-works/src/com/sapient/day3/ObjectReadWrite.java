package com.sapient.day3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectReadWrite {

	
	public static void storeAccount(Account ...accounts) throws IOException
	{
		ObjectOutputStream oos=null;
		try {
			oos=new ObjectOutputStream(new FileOutputStream("Accounts.ser"));
			oos.writeObject(accounts);
			oos.writeObject("Sapient");
			oos.writeObject(101);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new IOException("Sorry storage failed",e);
		} finally {
			try {
				oos.close();
			}catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public static void readAccount()
	{
		ObjectInputStream ois=null;
		try {
			ois=new ObjectInputStream(new FileInputStream("Accounts.ser"));
	
			Account[] accounts=(Account[]) ois.readObject();
			
			String str=(String)ois.readObject();
			int x=(int)ois.readObject();
			
			System.out.println(str);
			System.out.println(x);

		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account=new Account(101,1234,"Harry");
		Account account1=new Account(102,3333,"Peter");
/*		try {
			storeAccount(account,account1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	*/
		readAccount();
	}

}
