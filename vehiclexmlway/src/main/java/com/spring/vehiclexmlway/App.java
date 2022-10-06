package com.spring.vehiclexmlway;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	
	
	public static int getLongestString(String s){
		
		int max=0,left=0,right=0;
		Set<Character> se=new HashSet(); 
		while(right<s.length())
		{
			char c=s.charAt(right);
			if(se.add(c)) {
				max=Math.max(max, right-left+1);
				right ++;
			}
			else {
				while(s.charAt(left)!=c) {
					se.remove(s.charAt(left));
					left ++;
				}
				se.remove(c);
				left++;
			}
		}
		
		return max;
	}
	
	
	public static void maxProduct(int arr[],int n)
	{
		 
		int a=arr[0],b=arr[1];
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]*arr[j]>a*b)
				{
					a=arr[i];
					b=arr[j];
					
				}
			}
			
		}
		 System.out.println(""+a*b);
	}
	
	
	public static void fabSer(int input)
	{
	   System.out.println("Print Fibonacci Series ");
		
	    int previous=0,next=1,result=0;
		for(int i=0;i<input;i++)
		{
			System.out.println(previous+" ");
			result= next+previous;
			previous=next;
			next=result;
		}
		
	}
	 public static int fact(int n)
	    {
		 int res=1; 	
	        if(n==0)
	        {
	            return 1;
	        }

	       
	        for(int i=0;i<=n;i++) {
	            res = res * (n - i);
	        }

	     return res;
	    }
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
      ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
      Vehicle vehicle = context.getBean(Vehicle.class,"myVehicle");
//      String discount = vehicle.getDiscount();
//      String milage = vehicle.getMilage();
//      System.out.println(context+" "+milage);
      
      
      int longestString = getLongestString("abcabcaa");
     // System.out.println(longestString);
      
      int arr[] = {1, 4, 3, 6, 7, 0};
      int n = arr.length;
     // maxProduct(arr, n);
       //fabSer(10);
      int fact = fact(5);      
      System.out.println( "Result="+fact);
      
    }
}
