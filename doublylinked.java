class Node{
    int data;
    Node next,prev;
    Node(int data){
        this.data=data;
    }
}
class doubly{
    Node head=null,tail=null;
public void insert(int data){
Node n=new Node(data);
if(head==null&&tail==null){
    head=n;
    tail=n;
}
else{
    //Node temp=tail;
    n.prev=tail;
    tail.next=n;
    tail=n;
    //tail.prev=temp;
}
}
public void delete(int del){
    Node temp=head,pas=null;
    while(temp.data!=del){
    pas=temp;
    temp=temp.next;
    }
    pas.next=temp.next;
    temp.prev=pas;
}
public void display(){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+"\t");
        temp=temp.next;
    }
}
}
public class doublylinked {
    public static void main(String[] args){
    doubly d=new doubly();
    d.insert(0);
    d.insert(1);
    d.insert(6);
    d.insert(9);
    d.insert(8);
    d.display();
    d.delete(6);
    d.display();
    }
}
