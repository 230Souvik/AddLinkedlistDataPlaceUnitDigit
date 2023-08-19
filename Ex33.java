
package ex33;


public class Ex33 {

    static node head1,head2;
    static class node{
        int data;
        node next;
        node(int d){
            data=d;
             next=null;
        }
    }
    public void printList(node head){
         while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println("");
    }
    public static node addTwoLists(node head1, node head2){
        node head3=new node(0);
        int c=0;
        node h=head3;
        while(head1!=null && head2!=null){
            int data3=head1.data+head2.data+c;
            c=data3/10;
            head3.next= new node(data3%10);
            head1=head1.next;
            head2=head2.next;
            head3=head3.next;
        }
        while(head1!=null ){
            int data3=head1.data+c;
            c=data3/10;
            head3.next= new node(data3%10);
            head1=head1.next;
            //head2=head2.next;
            head3=head3.next;
        }
        while(head2!=null ){
            int data3=head2.data+c;
            c=data3/10;
            head3.next= new node(data3%10);
           // head1=head1.next;
            head2=head2.next;
            head3=head3.next;
        }
        if(c!=0)
            head3.next=new node(c);
        
        return h.next;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
         Ex33 list = new Ex33();
 
        // creating first list
        list.head1 = new node(7);
        list.head1.next = new node(5);
        list.head1.next.next = new node(9);
        list.head1.next.next.next = new node(4);
        list.head1.next.next.next.next = new node(6);
        System.out.print("First list is ");
        list.printList(head1);
 
        // creating second list
        list.head2 = new node(8);
        list.head2.next = new node(4);
        System.out.print("Second list is ");
        list.printList(head2);
 
        System.out.print("Resultant list is ");
        // add the two lists and see the result
        node h1=addTwoLists(head1, head2);
         list.printList(h1);
    }
    
}
