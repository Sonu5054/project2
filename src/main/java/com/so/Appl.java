package com.so;

/**
 * Hello world!
 *
 */
import java.util.Scanner;
import static java.lang.System.*;
public class Appl 
{
    public static void main( String[] args )
    {
    	Scanner so=new Scanner(System.in);
    	signupvalidations sv= new signupvalidations();
    	out.println("Welcome to Signup Page");
        out.println("Enter Username ");
        String username=so.next();
        try {
        	if(sv.checkUsername(username)) {
        		out.println("Enter Password");
        		String password=so.next();
        		try {
        			if(sv.checkPassword(password))
        			{
        				out.println("Phone Number");
        				String phone=so.next();
        				try {
        					if(sv.checkPhone(phone))
        					{
        						out.println("Signup successful");
       						out.println("username :"+username+"password"+password+"phone number"+phone);
        					}
        				}
        				catch(Exception e) {
        					out.println(e.getMessage());
        				}
        			}
        		}
        		catch(Exception e) {
        			out.println(e.getMessage());
        		}
        	}
        }
        catch(Exception e){
        	out.println(e.getMessage());
        }
    }
}