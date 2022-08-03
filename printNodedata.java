import java.util.*;
public class Main
{   
    static class Node 
    {
        int data;
        Node next;
        Node prev;
        
        Node(int data)
        {
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    
	public static void main(String[] args) {
	
	int data, n;
	
	Node head=null;
	Node tail=null;
	
	Scanner sc=new Scanner(System.in);
	do{
	   System.out.println("Enter data");
	   data=sc.nextInt();
	   Node new_code=new Node(data);
	   
	   if(head==null)
	   {
	       head=new_code;
	       tail=new_code;
	   }
	   else
	   {
	       head.prev=new_code;
	       new_code.next=head;
	       head=new_code;
	   }
	   
	   System.out.println("If you want print more data then press 1");
	   n=sc.nextInt();
	}while(n==1);
	
	if(head==null)
	{
	    System.out.println("Linked list does not exit");
	}
	else
	{
    Node temp=head;
    while(temp!=null)
    {
        System.out.print(temp.data + " ");
        temp=temp.next;
    }
	}
	
	}
}
