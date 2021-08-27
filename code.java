package ProjectEmail;
import java.util.Random;
import java.util.Scanner;

public class EmailAdmin
{
	//instance variables
	String firstName, lastName, alernateEmail, empPassword;
	int newCapacity, value, deptCode, capacity=500;
	Scanner sc= new Scanner(System.in);//Using Scanner class to accept input from user.
    public EmailAdmin()
	{
		System.out.println("Enter your First name: ");
		firstName= sc.next();
		
		System.out.println("Enter your Last name: ");
        lastName= sc.next();
		System.out.println("Employee name: "+firstName +" "+lastName);	
	}
	
public void department()//using default method to select department in which the employee works
{
	System.out.println("Choose your Department code: \n 1. IT\n 2. Testing\n 3. Manufacturing\n 4. Research and Development");
	 System.out.println("Enter your Department code=");
	do
	{
		deptCode=sc.nextInt();// "sc" is scanner class object used to take integer as an input from the user
		//nextInt() is the method of the Scanner class which is used to accept only values that are integer	
		switch(deptCode)//using switch case to select the department
		{
		case 1:
			System.out.println(firstName+", you are in IT Department.");
		break;
		case 2:
			System.out.println(firstName+", you are in Testing Department.");
			break;

		case 3:
			System.out.println(firstName+", you are in Manufacturing Deapartment.");
			break;
		case 4:
			System.out.println(firstName+", you are in Research and Development Department.");
			break;
			
		default:
			System.out.println("WARNING--> INVALID DEPARTMENT CODE \nPlease try again and enter valid code.");
		}
	}
		while(deptCode>4);
	System.out.println();
}
	
public void generatedMail()//using default method to generate company mail id
{
	//toLowerCase() is a method available in String class to convert given string to lower case
	System.out.println("------------------WELCOME-----------------");
	System.out.println("Your Company E-Mail ID is: "+firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+"company.ac.in");
}

public static char[] createPassword(int length)// parameterized static method
{
	System.out.println("------------------PASSWORD-------------------");
	String capital="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String small="abcdefghijklmnopqrstuvwxyz";
	String num="0123456789";
	String special="!@#$%^&*?";
	String pass= capital+small+num+special;
	Random r= new Random();
    char[] password= new char[length];
	for(int i=0;i<length;i++)
	{
		password[i]=pass.charAt(r.nextInt(pass.length()));
	}
	System.out.print("Your System Generated Password is: ");
	return password;
}

public void changePassword()// using default method to ask user to change the system generated password
{
	System.out.println("Do you wish to change your password for security purposes?");
	System.out.println("Select: \n 1. YES\n 2. NO");
	value=sc.nextInt();//nextInt() method is present in Scanner class which is used to get integer as an input from the user
	//the integer 'value' is instance variable which means it is only valid inside this method
	switch(value)//using switch case to ask user to change the password
	{
	case 1:
		System.out.println("Enter your password: ");
		empPassword=sc.next();	//next() method is present in Scanner class which is used to get String input from user
	    break;
	case 2:
		System.out.println("Password remains unchanged.");
		break;
	}
	if(value==1)//if the user selects 1 then this 'if' statement is executed
	{
		System.out.println("Your password is changed successfully. Your new Password is: "+empPassword);
	}
	
}
public void alternateId()// using default method for asking alternate email id from user
{
	System.out.println("------------------ALTERNATE EMAIL ID-----------------");
	System.out.println("Enter your alternate email id: ");
	alernateEmail=sc.next();//here String alternateEmail is used which is a local variable
	System.out.println("Alternate email id is: "+alernateEmail);	//displaying the alternate email id
}

public void mailcapacity()//default method is used to change the mail box capacity
{
	System.out.println("------------------MAIL BOX CAPACITY-----------------");
	System.out.println("Mail box default capacity is: "+capacity);
	System.out.println("Do you wish to change your mail box capacity?");
	System.out.println("Type 'Y' for yes.");
	char box= sc.next().charAt(0);// 'sc' is the scanner class object , 'next().chartAt()' is a method available in this class to accept character as input
	if(box=='Y')
	{
	System.out.println("Please enter your mail box capacity: ");
	newCapacity= sc.nextInt();
	System.out.println("Mail box capacity is changed to: "+newCapacity);
	System.out.println("------------------THANK YOU FOR SHARING YOUR DETAILS-----------------");
	}
	else
	{
		System.out.println("Mail box capacity remains unchanged.");
		System.out.println("------------------THANK YOU FOR SHARING YOUR DETAILS-----------------");
	}
}
public void EmployeeDetails()
{
	System.out.println();
	System.out.println("-----------------CONGRATULATIONS! WELCOME ON BOARD "+firstName+" "+lastName+"--------------------");
	System.out.println();
	System.out.println("----------------YOUR DETAILS----------------");
	if(deptCode==1)
	{
		System.out.println("Department code : "+deptCode);
		System.out.println("Department IT");
	}
	else if(deptCode==2)
	{
		System.out.println("Department code : "+deptCode);
		System.out.println("Department Testing");
	}
	else if(deptCode==3)
	{
		System.out.println("Department code : "+deptCode);
		System.out.println("Department Manufacturing");
	}
	else if(deptCode==4)
	{
		System.out.println("Department code : "+deptCode);
		System.out.println("Department Research and Development");
	}
	System.out.println("Company E-Mail ID is : "+firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+"company.ac.in");
	//displaying password
	if(empPassword==null)
	{
		System.out.println("You are using system generated password.");
	}
	else
	{
		System.out.println("New password : "+empPassword);
	}
	//displaying alternate email id
	System.out.println("Alternate Email Id : "+alernateEmail);
	//displaying mail box capacity
	if(newCapacity==0)
	{
		System.out.println("Default Mail box capacity : "+capacity);
	}
	else 
	{
		System.out.println("New Mail box capacity : "+newCapacity);
	}
}

public static void main(String[] args)
	{
	//creating object 'e' for class EmailAdmin
	EmailAdmin e = new  EmailAdmin(); 
	//calling methods using object 'e' of class EmailAdmin
    e.department();
    e.generatedMail();
    System.out.println(EmailAdmin.createPassword(6));// calling and printing parameterized static method
    e.changePassword();
    e.alternateId();
    e.mailcapacity();
    e.EmployeeDetails();
	}
}


