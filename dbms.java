import java.util.*;
class store{
    Map<String,String>var;
    store(){
        var=new HashMap<>();
    }
public void setvar(String key,String value){
    var.put(key,value);
}
public String getvar(String key){
    return var.get(key);
} 
public void unsetvar(String key){
    var.remove(key);
}
public int co(String value){
    int c=0;
    for(String val:var.values()){
        if(val==value){
            c++;
        }
    }
    return c;
}
public store clone(){
    store copy=new store();
    copy.var=new HashMap<>(this.var);
    return copy;
}
}
class tracnsaction{
store cur;
Stack<store> transtack;
tracnsaction(){
    cur=new store();
    transtack=new Stack<>();
}
public void setvariable(String key,String value){
    cur.setvar(key,value);
}
public String getvariable(String key){
    return cur.getvar(key);
}
public void unsetvariable(String key){
    cur.unsetvar(key);
}
public int count(String value){
    return cur.co(value);
}
public void begin(){
 transtack.push(cur.clone());
}
public void commit(){
if(!transtack.isEmpty()){
    transtack.clear();
}
else{
    System.out.println("No moves");
}
}
public void rollback(){
if(!transtack.isEmpty()){
    cur=transtack.pop();
}
else{
    System.out.println("nomove");

}
}
}
public class dbms {
 public static void main(String[] args){
 tracnsaction tm=new tracnsaction();
        /*tm.setvariable("a", "20");
        System.out.println(tm.getvariable("a")); // 20
        tm.setvariable("b", "30");
        System.out.println(tm.getvariable("b")); // 30
        tm.setvariable("a", "10");
        System.out.println(tm.getvariable("a")); // 10
        tm.unsetvariable("c");
        System.out.println(tm.getvariable("c")); // null
        tm.setvariable("c", "30");
        System.out.println(tm.count("30")); // 2
        System.out.println(tm.count("40")); // 0
        tm.unsetvariable("a");
        System.out.println(tm.getvariable("a"));
         */
        /*tm.setvariable("a", "30");
        tm.begin();
        System.out.println(tm.getvariable("a")); // 30
        tm.setvariable("a", "40");
        System.out.println(tm.getvariable("a")); // 40
        tm.setvariable("b", "40");
        System.out.println(tm.getvariable("b")); // 40
        tm.rollback();
        System.out.println(tm.getvariable("b")); // null
        System.out.println(tm.getvariable("a")); // 30
        */
        tm.begin();
        tm.setvariable("a", "40");
        tm.setvariable("b", "40");
        tm.setvariable("c", "50");
        System.out.println(tm.count("40")); // 2
        tm.begin();
        System.out.println(tm.count("40")); // 2
        tm.commit();
        System.out.println(tm.count("40")); // 2
        tm.begin();
        tm.setvariable("c", "10");
        System.out.println(tm.getvariable("c")); // 10
        tm.rollback();
        System.out.println(tm.getvariable("c"));
 }   
}
