class Node{
 int data;
 Node next;
 Node(int data){
  this.data=data;
 }
}
class linkedlist{
  Node head,tail;
public void insert(int data){
  Node n=new Node(data);
  if(head==null){
    head=n;
    tail=n;
  }
  else{
    tail.next=n;
    tail=n;
  }
}
public void delete(int del){
  Node temp=head,prev=null;
  if(temp!=null&&temp.data==del){
    head=temp.next;
  }
  while(temp.data!=del&&temp!=null){
    prev=temp;
    temp=temp.next;
  }
  if(temp==null){
 System.out.println("The number is not found");
  }
  prev.next=temp.next;

}
public void display(){
  Node temp=head;
  while(temp!=null){
    System.out.println(temp.data+"\t");
    temp=temp.next;
  }
}
}
class Singlylinkedlist{
  public static void main(String[] args){
  linkedlist l=new linkedlist();
  l.insert(10);
  l.insert(11);
  l.insert(12);
  l.display();
  l.delete(11);
  l.display();
  }
}