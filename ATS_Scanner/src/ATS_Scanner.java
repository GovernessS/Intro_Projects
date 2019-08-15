import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

class ATS_Scanner{

    public static void main(String arg[]){
        try{
            File f = new File("Resume.txt");
            Scanner s = new Scanner(f);
            List<String> languages = new ArrayList<String>(Arrays.asList("C++", "Java", "Python", "mySql", "C", "C#", "JavaScript", "HTML", "CSS"));
            //List<String> count = new ArrayList<String>();
            int qualified = 0;

            while(s.hasNextLine()){
                String line = s.nextLine();
                for(int i = 0; i < languages.size() - 1; i++){
                    if(line.contains(languages.get(i))){
                        qualified += 1;
                    }
                }
            }   
            
            System.out.println("Count: " + qualified);

            if(qualified >= 10){
                System.out.println("This candidate has the proper qualifications for this position! Set up an interview.");
            } else {
                System.out.println("This candidate is not experienced enough for this position. Send a rejection letter.");
            }
        }

        catch(FileNotFoundException e){
            System.out.println("An error occurred when trying to read your document. Please try again.");
            e.printStackTrace(); 
        }
        

    }
}