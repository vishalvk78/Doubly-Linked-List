public class Main
{
    static class Node
    {
        int data;
        Node prev;
        Node next;
        
        Node(int data)
        {
            this.data=data;
            this.prev=null;
            this.next=null;
            
        }
    }
    
    
	public static void main(String[] args) {
		Node head= new Node(10);
		Node temp1=new Node(20);
		Node temp2= new Node(30);
		Node tail;
		
       head.next=temp1;
       temp1.prev=head;
       temp1.next=temp2;
       temp2.prev=temp1;
       tail=temp2;
       
       Node new_node=new Node(50);
       
	   int pos=2;
	               
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
	   
	   
       
         Node curr=head;
        while(curr!=null){
        System.out.print(curr.data+" ");
        curr=curr.next;
    }
	}
}