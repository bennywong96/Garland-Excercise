import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Garland{
    ArrayList<Word> bigAssList = new ArrayList<>();
    Word abc = new Word();

    public void testGarland(String word){
        //word = "onion";
        int position = 0;
        int z = 10;
        //double z = Double.POSITIVE_INFINITY;
        for (int i=0; i<word.length()-1; i++){
           // System.out.println(word.substring(0,i+1));
           // System.out.println(word.substring(word.length()-(i+1), word.length()));
            if(word.substring(0,i+1).equals(word.substring(word.length()-(i+1),word.length())))
            {
                position = i+1;
            }

        }

        if (position==0){
            System.out.println("Soz m8 no Garland here for " + word + ".");
        }
        else{
            System.out.println("Your word is " + word+ ".");
            System.out.println("Repeating unit is '" +word.substring(0,position) + "' of length " + position+".");

        }
        System.out.println("Repeated " + z + " times:");
        for(int j = 0; j<(int)z; j++) {
            System.out.print(word.substring(0, word.length() - position));

            if (j%50 == 0 && j>1){
                System.out.println();
            }

        }
        System.out.println(word.substring(0,position));
    }


    public void largestGarland(){
        String englishWords = "C:\\Users\\Admin\\IdeaProjects\\Garland\\src\\enable1.txt";
        String line = null;
        try{
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(englishWords);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {testGarland3(line);
            }

            Collections.sort(bigAssList);
            for (int a = 0; a<bigAssList.size(); a++) {
                System.out.print(bigAssList.get(a).word);
                System.out.println(" "+ abc.garlandLength);
            }
            bufferedReader.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" +  englishWords + "'");
        }
        catch(IOException ex) {
            System.out.println("Error reading file '" + englishWords + "'");
        }
    }

    public void testGarland2(String word){
        //word = "onion";
        int position = 0;
        int z = 10;
        //double z = Double.POSITIVE_INFINITY;
        for (int i=0; i<word.length()-1; i++){
            if(word.substring(0,i+1).equals(word.substring(word.length()-(i+1),word.length())))
            {
                position = i+1;
            }

        }

        if (position<4){
            //System.out.println("Soz m8 no Garland here for " + word + ".");
        }
        else{

            ArrayList<String> newWord = new ArrayList<>();
            newWord.add(word);

                System.out.println("Your word is " + word + ".");
                System.out.println("Repeating unit is '" + word.substring(0, position) + "' of length " + position + ".");
                System.out.println(word.substring(0, position));

        }



    }

    public void testGarland3(String word){
        //word = "onion";
        int position = 0;
        int z = 10;
        //double z = Double.POSITIVE_INFINITY;
        for (int i=0; i<word.length()-1; i++){
            if(word.substring(0,i+1).equals(word.substring(word.length()-(i+1),word.length())))
            {
                position = i+1;
            }

        }

        if (position<4){
            //System.out.println("Soz m8 no Garland here for " + word + ".");
        }
        else{
            bigAssList.add(abc);
            abc.word= word;
            abc.garlandLength=position;
            abc.repeatingUnit=word.substring(0, position);

            //Collections.sort(bigAssList);
            System.out.println(abc.word);
            System.out.println(abc.garlandLength);
//
//            System.out.println("Your word is " + word + ".");
//            System.out.println("Repeating unit is '" + word.substring(0, position) + "' of length " + position + ".");
//            System.out.println(word.substring(0, position));

        }




    }



}

