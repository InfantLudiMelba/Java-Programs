class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
class circular{
    Node head,tail;
public void insert(int data){
Node n=new Node(data);
if(head==null&&tail==null){
    head=tail=n;
}
else{
    tail.next=n;
    tail=n;
    tail.next=head;
}
}
public void delete(int del){
if(head==null&&tail==null){
    System.out.println("The queue is empty");
}
else{
    Node temp=head,prev=null;
    while(temp.data!=del&&temp.next!=head){
     prev=temp;
     temp=temp.next;
    }
    prev.next=temp.next;

}
}
public void display(){
Node temp=head;
do{
    System.out.print(temp.data+"\t");
    temp=temp.next;
}while(temp!=head);
}
}
public class circularlinked {
    public static void main(String[] args){
    circular c=new circular();
    c.insert(1);
    c.insert(2);
    c.insert(3);
    c.insert(4);
    c.insert(5);
    c.display();
    c.delete(4);
    c.delete(3);
    c.display();

    }
}
