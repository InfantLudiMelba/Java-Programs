class Node{
    int data;
    Node prev,next;
    Node(int data){
        this.data=data;
    }
}
class doubly{
    Node front,rear;
    public void push(int data){
    Node n=new Node(data);
    if(front==null&&rear==null){
        front=rear=n;
    }
    else{
        n.prev=rear;
        rear.next=n;
        rear=n;
    }
    }
    public void pop(){
    if(front==null&&rear==null){
        System.out.println("The Stack is empty");
    }
    else{
        rear=rear.prev;
        rear.next=null;
    }
    }
    public void peek(){
    System.out.println("The Peek element is:"+rear.data);
    }
    public void display(){
    Node temp=front;
    while(temp!=null){
        System.out.print(temp.data+"\t");
        temp=temp.next;
    }
    }
}
public class stackdouble {
    public static void main(String[] args){
    doubly d=new doubly();
    d.push(0);
    d.push(2);
    d.push(4);
    d.push(60);
    d.push(8);
    d.display();
    d.pop();
    d.display();
    }
}
