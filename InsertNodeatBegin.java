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
		
       head.next=temp1;
       temp1.prev=head;
       temp1.next=temp2;
       temp2.prev=temp1;
       
       Node new_node=new Node(50);
       new_node.next=head;
	   head.prev=new_node;
	   head=new_node;
	   
	   
       
         Node curr=head;
        while(curr!=null){
        System.out.print(curr.data+" ");
        curr=curr.next;
    }
	}
}