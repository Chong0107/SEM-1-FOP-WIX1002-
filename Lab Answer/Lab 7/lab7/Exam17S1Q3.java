
package lab7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Exam17S1Q3 {
    public static void main(String[] args) {
        try{
            PrintWriter out = new PrintWriter(new FileOutputStream("data.txt"));
            String character = generateCharacter();
            System.out.println("The string generated is: "+character);
            out.println(character);
            out.close();
            
            Scanner in = new Scanner(new FileInputStream("data.txt"));
            while(in.hasNextLine()){
                character = in.nextLine();
                char [] characterArray = new char[character.length()];
                for(int i=0;i<character.length();i++){
                    characterArray[i] = character.charAt(i);
                }
                System.out.println("String stored in ascending order: "+arrangeCharacter(characterArray,'>'));
                System.out.println("String stored in descending order: "+arrangeCharacter(characterArray,'<'));
                System.out.println("Original string from file: "+character);
            }
            in.close();
        }catch(FileNotFoundException e){
            System.out.println("File was not found.");
        }
    }
    public static String generateCharacter(){
        Random r = new Random();
        StringBuilder characters = new StringBuilder();
        int bigOrSmall;
        for(int i=0;i<6;i++){
            bigOrSmall = r.nextInt(2);
            if(bigOrSmall == 0)
                characters.append((char)(r.nextInt(26)+65));
            else
                characters.append((char)(r.nextInt(26)+97));
        }
        return characters.toString();
    }
    public static String arrangeCharacter(char [] character, char direction){
        StringBuilder orderedCharacters = new StringBuilder();
        if(direction == '>'){
            for ( int pass = 0; pass < character.length; pass++ ){ 
		for ( int i = 0; i < character.length - 1; i++ ){ 
                    if ( character[ i ] > character[ i + 1 ] ){
               		char hold = character[i];        
			character[i] = character[i+1];  
			character[i+1] = hold;
                    }
                }
            }                
        }
        else if(direction == '<'){
            for ( int pass = 0; pass < character.length - 1; pass++ ){ 
		for ( int i = 0; i < character.length - 1; i++ ){ 
                    if ( character[ i ] < character[ i + 1 ] ){
               		char hold = character[i];        
			character[i] = character[i+1];  
			character[i+1] = hold;
                    }
                }
            }
        }
        else
            System.out.println("The direction is invalid.");
        for(char c : character){
            orderedCharacters.append(c);
        }
        return orderedCharacters.toString();
    }
}
