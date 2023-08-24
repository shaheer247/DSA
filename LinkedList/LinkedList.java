package LinkedList;

public class LinkedList {
    public static class Node {
        int data;
        Node next;
        //Constructor of class Node
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    //Adding Node at First
    public static void addfirst(int data){
        //create a new node
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        // newNode.next=head
        newNode.next=head;//link
        //head=newNode
        head=newNode;
    }
    //Adding element at Last
    public static void addlast(int data){
        //create a newNode
        Node newNode=new Node(data);
        size++;
        if (head==null){
            head=tail=newNode;
            return;
        }
        //tail.next=newNode
        tail.next=newNode;
        //tail=newNode
        tail=newNode;
    }
    //Adding Node at Middle
    public static void add_at_idx(int idx,int data){
        if(idx==0){
            addfirst(data);
            return;
        }
        //Create a newNode
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        //i=idx-1; temp->prev
        newNode.next=temp.next;
        temp.next=newNode;
    }
    //Printing the LinkedList
    public void printll(){
        if(head==null){
            System.out.println("LinkedList is Empty");
        }
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    //Remove node at first
    public int removeFirst(){
        if(size==0){
            System.out.println("LinkedList is Empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
       head=head.next;
       size--;
       return val;
    }
    public int removeLast(){
        if(size==0){
            System.out.println("LinkedList is Empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val= head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=tail.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }
    public static int itr_Search(int key){
        Node temp=head;
        int i=0;
        while (temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }
    public static void reversell(){
        Node prev=null;
        Node current=tail=head;
        Node next;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
    }
    public static void deleteNthfromEnd(int n){
        //Calculate size
        int size=0;
        Node temp=head;
        while (temp!=null){
            temp=temp.next;
            size++;
        }
        if(n==size){
            head=head.next;//remove First
            return;
        }
        //size-n
        int i=1;
        int iTofind=size-n;
        Node prev=head;
        while (i<iTofind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }
    //Check LL is palindrome
    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean isPalindrome(){
        if(head==null || head.next==null){
            return true;
        }
        //find Mid
        Node midNode=findMid(head);
        //Reverse 2nd half
        Node prev=null;
        Node current=midNode;
        Node next;
        while(current !=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        Node right=prev;//right half head
        Node left=head;
        //check left=right
        while(right!=null){
            if(left.data!= right.data){
                return false;
            }
            left= left.next;
            right=right.next;
        }
        return true;
    }
    public  static boolean isCycle(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    //Remove a cycle in a LL
    public static void removeCycle(){
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast!=null &&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                cycle=true;
                break;
            }
        }
        if(cycle==false){
            return;
        }
        //find meeting point
        slow=head;
        Node prev=null;
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        //remove cycle->last.next==null
        prev.next=null;
    }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
       /* ll.addfirst(2);
        ll.addfirst(1);
        ll.addlast(3);
        ll.addlast(4);
        ll.add_at_idx(2,9);
        ll.printll();
        //ll.removeFirst();
        //ll.printll();
        //ll.removeLast();
        //ll.printll();
       // ll.reversell();
        //ll.printll();
        ll.deleteNthfromEnd(3);
        ll.printll();
        System.out.println("The size of LinkedList:"+ll.size);
        /*int result= ll.itr_Search(9);
         if(result==-1){
         System.out.println("Key not found");
         }
         else{
           System.out.println("Key found at index of LinkedList:"+result);
           }*/
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(2);
        ll.addlast(1);
        ll.printll();
        System.out.println( ll.isPalindrome());


      /*  head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=head.next;
        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());*/
    }
}
