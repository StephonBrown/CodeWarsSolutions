public class Positive{

  public static int sum(int[] arr){
   int total = 0;
   for(int currentInt: arr){
     if(currentInt>0){
       total = total + currentInt;
     }
   }
   return total;
  }

}