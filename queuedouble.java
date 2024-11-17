class Node{
    int data;
    Node prev,next;
    Node(int data){
    this.data=data;
    }
}
class doubly{
Node head=null,rear=null;
public void enqueue(int data){
    Node n=new Node(data);
    if(head==null&&rear==null){
        head=rear=n;
    }
    else{
        n.prev=rear;
        rear.next=n;
        rear=n;
    }
    }
    public void dequeue(){
    if(head==null&&rear==null){
        System.out.println("Queue is empty");
    }
    else{
        head=head.next;
    }
    }
    public void display(){
     Node temp=head;
     while(temp!=null){
        System.out.print(temp.data+"\t");
        temp=temp.next;
     }
    }
}
public class queuedouble {
    public static void main(String[] args){
    doubly d=new doubly();
    d.enqueue(1);
    d.enqueue(2);
    d.enqueue(3);
    d.enqueue(4);
    d.enqueue(5);
    d.display();
    d.dequeue();
    d.dequeue();
    d.display();
    }
}
