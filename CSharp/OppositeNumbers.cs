using System;

public class Kata
    {
        public  static int Opposite(int number)
        {
            // Happy Coding
            if(number>0){
              return Int32.Parse("-" + number.ToString());
            }else{
              return Math.Abs(number);
            }
            
        }
    }