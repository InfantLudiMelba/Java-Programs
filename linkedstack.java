class Node{
    int data;
    Node next;
Node(int data){
    this.data=data;
    }
}
class stack{
    Node top=null,head=null;
public void push(int data){
Node n=new Node(data);
if(top==null&&head==null){
    head=n;
    top=n;
}
else{
    top.next=n;
    top=n;
    top.next=null;
}
}
public void pop(){
    Node temp=head,prev=null;
    if(top==null){
        System.out.println("The stack is empty");
    }
    else{ 
        while(temp!=top)
        {
         prev=temp;
         temp=temp.next;
        }
        top=prev;
        top.next=null;
    }
    }
public void peek(){
System.out.println("The top element is:"+top.data);
}
public void display(){
Node temp=head;
while(temp!=null){
    System.out.print(temp.data+"\t");
    temp=temp.next;
}
}
}

public class linkedstack{
    public static void main(String[] args){
    stack s=new stack();
    s.push(10);
    s.push(9);
    s.push(8);
    s.push(6);
    s.push(5);
    s.display();
    s.pop();
    s.pop();
    s.display();
    s.peek();
    }
}