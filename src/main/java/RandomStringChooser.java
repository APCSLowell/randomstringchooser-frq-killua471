import java.util.*;
public class RandomStringChooser
{
  /* to be implemented in part (a) */
  private String[] main;
  private int available;
  public RandomStringChooser(String[] a){
    for(int i =0; i<a.length;i++){
      main[i]=a[i];
    }
    available=a.length;
  }
  public String getNext(){
    String temp;
    int randomN=(int)(Math.random()*main.length);
    if(available==0){
      return "NONE";
    }
    if(!main[randomN].equals("unavailable")){
      temp = main[randomN];
      main[randomN]="unavailable";
      available--;
      return temp;
    }else{
      getNext();
    }
  }
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
