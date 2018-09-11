import java.util.*;

public class Kata {

  public static String encrypt(final String text, final int n) {
    if(text==""){
      return text;   
    }else if(text==null){
      return text;
    }else{
      String newString = text;
      
      for(int i = 0; i <n; i++){
        List<String> characters = Arrays.asList(newString.split(""));
        List<String> composedCharacter = new ArrayList();
        List<String> trailingCharacters = new ArrayList();

        for(int j = 0; j<=characters.size()-1; j++){
          if(j%2!=0){
             composedCharacter.add(characters.get(j));
          }else{
             trailingCharacters.add(characters.get(j));
          }
        }

        newString = String.join("",composedCharacter) + String.join("",trailingCharacters);
      }
      return newString;
    }
  }

  public static String decrypt(final String encryptedText, final int n) {
    // Your code here
    if(encryptedText=="" || n<=0){
      return encryptedText;   
    }else if(encryptedText==null){
      return encryptedText;
    }else{
        String newString = "";
        List<String> allCharacters = Arrays.asList(encryptedText.split(""));
        
        for(int i = 0; i<n; i++){
          List<String> evenCharacters = allCharacters.subList(allCharacters.size()/2, allCharacters.size());
          List<String> oddCharacters = allCharacters.subList(0,allCharacters.size()/2);
          List<String> newArray = new ArrayList();
          for(int j = 0; j<allCharacters.size()/2; j++){
              newArray.add(evenCharacters.get(j));
              newArray.add(oddCharacters.get(j));
          }
          
          if(allCharacters.size()%2!=0){
              newArray.add(evenCharacters.get(allCharacters.size()/2));
          }
          allCharacters = newArray;
        }
        
        System.out.print(newString);
        newString = String.join("",allCharacters);
        return newString;     
    }
  } 
}