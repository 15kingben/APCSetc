public class Question
{
String answer1 = new String();
String answer2 = new String();
String answer3 = new String();
String answer4 = new String();
String question = new String();
int score;
char rightanswer;

public int returnscore(){
return score;
}
public void setscore(int x){
score = x;
}

public char returnrightanswer(){
return rightanswer;
}
public Question setrightanswer(char x){
rightanswer = x;
return this;
}

public String returnname(){
return question;
}
public void setname(String x){
question = x;
}

public String returnanswer1(){
return answer1;
}
public void setanswer1(String x){
answer1 = x;
}

public String returnanswer2(){
return answer2;
}
public void setanswer2(String x){
answer2 = x;
}

public String returnanswer3(){
return answer3;
}
public void setanswer3(String x){
answer3 = x;
}

public String returnanswer4(){
return answer4;
}
public void setanswer4(String x){
answer4 = x;
}





}














