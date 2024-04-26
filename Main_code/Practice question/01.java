// JAVA string program to check for Anagram
// Input: str1 = "Silent"
//             str2 ="Listen"
// Output: Strings are Anagram 

import java.util.Arrays;

class lpu{
    public static void main(String[] args) {
        String str1="Silent";
        String str2="Listen";

        str1=str1.toLowerCase();
        str2=str.toLowerCase();


        if(str1.length()==str2.length()){

            char arr1[] = str1.toCharArray();
            char arr2[] = str2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);
            
            boolean res=Arrays.equals(arr1,arr2);
            if(res){
                System.out.println("yes it is anagram");
            }
            else{
                System.out.println("No it is not anagram");
            }

        }
        else{
            System.out.println("it is not anagram");
        }
    }
}
