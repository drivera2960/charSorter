import java.util.*;

public class Main {

    public static void alphabeticalSort (char[] symbolsArray, int[]frequencyArray){
        char element;               //<element> holds the value of an element from <symbolsArray>
        int elementASCII;           //<elementASCII> holds the ASCII number value of <element>
        char elementPlus;           //<elementPlus> is used to hold another value of an element of <symbolsArray> to compare to <element>
        int elementPlusASCII;       //<elementPlusASCII> holds the ASCII number value of <elementPlus>
        char placeholderSymbol;     //<placeHolderSymbol> is used as a "separate-container" to sort elements in the <symbolsArray>
        int elementFreq;            //<elementFreq> holds the number of times <element> appears in the input
        int elementFreqPlus;        //<elementFreqPlus> is used to hold how many times <elementPlus> appears in the input
        int placeHolderFrequency;   //<placeHolderFrequency> is used as a "separate-container" to sort elements in <frequencyArray>

        for (int i=0; i<symbolsArray.length-1; i++){        //FOR loop iterates through <symbolsArray> starting at element 0.

            for (int j = i+1; j<symbolsArray.length; j++){  //FOR loop iterates through  <symbolsArray> starting at i+1.

                element = symbolsArray[i];
                elementASCII = (int) element;
                elementPlus = symbolsArray[j];
                elementPlusASCII = (int) elementPlus;

                elementFreq = frequencyArray[i];
                elementFreqPlus = frequencyArray[j];

                if(elementASCII > elementPlusASCII){
                    placeholderSymbol = elementPlus;
                    symbolsArray[j] = element;
                    symbolsArray[i] = placeholderSymbol;

                    placeHolderFrequency = elementFreqPlus;
                    frequencyArray[j] = elementFreq;
                    frequencyArray[i] = placeHolderFrequency;
                }
            }
        }

        for (int i =0; i<symbolsArray.length; i++){
            System.out.println(symbolsArray[i] + " freq: " + frequencyArray[i]);
        }
        System.out.println();
        System.out.println();
        return;
    }

    public static void frequencySort(char[] symbolsArray, int[] frequencyArray){
        char element;               //<element> holds the value of an element from <symbolsArray>
        int elementASCII;           //<elementASCII> holds the ASCII number value of <element>
        char elementPlus;           //<elementPlus> is used to hold another value of an element of <symbolsArray> to compare to <element>
        int elementPlusASCII;       //<elementPlusASCII> holds the ASCII number value of <elementPlus>
        char placeholderSymbol;     //<placeHolderSymbol> is used as a "separate-container" to sort elements in the <symbolsArray>
        int elementFreq;            //<elementFreq> holds the number of times <element> appears in the input
        int elementFreqPlus;        //<elementFreqPlus> is used to hold how many times <elementPlus> appears in the input
        int placeHolderFrequency;   //<placeHolderFrequency> is used as a "separate-container" to sort elements in <frequencyArray>

        for (int i=0; i<symbolsArray.length-1; i++){

            for (int j = i+1; j<symbolsArray.length; j++){

                element = symbolsArray[i];
                elementASCII = (int) element;
                elementPlus = symbolsArray[j];
                elementPlusASCII = (int) elementPlus;

                elementFreq = frequencyArray[i];
                elementFreqPlus = frequencyArray[j];

                if(elementFreq < elementFreqPlus){

                    placeHolderFrequency = elementFreqPlus;
                    frequencyArray[j] = elementFreq;
                    frequencyArray[i] = placeHolderFrequency;

                    placeholderSymbol = elementPlus;
                    symbolsArray[j] = element;
                    symbolsArray[i] = placeholderSymbol;
                }
                if (elementFreq == elementFreqPlus){
                    if(elementASCII > elementPlusASCII){
                        placeholderSymbol = elementPlus;
                        symbolsArray[j] = element;
                        symbolsArray[i] = placeholderSymbol;

                        placeHolderFrequency = elementFreqPlus;
                        frequencyArray[j] = elementFreq;
                        frequencyArray[i] = placeHolderFrequency;
                    }
                }
            }
        }
        System.out.println("The sorted by frequency characters are:");
        System.out.println();

        for (int i =0; i<symbolsArray.length; i++){
            System.out.println(symbolsArray[i] + " freq: " + frequencyArray[i]);
        }
        System.out.println();
        System.out.println();
        return;
    }

