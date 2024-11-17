import java.util.*;
class binary{
  static void fun(int[] arr,int first,int last,int key){
    Arrays.sort(arr);
    int mid=(first+last)/2;
    while(first<=last){
    if(key<arr[mid]){
    last=mid-1;
    }
    else if(arr[mid]==key){
      System.out.println("The Searching element is in:"+mid);
      return;
    }
    else if(key>arr[mid]){
    first=mid+1;
    }
    mid=(last+first)/2;
  }
    if(first>last){
      System.out.println("element not found");
    }
  }
}
class roughtwo{
  public static void main(String[] args){
    int[] arr={9,4,2,1,0,3,4,7,6,1};
    binary b=new binary();
    b.fun(arr,0,9,4);
  }
}