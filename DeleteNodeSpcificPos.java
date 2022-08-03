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
		Node temp3= new Node(40);
		Node tail;
		
       head.next=temp1;
       temp1.prev=head;
       temp1.next=temp2;
       temp2.prev=temp1;
       temp2.next=temp3;
       temp3.prev=temp2;
       tail=temp3;
       
       
       
	   //delete node from given position
         int pos=2;
	     Node tem=head;
	     Node ptr1=tem.next;
	     for(int i=0;i<pos-2;i++)
	           {
	                tem=ptr1;
	                ptr1=ptr1.next;
	           }
	            tem.next=ptr1.next;
	            ptr1=ptr1.next;
	            ptr1.prev=tem;	   
       
         Node curr=head;
        while(curr!=null){
        System.out.print(curr.data+" ");
        curr=curr.next;
    }
	}
}