    public static void charTypes(String duplicateInput){
        int textualCharacterCount = 0;
        int numericalCharacterCount = 0;
        int whiteSpaceCharacterCount = 0;

        for(int i = 0; i < duplicateInput.length(); i++){
            if (Character.isLetter(duplicateInput.charAt(i))){
                textualCharacterCount++;
            }
            if (Character.isDigit(duplicateInput.charAt(i))){
                numericalCharacterCount++;
            }
            if (Character.isWhitespace(duplicateInput.charAt(i))){
                whiteSpaceCharacterCount++;
            }
        }

        int symbolCharacterCount = duplicateInput.length() - textualCharacterCount - numericalCharacterCount - whiteSpaceCharacterCount;

        System.out.println("Textual Character Count: " + textualCharacterCount);
        System.out.println("Numerical Character Count: " + numericalCharacterCount);
        System.out.println("Whitespace Character Count: " + whiteSpaceCharacterCount);
        System.out.println("Symbol Character Count: " + symbolCharacterCount);
        System.out.println();
        System.out.println();
        return;
    }

    public static void main(String args[]){

        int freq = 0;       // <freq> holds the number of times a value appears in the input.
        int menu = 0;       // <menu> the option the user enters in the program, to carry out a particular method.
        Scanner scnr = new Scanner(System.in);

        /*
        * An ArrayList creates an array with a dynamic size (a size that can be modified).  I utilize ArrayLists to create
        * 2 perfectly sized arrays called <symbols> and <frequency>.  While ArrayLists are arrays, different syntax than
        * the standard "static-size" arrays are used to modify them.  For the sake of this project, once the program
        * create the two ArrayLists, they are converted into standard arrays.
        */
        ArrayList<Character> symbols = new ArrayList<Character>(); /* <symbols> is an array that each element holds one
                                                                       of each character value, of the inputted String.*/

        ArrayList<Integer> frequency = new ArrayList<Integer>();   /* <frequency> is an array that each element holds
                                                                       the number of times the that the element in the
                                                                       corresponding <symbols> array appears in the
                                                                       inputted sting. */
        System.out.println("Welcome to Character Sorter Program");
        System.out.println("Please input a string to be sorted");

        String input = scnr.nextLine();                         //Takes in the input String from the user.

        String duplicateInput = "";                             //Creates a duplicate of the input.
        duplicateInput = duplicateInput + input;

        System.out.println();

        for (int i = 0; i <= input.length() - 1; i++){          //This FOR loop increments through <input> to make <selected>

            char selected = input.charAt(i);                    //<selected> holds a character of <input>

            if (selected != '\0'){                              //True if selected is not a null value.

                for (int j = 0; j <= input.length() - 1; j++){  //This FOR loop counts how many times <selected> appears in <input>

                    if (selected == input.charAt(j)){           // True if <selected> and another element in the array are the same
                        freq++;                                 //<freq> increments
                    }
                }
                input = input.replace(selected, '\0');  //This command replaces all instances of <selected> with a null value (creating a empty container)

                symbols.add(selected);                          /*This creates a new element, containing the character <selected>, into the array <symbols>.
                                                                  Remember that <symbols> is a dynamically sized array.*/

                frequency.add(freq);                            /*This creates a new element, containing the integer <freq>, into the array <frequency>.
                                                                  Remember that <frequency> is a dynamically sized array.*/

                freq = 0;                                       //The value of frequency is reset to zero.
            }
        }

        /*
        Now the program will create 2 new arrays, of the two already made arrays.  These arrays will be standard
        "static-sized" arrays whose size cannot change.
        */
        char[] symbolsArray = new char[symbols.size()];    //<symbolsArray> is set to be the same size as <symbols>
        int[] frequencyArray = new int[frequency.size()];  //<frequencyArray> is set to be the same size as <frequency>

        for (int i = 0; i < symbols.size(); i++){         //This FOR loop inserts values into <symbolsArray> from <symbols>.
            symbolsArray[i] = symbols.get(i);
        }

        for (int i = 0; i < frequency.size(); i++){       //This FOR loop inserts values into <frequencyArray> from <frequency>
            frequencyArray[i] = (frequency.get(i));
        }

        while (menu != 4){
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
                    alphabeticalSort(symbolsArray, frequencyArray); //Calls method alphabeticalSort
                }
                if (menu == 2){
                    frequencySort(symbolsArray, frequencyArray);    //Calls method frequencySort
                }
                if (menu == 3){
                    charTypes(duplicateInput);                      //Calls method charTypes
                }
                if (menu == 4){                                     //Ends the program
                    System.out.println();
                    System.out.println("Character Sorter Exited Successfully");
                    break;
                }
            } catch (Throwable Exception){                          //If user enters invalid input into <menu>
                System.out.println("Error, bad input, please enter a number 1-4");
                scnr.nextLine();
            }
        }
    }
}