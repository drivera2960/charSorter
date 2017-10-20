import java.util.*;

public class Main {
    public static void alphabeticalSort (char[] charactersArray, int[]frequencyArray){
        char element;               //<element> holds the value of an element from <charactersArray>
        int elementASCII;           //<elementASCII> holds the ASCII number value of <element>
        char elementPlus;           //<elementPlus> is used to hold another value of an element of <charactersArray> to compare to <element>
        int elementPlusASCII;       //<elementPlusASCII> holds the ASCII number value of <elementPlus>
        char placeholderSymbol;     //<placeHolderSymbol> is used as a "separate-container" to sort elements in the <charactersArray>
        int elementFreq;            //<elementFreq> holds the number of times <element> appears in the input
        int elementFreqPlus;        //<elementFreqPlus> is used to hold how many times <elementPlus> appears in the input
        int placeHolderFrequency;   //<placeHolderFrequency> is used as a "separate-container" to sort elements in <frequencyArray>

        for (int i=0; i<charactersArray.length-1; i++){

            for (int j = i+1; j<charactersArray.length; j++) {

                element = charactersArray[i];           //<element> takes in character of an element in <charactersArray>
                elementASCII = (int) element;           //<elementASCII> takes in the ASCII number representing what is in <element>
                elementPlus = charactersArray[j];       //<elementPlus> takes in a different character of an element in <charactersArray>
                elementPlusASCII = (int) elementPlus;   //<elementPlus> takes in the ASCII number representing what is in <elementPlus>

                elementFreq = frequencyArray[i];        //<elementFreq> takes in the frequency of <element>
                elementFreqPlus = frequencyArray[j];    //<elementFreqPlus> takes in the frequency of <elementPlus>

                if(elementASCII > elementPlusASCII){    /*If <elementASCII> is greater than <elementPlusASCII> then the
                                                          elements are switched in <charactersArray>, as well as their
                                                          corresponding frequencies in <frequencyArray>*/
                    placeholderSymbol = elementPlus;
                    charactersArray[j] = element;
                    charactersArray[i] = placeholderSymbol;

                    placeHolderFrequency = elementFreqPlus;
                    frequencyArray[j] = elementFreq;
                    frequencyArray[i] = placeHolderFrequency;
                }
            }
        }

        for (int i =0; i<charactersArray.length; i++){  //This FOR loop prints out the output
            System.out.println(charactersArray[i] + " freq: " + frequencyArray[i]);
        }
        System.out.println();
        System.out.println();
    }

    public static void frequencySort(char[] charactersArray, int[] frequencyArray){
        char element;               //<element> holds the value of an element from <charactersArray>
        int elementASCII;           //<elementASCII> holds the ASCII number value of <element>
        char elementPlus;           //<elementPlus> is used to hold another value of an element of <charactersArray> to compare to <element>
        int elementPlusASCII;       //<elementPlusASCII> holds the ASCII number value of <elementPlus>
        char placeholderSymbol;     //<placeHolderSymbol> is used as a "separate-container" to sort elements in the <charactersArray>
        int elementFreq;            //<elementFreq> holds the number of times <element> appears in the input
        int elementFreqPlus;        //<elementFreqPlus> is used to hold how many times <elementPlus> appears in the input
        int placeHolderFrequency;   //<placeHolderFrequency> is used as a "separate-container" to sort elements in <frequencyArray>


        for (int i=0; i<charactersArray.length-1; i++){

            for (int j = i+1; j<charactersArray.length; j++){

                element = charactersArray[i];           //<element> takes in character of an element in <charactersArray>
                elementASCII = (int) element;           //<elementASCII> takes in the ASCII number representing what is in <element>
                elementPlus = charactersArray[j];       //<elementPlus> takes in a different character of an element in <charactersArray>
                elementPlusASCII = (int) elementPlus;   //<elementPlus> takes in the ASCII number representing what is in <elementPlus>

                elementFreq = frequencyArray[i];        //<elementFreq> takes in the frequency of <element>
                elementFreqPlus = frequencyArray[j];    //<elementFreqPlus> takes in the frequency of <elementPlus>

                if (elementFreq < elementFreqPlus){     /*If <elementFreq> is less then <elementFreqPlus> then their
                                                          elements are switched in <charactersArray> and <frequencyArray>,
                                                          according to their frequency*/

                    placeHolderFrequency = elementFreqPlus;
                    frequencyArray[j] = elementFreq;
                    frequencyArray[i] = placeHolderFrequency;

                    placeholderSymbol = elementPlus;
                    charactersArray[j] = element;
                    charactersArray[i] = placeholderSymbol;
                }
                if (elementFreq == elementFreqPlus){    /*If <elementFreq> is equal to <elementFreqPlus> then their
                                                          elements are switched in <charactersArray> and <frequencyArray>,
                                                          according to their ASCII symbol position*/

                    if (elementASCII > elementPlusASCII){
                        placeholderSymbol = elementPlus;
                        charactersArray[j] = element;
                        charactersArray[i] = placeholderSymbol;

                        placeHolderFrequency = elementFreqPlus;
                        frequencyArray[j] = elementFreq;
                        frequencyArray[i] = placeHolderFrequency;
                    }
                }
            }
        }
        System.out.println("The sorted by frequency characters are:");
        System.out.println();

        for (int i =0; i<charactersArray.length; i++){      //This FOR loop prints out the output
            System.out.println(charactersArray[i] + " freq: " + frequencyArray[i]);
        }
        System.out.println();
        System.out.println();
    }

