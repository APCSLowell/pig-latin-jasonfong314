int storeI = 0;
public void setup() 
{
  String[] lines = loadStrings("words.txt");
  System.out.println("there are " + lines.length + " lines");
  for (int i = 0; i < lines.length; i++) 
  {
    System.out.println(pigLatin(lines[i]));
  }
}
public void draw()
{
  //not used
}
public int findFirstVowel(String sWord) {
  //precondition: sWord is a valid String of length greater than 0.
  //postcondition: returns the position of the first vowel in sWord.  If there are no vowels, returns -1
  for (int i = 0; i<sWord.length(); i++) {
    if (sWord.substring(i, i+1).equals ("a")) {
      storeI = i;
      return i;
    }
    if (sWord.substring(i, i+1).equals ("e")) {
      storeI = i;
      return i;
    }
    if (sWord.substring(i, i+1).equals ("i")) {
      storeI = i;
      return i;
    }
    if (sWord.substring(i, i+1).equals ("o")) {
      storeI = i;
      return i;
    }
    if (sWord.substring(i, i+1).equals ("u")) {
      storeI = i;
      return i;
    }
  }
  return -1;
}

// if (sWord.substring(i, i+1).equals ("e")) return i;
//      if (sWord.substring(i, i+1).equals ("a")) return i;
//    if (sWord.substring(i, i+1).equals ("i")) return i;
//    if (sWord.substring(i, i+1).equals ("o")) return i;
//    if (sWord.substring(i, i+1).equals ("u")) return i;

//    storeI = i;
//  }
//  return -1;
//}

public String pigLatin(String sWord) {
  //precondition: sWord is a valid String of length greater than 0
  //postcondition: returns the pig latin equivalent of sWord

  if (sWord.charAt(0)=='q' && sWord.charAt(1)=='u') {
    return  sWord.substring (2, sWord.length()) + sWord.substring (0, 2)+ "ay";
  }
  //       if (findFirstVowel(sWord) != -1) {


  if (findFirstVowel(sWord) == 0)
  {
    return sWord + "way";
  }
  if (findFirstVowel(sWord) == -1)
  {
    return sWord + "ay";
  } else
  {
    return (sWord.substring (storeI) + sWord.substring (0, storeI)+ "ay");
  }
}
