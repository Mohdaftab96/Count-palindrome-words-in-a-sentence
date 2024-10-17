



//Input : Madam Arora teaches malayalam
//Output : 3

//Input : nitin speaks malayalam
//Output : 2




public class Count_palindrome_words_in_a_sentence{


      static boolean isPalindromic(String s){
  
          // checking Palindrome
          int left = 0;
          int right = s.length() - 1;
  
          while(left < right){
              if(s.charAt(left) != s.charAt(right)){
                  return false;
              }
              left++;
              right--;
          }
  
          return true;
      }
  
  
      static int countPalindromicWords(String str){
  
          String str1 = str.toLowerCase();
      //     System.out.println(str1 + " ");
          int count = 0;
          String a[] = str1.split( " ");
      //     int n = a.length;
  
          for(String st: a){
              if(isPalindromic(st)){
                  count = count + 1;
              }
          }
          return count;
      }
      
  
      public static void main(String[] args){
  
  
          System.out.println("Count palindrome words in a sentence : " + countPalindromicWords("Madam Arora teaches Malayalam")); // output : 3
          System.out.println("Count palindrome words in a sentence : " + countPalindromicWords("Nitin speaks malayalam")); // output : 2
  
  
      }
  
  }
  