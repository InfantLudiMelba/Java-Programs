import java.util.*;
class Cust{
    String custname;
    String phone;
    int cid;
    String email;
Cust(int cid,String custname,String phone,String email){
this.cid=cid;
this.custname=custname;
this.phone=phone;
this.email=email;
}
public int getcid(){
    return cid;
}
public String getcustname(){
    return custname;
}
public String getphone(){
    return phone;
}
public String getemail(){
    return email;
}
public String toString(){
    return "cid"+cid+"cname"+custname+"phone"+phone+"email"+email;
}
}
class Inkural{
int iid;
Date date;
List<Item>items;
Cust customer;
Inkural(int iid,Cust c){
this.iid=iid;
this.customer=c;
this.date=new Date();
this.items=new ArrayList<>();
}
public int getiid(){
    return iid;
}
public Date getdate(){
    return date;
}
public List<Item> getitem(){
    return items;
}
public Cust getcustomer(){
    return customer;
}
public void additem(Item item){
    items.add(item);
}
public double gettotal(){
    double total=0.0;
    for(Item i:items){
        total+=i.gettotal();
    }
return total;
}
public String toString(){
    StringBuilder sb=new StringBuilder();
    sb.append("Customerid").append(customer.getcid()).append("Invoiceid").append(iid);
   return sb.toString();
}
}
class Item{
    int itid;
    String desc;
    String iname;
    double price;
    int quantity;
    Item(int itid,String desc,int quantity,double price){
        this.desc=desc;
        this.price=price;
        this.quantity=quantity;
    }
    public double getprice(){
        return price;
    }
    public int getquantity(){
        return quantity;
    }
    public String getdesc(){
        return desc;
    }
    public double gettotal(){
        return quantity*price;
 
   }
   public String toString(){

    return "description"+desc+"Quantity"+quantity+"price"+price+"Totalprice"+quantity*price;
   }
}
class inkuralmanagement{
    int cid;
    int iid;
    List<Cust>customer;
    List<Inkural>inkural;
    inkuralmanagement(){
        customer=new ArrayList<>();
        inkural=new ArrayList<>();
        this.cid=1;
        this.iid=1;
    }
    public void addcus(String custname,String phone,String email){
        //System.out.println("cid"+cid++);
        Cust c=new Cust(cid++,custname,phone,email);
        customer.add(c);
        System.out.println("Customer added"+customer);
    }
    public void addinkural(int id){
    Cust i=customer.get(id-1);
    if(i==null){
        System.out.println(" custid Not found");
    }
    else{
        Inkural in=new Inkural(iid++,i);
        inkural.add(in);
        System.out.println("Invoid added");
    }
    }
    public void additemtoinvoice(int iid,String desc,int quantity,double price){
     for(Inkural i:inkural){
        if(i.getiid()==iid){
            Item item=new Item(iid,desc,quantity,price);
            i.additem(item);
            System.out.println("Added");
            return;
        }
     }
     System.out.println("Not found");
    }
    public void ListAllCust(){
        for(Cust c:customer){
         System.out.println(c);
        }
    }
    public void ListAllinvoice(){
        for(Inkural i:inkural){
            System.out.println(i);
        }
    }
    public void listofinvoiceofcust(int cid){
        for(Inkural i:inkural){
            if(i.getcustomer().getcid()==cid){
             System.out.println(i);
            }
        }
    }
    public void diaplayinvoid(int iid){
        for(Inkural i:inkural){
            if(iid==i.getiid()){
                System.out.println(i);
            }
        }
    }
}
public class inkuran {
    public static void main(String[] args){
        inkuralmanagement ik=new inkuralmanagement();
        ik.addcus("John Doe", "john@example.com", "1234567890");
        ik.addcus("Jane Smith", "jane@example.com", "0987654321");

        ik.addinkural(1);
        ik.addinkural(2);

        ik.additemtoinvoice(1, "Laptop", 1, 1000.00);
        ik.additemtoinvoice(1, "Mouse", 2, 25.00);
        ik.additemtoinvoice(2, "Keyboard", 1, 45.00);
        ik.ListAllCust();
        ik.ListAllinvoice();
        System.out.println();
        ik.listofinvoiceofcust(1);
        ik.diaplayinvoid(2);
        /*management.listAllInvoices();
        management.listInvoicesOfCustomer(1);
        management.displayInvoiceDetails(1);*/
    }
}
