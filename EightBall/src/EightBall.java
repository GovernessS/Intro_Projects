import java.util.Hashtable;
import java.util.Random;
import java.util.Scanner;

//Prototype EightBall game that returns generic affirmative,
//non-committal, or negative responses to Yes-No questions at random.

class EightBall {

    public static void main(String[] args) {

        //Using a hashtable for the quickest traversal speed (O(1))
        Hashtable<Integer, String> responses = new Hashtable<>();

        Random rand = new Random();
        String result = "";
        boolean repeat = true;
        Scanner in = new Scanner(System.in); //Have scanner outside the while loop to avoid NoSuchElementException

        //Repeats question if user indicates they'd like to play again in the end.
        while(repeat){
            System.out.println();
            System.out.println("Welcome to EightBall Deluxe. \n" + "What question (Yes/No) do you have?");
            String s = in.nextLine();

            EightBall e = new EightBall();
            e.GenericResponses(responses);
            result = e.RandomizedResult(responses, rand);
            
            System.out.println();
            System.out.println("Your question: " + s + "\n" + "Our response: " + result);
            System.out.println();

            System.out.println("Would you like to ask another question? (Yes or No)");
            System.out.println();
            String s2 = in.nextLine();

            repeat = e.Repeat(s2, repeat);
        }

    }

    //Helper method that stores all generic responses and puts them in the hashtable.
    public void GenericResponses(Hashtable<Integer, String> vars){
        String v1 = "YES.";
        vars.put(1, v1);

        String v2 = "NO.";
        vars.put(2, v2);

        String v3 = "NO DOUBT ABOUT IT.";
        vars.put(3, v3);

        String v4 = "ABSOLUTELY.";
        vars.put(4, v4);

        String v5 = "THE STARS SAY NO.";
        vars.put(5, v5);

        String v6 = "UNLIKELY.";
        vars.put(6, v6);

        String v7 = "POSITIVELY.";
        vars.put(7, v7);

        String v8 = "YOU CAN COUNT ON IT.";
        vars.put(8, v8);

        String v9 = "ASK LATER.";
        vars.put(9, v9);

        String v10 = "DON'T BET ON IT.";
        vars.put(10, v10);

        String v11 = "CHANCES AREN'T GOOD.";
        vars.put(11, v11);

        String v12 = "CAN'T SAY NOW.";
        vars.put(12, v12);

        String v13 = "VERY LIKELY.";
        vars.put(13, v13);

        String v14 = "CONSULT ME LATER.";
        vars.put(14, v14);

        String v15 = "IT IS CERTAIN.";
        vars.put(15, v15);

        String v16 = "BETTER NOT TELL YOU NOW.";
        vars.put(16, v16);

        String v17 = "CANNOT PREDICT NOW.";
        vars.put(17, v17);

        String v18 = "CONCENTRATE AND ASK AGAIN.";
        vars.put(18, v18);

        String v19 = "MY SOURCES SAY NO.";
        vars.put(19, v19);

        String v20 = "VERY DOUBTFUL.";
        vars.put(20, v20);

        String v21 = "YOU MAY RELY ON IT.";
        vars.put(21, v21);

        String v22 = "I DON'T KNOW.";
        vars.put(22, v22);

        String v23 = "YOU'LL KNOW IN DUE TIME.";
        vars.put(23, v23);

        String v24 = "OUTLOOK NOT SO GOOD.";
        vars.put(24, v24);

        String v25 = "ABSOLUTELY NOT.";
        vars.put(25, v25);

        String v26 = "IT IS CERTAIN.";
        vars.put(26, v26);

        String v27 = "MAYBE.";
        vars.put(27, v27);

        String v28 = "WHAT DO YOU THINK?";
        vars.put(28, v28);

        String v29 = "IT IS DECIDEDLY SO.";
        vars.put(29, v29);

        String v30 = "MY REPLY IS NO.";
        vars.put(30, v30);

    }

    //Produce a random number that is used to then select a random response from the hashtable.
    public String RandomizedResult(Hashtable<Integer, String> vars, Random r){
        int number = r.nextInt(30);
        number += 1;

        String prompt = vars.get(number);
        return prompt;
    }

    //Checks user input to determine whether or not the game should be repeated.
    public boolean Repeat(String choice, boolean b){
        if(choice.equalsIgnoreCase("No")){
            b = false;
        }

        return b;
    }
}