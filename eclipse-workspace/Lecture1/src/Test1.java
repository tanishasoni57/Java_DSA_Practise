import java.util.Scanner;
public class Test1 {
	public static void main(String[] args) {
		/*number is positive negative and zero
		
		Scanner num=new Scanner(System.in);
		int number=num.nextInt();
		if(number>=0) {
			System.out.println("positive");
		}
		else if(number<0){
			System.out.println("negative");
		}
		
		*/
		
		
		/* number is even or odd 
		
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		if(number%2==0) {
			System.out.println("even");
		}
		else if(number%2!=0) {
			System.out.println("odd");
		}
		*/
		
		
		/* greater of two number 
		Scanner sc=new Scanner(System.in);
		int num1= sc.nextInt();
		int num2=sc.nextInt();
		if(num1>=num2) {
			System.out.println("num1 is greater than num2");
		}
		else if(num2>num1) {
			System.out.println("num2 is greater");
		}
		*/
		
		/* greatest of three number
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		if(num1>=num2 && num1>=num3) {
			System.out.println("num1 is largest");
		}
		else if(num2>=num1 && num2>=num3) {
			System.out.println("num2 is largest");
		}
		else if(num3>=num1 && num3>=num2) {
			System.out.println("num3 is largest");
		}
		*/
		
		/*person eligible to vote based on age
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter age in years");
		int age=sc.nextInt();
		
		if(age>=18) {
			System.out.println("eligible to vote");
		}
		else if(age<18 && age>0) {
			System.out.println("not eligible");
		}
		else if(age<=0) {
			System.out.println("invalid input");
		}
		else{
			System.out.println("invalid input");
		}
		
		*/
		
		/* leap year  or not % 4==0 leap, %100==0 not leap , %400==0 leap
		Scanner sc= new Scanner(System.in);
		int year=sc.nextInt();
		if(year%4==0 && year%100!=0) {
			System.out.println("leap year");
		}
		else if(year%400==0 && year%100!=0) {
			System.out.println("leap year");
		}
		else if(year%4==0 && year%400==0 && year%100!=0) {
			System.out.println("leap year");
		}
		else if(year%100==0) {
			System.out.println("not a leap year");
		}
		else {
			System.out.println("invalid output");
		}
		
		*/
		
		/* vowel or consonent 
		
		Scanner sc=new Scanner(System.in);
		char ch=Character.toLowerCase(sc.next().charAt(0));
		if(!Character.isLetter(ch){
			System.out.printl("kindly write a character");
		}
		else if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			System.out.println("vowel");
		}
		else if(Character.isDigit(ch)){
			System.out.println("kindly enter a character");
		}
		else {
			System.out.println("consonent");
		}
		
		when i am writing output "9"or '9' its giving consonent what to do with that*/
		
		
		
		/*divisible by both 3 and 5 
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num%3==0 && num%5==0) {
			System.out.println("divisible by both");
		}
		else if(num%3==0 && num%5!=0) {
			System.out.println("divisible by 3 not by 5");
		}
		else if(num%5==0 && num%3!=0) {
			System.out.println("divisible by 5 not by 3");
		}
		else {
			System.out.println("invalid output");
		}
		
		one major question why its not giving invalid output if any other thing s entered like when i enetr character f it just gave the error
		*/
		
		
		/* print numbers from 1 to 10 
		int i=1;
		while(i<=10) {
			System.out.println(i);
			++i;
		}
		
		*/
		
		
		/* print numbers from 10 t 1 
		int i=10;
		while(i>0) {
			System.out.println(i);
			--i;
		}
		
		*/
		
		
		/*print numbers from 1 to n
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int i =1;
		while(i<=num) {
			System.out.println(i);
			++i;
		}
		
		*/
		
		
		/* print all even numbers from 1 to n
		
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int i=1;
		while(i<=num) {
			if(i%2==0) {
				System.out.println(i);
			}
			++i;
		}
		
		*/
		
		
		/* print all odd numbers from 1to n 
		
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int i=1;
		while(i<=num) {
			if(i%2!=0) {
				System.out.println(i);
			}
			++i;
			
		}
		*/
		
		
		
		/* print multiplication table of 
		
		int i=1;
		while(i<=10){
			System.out.println("5" + " * "+ i + " = "+ (5*i));
			++i;
		}
		
		*/
		
		/* find sum of numbers from 1 to n
		
		
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		int i=1;
		while(i<=num) {
			sum=sum+i;
			++i;
		}
		System.out.println(sum);
		
		*/
		
		
		/* sum of all even numbers from 1 to n
		
		Scanner sc= new Scanner(System.in);
			int num=sc.nextInt();
			int i=1;
			int sum=0;
			while(i<=num) {
				if(i%2==0) {
					sum=sum+i;
				}
				++i;
			}
			System.out.println(sum);
		
		*/
		
		
		/*sum of all odd numbers from 1 to n
		
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		int i=1;
		while(i<=num) {
			if(i%2!=0) {
				sum=sum+i;
			}
			++i;
		}
		System.out.println(sum);
		
		
		*/
		
		
		/*Count how many numbers are divisible by 3 between 1 and N.
		
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int i=1;
		int count=0;
		while(i<=num) {
			if(i%3==0) {
				++count;
			}
			++i;
		}
		System.out.println(count);
		
		*/
		
	
		/*Q46. Count the number of digits in a number.

		Example:
		Input: 58392
		Output: 5 

		int num=58392;
		int count=0;
		while(num>0) {
			int newnum=num/10;
			num=newnum;
			++count;
		}
		System.out.println(count);
		
		*/
		
		/*Q47. Find the sum of digits of a number.

		Input: 583
		Output: 16
		
		int sum=0;
		int num=583;
		int temp=num;
		while(num>0) {
			temp=num%10;
			sum=sum+temp;
			int newnum=num/10;
			num=newnum;
			
		}
		System.out.println(sum);
		
		
		*/
		
		/*Q48. Find the product of digits of a number.

		Input: 234
		Output: 24
		
		int num=234;
		int sum=1;
		while(num>0) {
			int temp=num%10;
			sum=sum*temp;
			int newnum=num/10;
			num=newnum;
		}
		System.out.println(sum);
		*/
		
		
		/*Q49. Reverse a number.

		Input: 12345
		Output: 54321
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int rev=0;
		while(num>0) {
			int digit=num%10;
			int newnum=num/10;
			num=newnum;
			rev=rev*10+digit;
		}
		System.out.print(rev);
		
		*/
		
		/*Q50. Check whether a number is a palindrome.

		121 → palindrome
		123 → not palindrome
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		int rev=0;
		while(num>0) {
			int digit=num%10;
			int newnum=num/10;
			num=newnum;
			rev=rev*10+digit;
		}
		if(rev==temp) {
			System.out.println("pallindrome");
		}
		else {
			System.out.println("not");
		}
		*/
		
		/*Q51. Find the first digit of a number.
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		while(num>0) {
			int digit=num%10;
			int newnum=num/10;
			num=newnum;
			if(num==0) {
				System.out.println(digit);
			}
			
		}
		
		when i typed this why it gave error 9446372929
		
		
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		int digit=num%10;
		System.out.println(digit);
		
		12345.6 when i gave this as input why error occoured */
		
		/*Q53. Find the largest digit in a number
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int max=0;
		while(num>0) {
			int digit=num%10;
			int newnum=num/10;
			num=newnum;
			if(digit>max) {
				max=digit;
			}
			else{
			max=-1;
		}
		System.out.println(max);
		
		*/
		
		/*Q54. Find the smallest digit in a number.
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int min=Integer.MAX_VALUE;
		while(num>0) {
			int digit=num%10;
			int newnum=num/10;
			num=newnum;
			if(digit<min) {
				min=digit;
			}
			
		}
		System.out.println(min);
		
		 //here why it is giving -1 when  i give input 986
	
		*/
		
		/*Q55. Count how many times a particular digit occurs.

		Example:

		Number = 122333
		Digit = 3

		Output = 3
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		System.out.println("enter the number you want to count");
		int find=sc.nextInt();
		int count=0;
		while(num>0) {
			int digit=num%10;
			int newnum=num/10;
			num=newnum;
			if(digit==find) {
				++count;
			}
		}
		System.out.println(count);
		
		*/
		
		/*Q56. Check whether a number is prime.
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int i=2;
		boolean isPrime=true;
		if(num<=1) {
			isPrime=false;
		}
		while(i<num) {
			
			if(num%i==0) {
				isPrime=false;
				break;
			}
			++i;
		}
		if(isPrime==true) {
			System.out.println("number is prime");
		}
		else {
			System.out.println("not prime");
		}
		
		*/
		
		
		/*Q57. Print all prime numbers between 1 and N.
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num<=1) {
			System.out.println("kindly enter number greater than 1");
		}
		int i=2;
		while(i<num) {
			int val=2;
			boolean isPrime=true;
			while(val<i) {
				if(i%val==0) {
					isPrime=false;
					break;
				}
				++val;

			}
			if(isPrime==true) {
				System.out.println(i);
			}
			++i;
		}
		
		*/
		
		
		/*Count the number of prime numbers between 1 and N
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num<=1) {
			System.out.println("kindly enter number greater than 1");
		}
		int i=2;
		int count=0;
		while(i<num) {
			int val=2;
			
			boolean isPrime=true;
			while(val<i) {
				if(i%val==0) {
					isPrime=false;
					break;
				}
				++val;

			}
			if(isPrime==true) {
				System.out.println(i);
				++ count;
			}
			++i;
		}
		System.out.println("the numbers in between that are prime are "+count);
		
		This prime number is not clear to me
		*/
		
		
		/*Q59. Find the factors of a number.
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int i=1;
		while(i<=num) {
			if(num%i==0) {
				System.out.println(i);
			}
			++i;
		}
		*/
		
		/*Q60. Count the factors of a number.
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int i=1;
		int count=0;
		while(i<=num) {
			if(num%i==0) {
				System.out.println(i);
				++count;
			}
			++i;
		}
		System.out.println("number of factors are " + count);
		
		
		*/
		
		/*Q61. Find the sum of factors of a number.
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		int i=1;
		while(i<=num) {
			if(num%i==0) {
				System.out.println(i);
				sum=sum+i;
			}
			++i;
		}
		System.out.println(sum);
		
		
		*/
		
		/*Q62. Check whether a number is a perfect number.
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		int i=1;
		while(i<num) {
			if(num%i==0) {
				System.out.println(i);
				sum=sum+i;
			}
			++i;
		}
		if(sum==num) {
			System.out.println("perfect number");
		}
		else {
			System.out.println("not");
		}
		
		
		*/
		
		/*Q63. Check whether a number is an Armstrong number.
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		int check=num;
		int count=0;
		while(temp>0) {
			int digit=temp%10;
			int newnum=temp/10;
			temp=newnum;
			++count;
		}
		int hola=count;
		int sum=1;
		int idhar=0;
		while(num>0) {
			int digit=num%10;
			count=hola;
			while(count>0) {
				sum=sum*digit;
				--count;
			}
			idhar=idhar+sum;
			int newnum=num/10;
			num=newnum;
			sum=1;
			
		}
		if(idhar==check) {
			System.out.println("armstrong number");
		}
		else {
			System.out.println("not");
		}
		
		*/
		
		/*Q64. Print Armstrong numbers between 1 and N.
		
		
		Scanner sc= new Scanner(System.in);
		int till=sc.nextInt();
		int i=1;
		while(i<till) {
			int temp=i;
			int check=i;
			int count=0;
			
			while(temp>0) {
				int digit=temp%10;
				int newnum=temp/10;
				temp=newnum;
				++count;
			}
			int cstore=count;
			int sum=0;
			int mul=1;
			while(check>0) {
				int digit=check%10;
				count=cstore;
				while(count>0) {
					mul=mul*digit;
					--count;
				}
				sum=sum+mul;
				int newnum=check/10;
				check=newnum;
				mul=1;
			}
			if(sum==i) {
				System.out.println(i);
			}
			++i;
		}
		
		
		*/
		
		

		/*Q65. Check whether a number is a strong number.  eg 
		 145 ->
		 1! + 4! + 5!

		= 1 + 24 + 120

		= 145
		  
		
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int check=num;
		int sum=0;
		while(num>0) {
			int mul=1;
			int digit=num%10;
			while(digit>0) {
				mul=mul*digit;
				--digit;
			}
			sum=sum+mul;
			int newnum=num/10;
			num=newnum;
		}
		if(sum==check) {
			System.out.println("number is strong number");
		}
		else {
			System.out.println("not");
		}
		
		*/
		
		
		/*Q71. Print this:

			*****
			*****
			*****
			*****
			*****  
		
		
			int rows=5;
			while(rows>0) {
				int cols=5;
				while(cols>0) {
					System.out.print("*");
					--cols;
				}
				--rows;
				System.out.println();
			}
		
		*/
		
		
		/*Q72.

		*
		**
		***
		****
		***** 
		
		int rows=5;
		int val=1;
		while(rows>0) {
			int col=0;
			while(val>col) {
				System.out.print("*");
				++col;
			}
			++val;
			--rows;
			System.out.println();
					
		}
		
		*/
		
		
		/*Q73.

		*****
		****
		***
		**
		*     
		
		int rows=5;
		int val=5;
		while(rows>0) {
			int col=0;
			while(val>col) {
				System.out.print("*");
				++col;
			}
			--val;
			--rows;
			System.out.println();
		}
		
		
		
		*/
		
		/*Q74.

		1
		12
		123
		1234
		12345   
		
		
		int rows=5;
		int val=2;
		while(rows>0) {
			int col=1;
			while(val>col) {
				System.out.print(col);
				++col;
			}
			++val;
			--rows;
			System.out.println();
		}
		
		
		*/
		
		
		
		/*Q75.

		1
		22
		333
		4444
		55555  
		
		int rows=5;
		int val=1;
		while(rows>0) {
			int col=0;
			while(val>col) {
				System.out.print(val);
				++col;
			}
			++val;
			--rows;
			System.out.println();
		}
		
		*/
		
		
		
		/*Q76.

		1
		21
		321
		4321
		54321 
		
		int rows=5;
		int val=1;
		
		while(rows>0) {
			int col=0;
			int abc=val;
			while(val>col) {
				System.out.print(abc);
				++col;
				--abc;
			}
			--rows;
			++val;
			System.out.println();
			
		}
				
		
		*/
		
		/*Q77.

		12345
		1234
		123
		12
		1    
		
		
		int rows=5;
		int val=5;
		while(rows>0) {
			int col=1;
			while(val>=col) {
				System.out.print(col);
				++col;
			}
			--val;
			--rows;
			System.out.println();
		}
		
		
		*/
		
		
		/*Q78. Without converting the number to a String, reverse an integer.
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int rev=0;
		while(num>0) {
			int digit=num%10;
			rev=rev*10 + digit;
			int newnum=num/10;
			num=newnum;
		}
		System.out.println(rev);
		
		
		*/
		
		
		/*Q79. Without using a second variable, swap two numbers.
		
		int a=10;
		int b=20;
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("a is "+a);
		System.out.println("b is "+b);
		
		
		*/
		
		/*Q80. Find the greatest of three numbers without using Math.max().
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();	
		if(a>=b && a>=c) {
			System.out.println("a is greatest");
		}
		else if(b>=a && b>=c) {
			System.out.println("b is the greates");
		}
		else {
			System.out.println("c is the greatest");
		}
		
		*/
		
		/*Q81. Check whether a number is prime without checking every number from 1 to N.
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt( );
		int i=2;
		if(num<=1) {
			System.out.println("give number greater than 1");
		}
		boolean isPrime=true;
		while((num/2)>=i) {
			if(num%i==0) {
				isPrime=false;
				break;
			}
			++i;
		}
		if(isPrime==true) {
			System.out.println("number is prime");
		}
		else {
			System.out.println("number is not prime");
		}
		
		i hope this is what you are talking about
		
		*/
		
		/*Q82. Find the second largest among three numbers.
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>=b && a<=c) {
			System.out.println("a is the second larget");
		}
		else if(b>=a && b<c) {
			System.out.println("b is the second largest");
		}
		else {
			System.out.println("c is the second largest");
		}
		
		*/
		
		
		/*Q83. Find the sum of the first N natural numbers using a loop.
		
		int sum=0;
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int i=1;
		while(i<=num) {
			sum=sum+i;
			++i;
		}
		System.out.println(sum);
		
		*/
		
		/*Q84. Find the factorial of N.
		
		int mul=1;
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int factorial=1;
		while(num>0) {
			factorial=factorial*num;
			--num;
		}
		System.out.println(factorial);
		
		*/
		
		/*Q85. Print the Fibonacci series for N terms.

		Example:

		0 1 1 2 3 5 8 13 ... 
		
		int first=0;
		int second=1;
	    Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(first);
		System.out.println(second);

		while(num>0) {
			int third=first+second;
			System.out.println(third);
			first=second;
			second=third;
			--num;
		}
		*/
		
		
		/*Q86. Find the Nth Fibonacci number.
		
		int first=0;
		int second=1;
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int i=1;
		while(num>=i) {
			int third=first+second;
			first=second;
			second=third;
			if(i==num) {
				System.out.println(third);
			}
			++i;
			
		}
		*/
		
		/*Q87. Check whether a number belongs to the Fibonacci sequence.
		
		Scanner sc=new Scanner(System.in);
		int target=sc.nextInt();
		int first=0;
		int second=1;
		boolean itExists=true;
		if (target==0 || target==1) {
			System.out.println("yes it existes");
		}
		int i=1;
        while(i<=target) {
        	int third=first+second;
        	first=second;
        	second=third;
        	if(third==target) {
        		System.out.println("yes it exists");
        		break;
        	}
        	else {
        		itExists=false;
        	}
        	++i;
        }
		if(itExists=false) {
			System.out.println("no it doesnt exists");
		}
		
		*/
		
		
		
		/*Q88. Reverse a number and determine whether the original number and reversed number are equal.
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int check=num;
		int rev=0;
		while(num>0) {
			int digit=num%10;
			rev=rev*10 + digit;
			int newnum=num/10;
			num=newnum;
		}
		System.out.println(rev);
		if(check==rev) {
			System.out.println("yes they are equal");
		}
		else {
			System.out.println("no");
		}
		
		*/
		
		
		
		/*Q89. Find the second largest digit in a number.

		Example:

		Input: 58392
		Output: 8 
		
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int largest=0;
		int secondLargest=0;
		while(num>0) {
			int digit=num%10;
			if(digit>largest) {
				secondLargest=largest;
				largest=digit;
			}
			else if(digit>secondLargest) {
				secondLargest=digit;
			}
			int newnum=num/10;
			num=newnum;
		}
		System.out.println(secondLargest);
		
		
		*/
		
		/* Q90. Find the second smallest digit in a number. 
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int smallest=Integer.MAX_VALUE;
		int secondSmallest=Integer.MAX_VALUE;
		while(num>0) {
			int digit=num%10;
			if(digit<smallest) {
				secondSmallest=smallest;
				smallest=digit;
			}
			else if(digit<secondSmallest) {
				secondSmallest=digit;
			}
			int newnum=num/10;
			num=newnum;
		}
		System.out.println(secondSmallest);
		
		*/
		
		
		/* Q91. Remove the last digit of a number repeatedly and print each remaining number.

		Example:

		12345
		1234
		123
		12
		1     	
			
		int rows=5;
		int val=5;
		while(rows>0) {
			int col=1;
			while(val>=col) {
				System.out.print(col);
				++col;
			}
			--val;
			--rows;
			System.out.println();		
			}
		
		*/
		
		
		/*Q92. Find the frequency of every digit from 0 to 9 in a number.

		Example:

		Input: 112233

		1 → 2 
		2 → 2
		3 → 2
		
		
		
		int one=0;
		int two=0;
		int three=0;
		int four=0;
		int five=0;
		int six=0;
		int seven=0;
		int eight=0;
		int nine=0;
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		while(num>0) {
			int digit=num%10;
			if(digit==1) {
				++one;
			}
			else if(digit==2) {
				++two;
			}
			else if(digit==3) {
				++three;
			}
			else if(digit==4) {
				++four;
			}
			else if(digit==5) {
				++five;
			}
			else if(digit==6) {
				++six;
			}
			else if(digit==7) {
				++seven;
			}
			else if(digit==8) {
				++eight;
			}
			else if(digit==9) {
				++nine;
			}
			int newnum=num/10;
			num=newnum;
			
		}
		System.out.println("1 -> "+one);
		System.out.println("2 -> "+two);
		System.out.println("3 -> "+three);
		System.out.println("4 -> "+four);
		System.out.println("5 -> "+five);
		System.out.println("6 -> "+six);
		System.out.println("7 -> "+seven);
		System.out.println("8 -> "+eight);
		System.out.println("9 -> "+nine);
		
		
		*/
		
		/* solution with array
		int [] frequency=new int[10];
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		while(num>0) {
			int digit=num%10;
			++frequency[digit];
			num=num/10;
		}
		int i=0;
		while(i<frequency.length) {
			if(frequency[i]>0) {
				System.out.println(i+" -> "+ frequency[i]);
			}
			++i;
		}
		
		
		*/
		
		/*Q93. Find whether a number contains duplicate digits.
		
		int duplicate[] =new int[10];
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		while(num>0) {
			int digit=num%10;
			++duplicate[digit];
			num=num/10;
		}
		int i=0;
		boolean isDuplicate=false;
		while(i<duplicate.length) {
			if(duplicate[i]>1) {
				isDuplicate=true;
				break;
			}
			++i;
		}
		if(isDuplicate==true) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		
		*/
		
		/*Q94. Find the digit that occurs the maximum number of times.
		
		
		int duplicate[] =new int[10];
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		while(num>0) {
			int digit=num%10;
			++duplicate[digit];
			num=num/10;
		}
		int i=0;
		int j=0;
		int max=0;
		while(i<duplicate.length) {
			if(duplicate[i]>max) {
				j=i;
				max=duplicate[i];
			}
			++i;
		}
		System.out.println(j + "appeared "+ max+"times");
		
		*/
		
		/*Q95. Find the digit that occurs the minimum number of times.
		
		int duplicate[] =new int[10];
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		while(num>0) {
			int digit=num%10;
			++duplicate[digit];
			num=num/10;
		}
		int i=0;
		int j=0;
		int max=Integer.MAX_VALUE;
		while(i<duplicate.length) {
			if(duplicate[i]<max && duplicate[i]>0) {
				j=i;
				max=duplicate[i];
			}
			++i;
		}
		System.out.println(j + "appeared "+ max+"times");
		
		*/
		
		/*Q96. Find the sum of the first and last digit.
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		int count=0;
		while(temp>0) {
			int digit=temp%10;
			++count;
			temp=temp/10;
			
		}
		int i=0;
		int arr[]=new int[count];
        while(num>0) {
        	int digit=num%10;
        	arr[i]=digit;
        	num=num/10;
        	++i;
        }
        System.out.print(arr[0]+arr[arr.length-1]);
		
		*/
		
		
		/*Q97. Find the difference between the largest and smallest digit.
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int max=0;
		int min=Integer.MAX_VALUE;
		int temp=num;
		while(temp>0) {
			int digit=temp%10;
			if(digit>max) {
				max=digit;
			}
			temp=temp/10;
		}
		while(num>0) {
			int digit=num%10;
			if(digit<min) {
				min=digit;
			}
			num=num/10;
		}
		
		System.out.println(max-min);
		
		
		*/
		
		/*Q99. Determine whether an integer reads the same forward and backward.

		🔗 LeetCode 9 — Palindrome Number  already donr before*/
		
		
		/*Q100. Given a positive integer n, return whether it is a power of two.

				Examples:

				16 → true
				8 → true
				10 → false
		
		Scanner sc=new Scanner(System.in);
		int target=sc.nextInt();
		int power=2;
		if(target==2) {
			System.out.println("yes");
		}
		if(target<0) {
			target=target*-1;
		}
		int i=0;
		boolean isPower=false;
		while(i<target) {
			power=power*2;
			if(power==target) {
				isPower=true;
				break;
			}
			++i;
		}
		
		if(isPower==true) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		
		
		*/
		
		/*101
		102
		98*/
		
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int pow=sc.nextInt();
		int mul=1;
		while(pow>0) {
			mul=mul*n;
			--pow;
		}
		System.out.println(mul)	;
		
		
		
	}
}
