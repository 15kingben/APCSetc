
/**
 * Write a description of class main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class main
{
    // instance variables - replace the example below with your own
    public static void main(){
        System.out.println("       This is a Downton Abbey Quiz");
        System.out.println("Type the letter of the right answer");
        System.out.print("\n\n\n");
        EasyReader console = new EasyReader();
        EasyReader console2 = new EasyReader();
        EasyReader console3 = new EasyReader();
        EasyReader console4 = new EasyReader();
        EasyReader console5 = new EasyReader();
        int score = 0;
        char c;
        char c2;
        char c3;
        char c4;
        char c5;
        //*******************************************************************************************
        System.out.println("Question 1:");
      Question q1 = new Question();
      q1.setrightanswer('b').setname("hi");
        
        q1.setname("What was the name of the Dowager countess of Grantham");
        q1.setanswer1("Elizabeth Crowley");
        q1.setanswer2("Violet Crowley");
        q1.setanswer3("Kora Crowley");
        q1.setanswer4("Sybil Crowley");
        System.out.println(q1.returnname());
        System.out.println(q1.returnanswer1());
        System.out.println(q1.returnanswer2());
        System.out.println(q1.returnanswer3());
        System.out.println(q1.returnanswer4());
        System.out.println("Enter the right answer");
        c = console.readChar();
        if(c == q1.returnrightanswer()){
            q1.setscore(1);
            System.out.println("Right!");
        }
        else{
            q1.setscore(0);
            System.out.println("Wrong");
        }
        score = score + q1.returnscore();
    //System.out.println("Your score is " + score);
        //******************************************************************************************
        
        
            System.out.println("Question 2:");
        Question q2 = new Question();
        q2.setrightanswer('c');
        q2.setname("What year is the beginning of the series");
        q2.setanswer1("1912");
        q2.setanswer2("1913");
        q2.setanswer3("1914");
        q2.setanswer4("1915");
        System.out.println(q2.returnname());
        System.out.println(q2.returnanswer1());
        System.out.println(q2.returnanswer2());
        System.out.println(q2.returnanswer3());
        System.out.println(q2.returnanswer4());
        System.out.println("Enter the right answer");
        c = console2.readChar();
        if(c == q2.returnrightanswer()){
            q2.setscore(1);
            System.out.println("Right!");
        }
        else{
            q2.setscore(0);
            System.out.println("Wrong");
        }
        score = score + q2.returnscore();
        
        
        //*****************************************************************************************

        
 System.out.println("Question 3:");
        Question q3 = new Question();
        q3.setrightanswer('a');
        q3.setname("What is the name of the eldest daughter of Lord and Lady Grantham");
        q3.setanswer1("Mary Crawley");
        q3.setanswer2("Sybil Crawley");
        q3.setanswer3("Edith Crawley");
        q3.setanswer4("Molly Crawley");
        System.out.println(q3.returnname());
        System.out.println(q3.returnanswer1());
        System.out.println(q3.returnanswer2());
        System.out.println(q3.returnanswer3());
        System.out.println(q3.returnanswer4());
        System.out.println("Enter the right answer");
        c = console3.readChar();
        if(c == q3.returnrightanswer()){
            q3.setscore(1);
            System.out.println("Right!");
        }
        else{
            q3.setscore(0);
            System.out.println("Wrong");
        }
        score = score + q3.returnscore();
       //***********************************************************************************************
        
        System.out.println("Question 4:");
        Question q4 = new Question();
        q4.setrightanswer('a');
        q4.setname("What was the name of the heir to Downton Abbey that died in the sinking of the Titanic");
        q4.setanswer1("Patrick");
        q4.setanswer2("Branson");
        q4.setanswer3("Matthew");
        q4.setanswer4("Charles");
        System.out.println(q4.returnname());
        System.out.println(q4.returnanswer1());
        System.out.println(q4.returnanswer2());
        System.out.println(q4.returnanswer3());
        System.out.println(q4.returnanswer4());
        System.out.println("Enter the right answer");
        c = console4.readChar();
        if(c == q4.returnrightanswer()){
            q4.setscore(1);
            System.out.println("Right!");
        }
        else{
            q4.setscore(0);
            System.out.println("Wrong");
        }
        score = score + q4.returnscore();
       
       
       
       
       
       //********************************************************************************************
        System.out.println("Your score is " + score + " of four");
        
        
        
        
        
    }
}
