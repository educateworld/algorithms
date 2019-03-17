package algorithms;
/* traditional way of creating LinkedlIst
public class Node {

	int data;
	Node next;
	
	Node(int givenData){
		this.data=givenData;
	}
	

	public static void main(String[] args) {
	//6->4->9
			Node nodeA=new Node(6);
	Node nodeB =new Node(4);
	Node nodeC=new Node(9);
	
	nodeA.next->nodeB;
	nodeB.next=nodeC;  //all equals to creating class LinkedList {//stmts} in Java it will take care about creating links between nodes.
	
	}

}
*/
class LinkedList 
{ 
    Node head;  // head of list 
  
    /* Linked list Node.  This inner class is made static so that 
       main() can access it */
    static class Node { 
        int data; 
        Node next; 
        Node(int givenData)  
        {
        	data = givenData; 
        	next=null; } // Constructor 
    } 
    public void printList() 
    { 
        Node currentNode = head; 
        while (currentNode != null) 
        { 
            System.out.print(currentNode.data+" "); 
            currentNode = currentNode.next; 
        } 
    } public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        LinkedList llist = new LinkedList(); 
  
        llist.head       = new Node(1); 
        Node second      = new Node(2); 
        Node third       = new Node(3); 
  
        llist.head.next = second; // Link first node with the second node 
        second.next = third; // Link first node with the second node 
  
        llist.printList(); 
    } 
}