    public static void charTypes(String duplicateInput2){
        int textualCharacterCount = 0;      //Holds value of how many textual characters exist <input>
        int numericalCharacterCount = 0;    //Holds value of how many numerical characters exist in <input>
        int whiteSpaceCharacterCount = 0;   //Holds value of how many white spaces exist in <input>

        //FOR loop counts how many textual, character, and whitespace characters exist in <input> (FOR loop does not count symbols)
        for(int i = 0; i < duplicateInput2.length(); i++){
            if (Character.isLetter(duplicateInput2.charAt(i))){
                textualCharacterCount++;
            }
            if (Character.isDigit(duplicateInput2.charAt(i))){
                numericalCharacterCount++;
            }
            if (Character.isWhitespace(duplicateInput2.charAt(i))){
                whiteSpaceCharacterCount++;
            }
        }

        int symbolCharacterCount = duplicateInput2.length() - textualCharacterCount - numericalCharacterCount - whiteSpaceCharacterCount;
        //Holds value of how many symbols exist in <input>

        System.out.println("Textual Character Count: " + textualCharacterCount);
        System.out.println("Numerical Character Count: " + numericalCharacterCount);
        System.out.println("Whitespace Character Count: " + whiteSpaceCharacterCount);
        System.out.println("Symbol Character Count: " + symbolCharacterCount);
        System.out.println();
        System.out.println();
    }

    public static void main(String args[]) {

        int freq = 0;   //Counter for how many times value occurs in the user inputted string
        int menu = 0;   //Holds user input to access methods within the program
        int z = 0;      //Incrementer for making arrays <charactersArray> and <frequencyArray>
        int howManyCharacters = 0;
        Scanner scnr = new Scanner(System.in);

        System.out.println("Welcome to Character Sorter Program");
        System.out.println("Please input a string to be sorted");

        String input = scnr.nextLine();             //String that user enters.

        String duplicateInput1 = "";                //A duplicate of the string the user enters; used for determining size of arrays.
        duplicateInput1 = duplicateInput1 + input;

        String duplicateInput2 = "";                /*Another duplicate of the string the user enters; used for determining
                                                     the textual, numerical, symbols, and whitespace count.*/
        duplicateInput2 = duplicateInput2 + input;

        System.out.println();

        //The following nested FOR loop determines the size (<howManySymbols>) of <charactersArray> and <frequencyArray>
        for (int i = 0; i < duplicateInput1.length(); i++){
            char selected = duplicateInput1.charAt(i);

            if (selected != '\0'){

                for (int j = 0; j < duplicateInput1.length(); j++) {

                    if (selected == duplicateInput1.charAt(j)) {
                        howManyCharacters++;
                        duplicateInput1 = duplicateInput1.replace(selected, '\0');
                        break;
                    }
                }
            }
        }

        char[] charactersArray = new char[howManyCharacters];  //Initializes char array that will hold characters from the string
        int[] frequencyArray = new int[howManyCharacters];     /*Initializes int array that will hold the frequency corresponding
                                                                 to each element in char array*/
        //The following FOR loop inserts values into <charactersArray> and <frequencyArray>
        for (int i = 0; i < input.length(); ++i) {
            char selected = input.charAt(i);

            if (selected != '\0') {

                for (int j = 0; j < input.length(); ++j) {
                    if (selected == input.charAt(j)) {
                        freq++;
                    }
                }
                input = input.replace(selected, '\0');
                charactersArray[z] = selected;
                frequencyArray[z] = freq;
                freq = 0;
                z++;
            }
        }

        while (menu != 4) {
            System.out.println("Please select the option you would like to see");
            System.out.println();
            System.out.println("1. Display character frequencies alphabetically");
            System.out.println("2. Display sorted frequencies");
            System.out.println("3. Show types of character frequencies");
            System.out.println("4. Exit");

            try {
                menu = scnr.nextInt();             //Takes in input into <menu>

                if ((menu > 4) || (menu < 1)){     //Determines whether the user entered an integer greater then 4 or less then one.  If so, it's thrown.
                    throw new Exception();
                }
                if (menu == 1){
                    alphabeticalSort(charactersArray, frequencyArray); //Calls method alphabeticalSort
                }
                if (menu == 2){
                    frequencySort(charactersArray, frequencyArray);    //Calls method frequencySort
                }
                if (menu == 3){
                    charTypes(duplicateInput2);                        //Calls method charTypes
                }
                if (menu == 4){                                        //Ends the program
                    System.out.println();
                    System.out.println("Character Sorter Exited Successfully");
                    break;
                }
            } catch (Throwable Exception) {                            //If user enters invalid input into <menu>
                System.out.println("Error, bad input, please enter a number 1-4");
                System.out.println();
                scnr.nextLine();
            }
        }
    }
}