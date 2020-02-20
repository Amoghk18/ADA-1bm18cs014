import java.util.*;
class StringMatch{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the string in which a pattern has to be found: ");
    String str=s.next();
    System.out.println("enter the string which has to be searched for: ");
    String pat=s.next();
    int strlen=str.length();
    int patlen=pat.length();
    int i,j=0;
    for(i=0;i<strlen-patlen;i++){
      j=0;
      while(j<patlen && str.charAt(i+j)==pat.charAt(j)){
        j++;
      }
      if(j==patlen){ 
        break;
      }
    }
    if(j==patlen)
    System.out.println("Pattern is present at position "+i);
     else{
        System.out.println("Pattern not present");
      }
  }
}
