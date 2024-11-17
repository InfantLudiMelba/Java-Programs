import java.util.ArrayList;
import java.util.*;
class van implements Cloneable{
int tid;
int dtime;
char dloc;
int ptime;
char ploc;
int earn;
int custid;
char curloc='A';
public int gettid(){
  return tid;
}
public void settid(int tid){
    this.tid=tid;
}
public int getcustid(){
    return custid;
}
public void setcustid(int custid){
    this.custid=custid;
}
public int getptime(){
    return ptime;
}
public void setptime(int ptime){
    this.ptime=ptime;
}
public int getdtime(){
    return dtime;
}
public void setdtime(int dtime){
    this.dtime=dtime;
}
public char getcurloc(){
    return curloc;
}
public void setcurloc(char curloc){
this.curloc=curloc;
}
public char getploc(){
    return ploc;
}
public void setploc(char ploc){
    this.ploc=ploc;
}
public char getdloc(){
    return dloc;
}
public void setdloc(char dloc){
    this.dloc=dloc;
}
public int getearn(){
    return earn;
}
public void setearn(int earn){
    this.earn=earn;
}
protected Object clone() throws CloneNotSupportedException{
    return super.clone();
}
public String toString(){
    return "Taxi"+gettid()+"\nCurrentLocation:"+getcurloc()+"\nCustomerId:"+getcustid()+"\nPickup Location:"+getploc()+"\nDrop Location:"+getdloc()+"\nPickupTime:"+ptime+"\nDropTime:"+getdtime()+"\nEarnings:"+getearn();
}
}
class book{
private static ArrayList<van>tlist=new ArrayList<van>();
private static int tlimit=4,id=1;
private static ArrayList<van> his=new ArrayList<van>();
public void tbook(int ptime,char ploc,char  dloc) throws CloneNotSupportedException{
if(tlimit>tlist.size()){
    tlist.add(new van());
}
van ready=null;
int min=Integer.MAX_VALUE;
for(van t:tlist){
    if(t.getdtime()<=ptime&&Math.abs(ploc-t.curloc)<min){
        min=Math.abs(ploc-t.curloc);
        ready=t;
    }
}
if(ready!=null){
ready.setploc(ploc);
ready.setdloc(dloc);
ready.setcurloc(dloc);
ready.setptime(ptime);
ready.setdtime(ptime+Math.abs(dloc-ploc));
ready.setcustid(id++);
ready.settid(tlist.indexOf(ready)+1);
ready.setearn(ready.getearn()+Math.abs(dloc-ploc)*(100+(10*10)));
his.add((van)ready.clone());
}
}
public void Display(){
    System.out.println("------------------------");
    for(van t:his){
        System.out.println(t.toString());
        System.out.println("----------------------");
    }}
}
public class vanti {
    public static void main(String[] args)throws CloneNotSupportedException{
     book b=new book();
     b.tbook(1, 'B', 'C');
     b.tbook(1,'A','E');
     b.tbook(2,'C','B');
     b.Display();
    }
}
