/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package problem.pkg42;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author SyBye8898
 */
public class Problem42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FileReader in;
        BufferedReader readFile;
        String line;
        
        String word = "";
        int answer = 0;
        
        try{
            in = new FileReader(words.txt);
            readFile = new BufferedReader(in);
            while((line = readFile.readLine()) != null){
                
                for(int i = 0; i < line.length(); i++){
                    if(line.charAt(i) == ("\"")){
                        if(!word.equals("")){
                            if(checkWord(word)){
                                answer++;
                                word = "";
                            }
                        }
                    }
                }
                
            }
            readFile.close();
            in.close();
        }catch(FileNotFoundException e){
            System.err.println("FileNotFoundException: " + e.getMessage());
        }catch(IOException e){
            System.err.println("IOException: " + e.getMessage());
        }
        
    }
    
    public static boolean checkWord(String word){
        
    }
    
}
