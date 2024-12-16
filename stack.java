package thirdsemjavalab;
import java.util.Scanner;
class stack
{
	static final int SIZE=5;
	static int top=-1;
	static int Array[]=new int[SIZE];
public static void main(String[]args) {
int choice;
Scanner scanner=new Scanner(System.in);
while(true)
{
	System.out.println("------------");
	System.out.println("perform operations on stack");
	System.out.println("1.push");
	System.out.println("2.pop");
	System.out.println("3.dsplay");
	System.out.println("enter the choice");
	choice=scanner.nextInt();
	switch(choice)
	{
	case 1:
		push();
		break;
	case 2:
		pop();
		break;
	case 3:
	    display();
	    break;
	case 4:
	    System.exit(0);
	default:
		System.out.println("invalid choice");
	}
}
}
static void push()
{
	int x;
	Scanner scanner=new Scanner(System.in);
	if (top==SIZE-1)
	{
		System.out.println("overflow");
	}
	else 
	{
		System.out.println("elements to be added in stack");
		x=scanner.nextInt();
		top=top+1;
		Array[top]=x;
	}
}
static void pop()
{
	if(top==-1)
	{
		System.out.println("underflow");
	}        
	else
	{
		System.out.println("popped elements"+Array[top]);
		top=top+1;
	}
}
static void display()
{
	if(top==-1)
	{
		System.out.println("underflow");
	}
	else
	{
		System.out.println("elements present in stack");
		for(int i=top;i>=0;--i)
			System.out.println(Array[i]);
		}
	}
}