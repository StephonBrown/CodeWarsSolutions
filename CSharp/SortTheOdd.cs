using System;
using System.Linq;
using System.Collections;


public class Kata
{
  public static int[] SortArray(int[] array)
  {
  if(array == null || array.Length == 0)
  {
    return array;
  }else
  {
    int[] odds = (from number in array where number%2!=0 && number !=0 select Convert.ToInt32(number)).ToArray();
    Array.Sort(odds);
    int oddsCounter = 0;
          
    for(int i = 0; i <=array.Length-1; i++)
    {
      if(array[i]%2==1 && array[i]!=0)
      {
        array[i] = odds[oddsCounter];
        oddsCounter +=1;
      }
    }
    
    return array;
    
  }

  }
}