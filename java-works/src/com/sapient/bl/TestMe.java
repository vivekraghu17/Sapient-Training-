package com.sapient.bl;

public class TestMe {
public boolean sayHi()
{
	return true;
}

public String sayHi(String name)
{
	return "Hi" + name;
}
public String testTime(String message)
{
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return  "Message"+message;
}

public Object throwsSomeException(int val)
{
	if(val<1)
	{
		throw new "";
	}

	else
	{
		System.out.println("vslur id passed");
	}
return val;
}
}
