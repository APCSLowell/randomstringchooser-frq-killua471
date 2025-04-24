import java.util.*;
public class RandomStringChooser
{
  /* to be implemented in part (a) */
  private ArrayList<String> main;
  public RandomStringChooser(String[] a){
    for(int i =0; i<a.length;i++){
      main.add(a[i]);
    }
  }
  public String getNext(){
    if(main.size()==0){
      return "NONE";
    }
    int randomN=(int)(Math.random()*main.size());
    return main.remove(randomN);
    

  }
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
