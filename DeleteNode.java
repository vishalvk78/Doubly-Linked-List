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
	    
	    
	    do{
	    
	     if(head==null)
	     {
	         System.out.println("Link list does not exist");
	     }
	        else
	        {
	            System.out.println("Enter 1 for delete at beginning, Enter 2 for delete at end, Enter 3 for delete at speciifc locations");
	            m=sc.nextInt();
	            switch(m)
	            {
	                case 1 :
	                    //delete node at beginning
	                    Node temp2=head;
	                    temp2=temp2.next;
	                    head=temp2;
	                    head.prev=null;
	                    break;
	                    
	               case 2 :
	                   //delete node end
	                   Node temp3=tail;
	                   temp3=temp3.prev;
	                   tail=temp3;
	                   tail.next=null;
	                   break;
	                   
	                   
	               case 3 :
	                   //delete note at give position
	                  System.out.println("Enter the position of delete ");
	                  pos=sc.nextInt();
	                  Node temp1=head;
	                  Node ptr1=temp1.next;
	                  for(int i=0;i<pos-2;i++)
	                     {
	                        temp1=ptr1;
	                        ptr1=ptr1.next;
	                     }
	                  temp1.next=ptr1.next;
	                  ptr1=ptr1.next;
	                  ptr1.prev=temp1;
	                  break;
	                   
	                   
	            }
	        }
	        
	    System.out.println("Do you want to enter more data, please press 1 : ");
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
