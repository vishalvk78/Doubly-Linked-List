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
	    Node head=null;
	    Node tail=null;
	    int data, n, m, pos;
	    
	    Scanner sc=new Scanner(System.in);
	    
	    
	    do{
	        System.out.println("Enter data : ");
	        data=sc.nextInt();
	    Node new_node=new Node(data);
	    
	    if(head==null)
	    {
	        new_node.next=head;
	        head=new_node;
	        tail=new_node;
	    }
	    
	    else
	    {
	        System.out.println("Enter 1 for insert node at begin, Enter 2 for insert node at end, Enter 3 for insert node at given position");
	        m=sc.nextInt();
	        
	        switch(m)
	        {
	            case 1:
	                 //insert node at begin
	                 new_node.next=head;
	                 head.prev=new_node;
	                 head=new_node;
	                 break;
	                 
	            case 2:
	               //insert node at end
	               new_node.prev=tail;
	               tail.next=new_node;
	               tail=new_node;
	               break;
	               
	           case 3:
	               //insert node at given position
	               System.out.println("Enter the node insert postion : ");
	               pos=sc.nextInt();
	               
	               Node temp=head;
	               Node ptr=temp.next;
	               
	               for(int i=0;i<pos-2;i++)
	               {
	                   temp=ptr;
	                   ptr=ptr.next;
	               }
	               new_node.prev=temp;
	               new_node.next=ptr;
	               temp.next=new_node;
	               ptr.prev=new_node;
	               
	               break;
	        }
	   
	    }
	    System.out.println("if you want to insert more data then Enter 1");
	    n=sc.nextInt();
	    }while(n==1);
	    
	    if(head==null)
	    {
	        System.out.println("Linked List does not exits");
	    }
	    else{
	        Node temp=head;
	        while(temp!=null)
	        {
	            System.out.print(temp.data + " ");
	            temp=temp.next;
	        }
	    }
	    
	
	}
}

