package com.sapient.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

class Account{
	private int accId;
	private double balance;
	private String custName;
	private String sex;
	
}
public class PredicateEx01 {
	public static void main(String[] args)
	{
		List<Account> accountList=Arrays.asList(
				new Account(101,2323,"Saahil","Male"),
				new Account(101,2373,"Zubin","Male"),
				new Account(106,5673,"Siddanth","Male"),
				new Account(105,7894,"Sharath","Male"),
				new Account(112,8923,"Pawan","Male"),
				new Account(190,6711,"Srinidhi","Female"));

				
	
	
	
	
	//filter only males
		
		List<Account> onlyMales=AccountPredicate.filterAccounts(accountList, AccountPredicate.onlyMale());
		onlyMales.forEach(System.out::println);
		
		
	//list all people who have balance more than 4500
		
		List<Account> value=AccountPredicate.filterAccounts(accountList, AccountPredicate.onBalanceCheck(4500));
		value.forEach(System.out::println);
	
	
	Predicate<Account> onlyMaleAndConditionCheck=
			AccountPredicate.onlyMale().and(AccountPredicate.onBalanceCheck(4500));
	
	
	
	
	
	}
	
	
	
	
	
	
	static class AccountPredicate{
		
		public static Predicate<Account> onlyMale(){
			return p->p.getSex().equals("Male");
			
			
		public static Predicate<Account> onBalanceCheck(double balance){
			return p->p.getBalance()>balance;
			
			
		}
		
		//filter method and return list
		public static List<Account> filterAccounts(List<Account> accountList,
				Predicate<Account> accountPredicate){
			return accountList.stream().filter(accountPredicate).collect(Collectors.toList());
		}
		
		
	}

}
