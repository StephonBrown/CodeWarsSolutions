using System;

public static class Kata{
  // return masked string
  public static string Maskify(string cc){
    char[] letter = cc.ToCharArray();
    
    if(letter.Length>4){
    
      int stopPoint = letter.Length-4;
      int tracker = 0;
      
      while(tracker < stopPoint){
        letter[tracker] = '#';
        tracker+=1;
      }
      
      return String.Join("",letter);
      
    }else{
      
      return cc;
    }
    
  }
}

