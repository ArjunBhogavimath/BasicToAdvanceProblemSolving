package Hashing;
//HackerEarth Problem
import java.util.*;
class FrequencyOfCharacters {
    public static void main(String args[] ) throws Exception {

        //Scanner*/
        Scanner s = new Scanner(System.in);
        char charToFind = s.next().charAt(0);
        s.nextLine(); //this one is used to hit enter and go next line to take input
        String charString = s.nextLine();
        getFrequncy(charToFind, charString);

    }
    public static void getFrequncy(char ch, String str){
        int hash_arr[] = new int[255];
        //pre-computing
        for(int i=0;i<str.length();i++){
            hash_arr[str.charAt(i)]++;
        }
        System.out.println(hash_arr[ch]);

    }
}

//this is how to store characters if not sure of the capital or small char
//if only capital char or small char
//then we can use arr of only length 26
//and we can store it there
//the 0 index we can get by substracting a/A with the current char
//ex: c-a returns 2 because 99-97 = 2 AASCII VALUE WILL COME


