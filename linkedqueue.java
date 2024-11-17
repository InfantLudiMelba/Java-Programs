class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class queue{
    Node front=null,rear=null;
public void enqueue(int data){
    Node n=new Node(data);
  if(front==null&&rear==null){
    front=n;
    rear=n;
  }
  else{
    rear.next=n;
    rear=n;
  }

}
public void dequeue(){
if(front==null&&rear==null){
    System.out.println("The Queue is empty");
}
else{
    front=front.next;
}
}
public void display(){
Node temp=front;
while(temp!=null){
    System.out.print(temp.data+"\t");
    temp=temp.next;
}
}
public void peek(){
    System.out.println("The peek element is:"+front.data);
}
}
public class linkedqueue {
    public static void main(String[] args){
     queue q=new queue();
     q.enqueue(10);
     q.enqueue(11);
     q.enqueue(12);
     q.enqueue(13);
     q.enqueue(14);
     q.display();
     q.dequeue();
     q.display();
     q.peek();
    }
}
