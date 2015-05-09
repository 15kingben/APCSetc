/* @author Ben King
 * @version 10.29.2013
 * @descrip.tion Code class with methods of hide and recover to be implemented
 * @assign.ment Chpater 4 homework set
 */

public class Code  {
    private String myCode;
    private String myCodeClear;
    
    public Code(String code)
    {
        myCode = code;
        myCodeClear = code;
        
    }

    public String getCode(){
       return myCode; 
        
        
    }

    public void hide(int p1, int p2){
        String xS = "";//storage for x's
        String sTemp = myCode.substring(0,p1);//temp first half of string
        myCode = myCode.substring(p2);
        for(int i = p1; i < p2; i++){//generate number of x's
            xS += "X";
        }
        myCode = sTemp + xS + myCode;//combine string
        
        
    }

    public void recover(int p1, int p2){
        String sTemp = myCodeClear.substring(p1,p2);//portionof recovered coed
        String temp = myCode.substring(0,p1);//code from beginning
        myCode = myCode.substring(p2);//code from end
        myCode = temp + sTemp + myCode;
    }





}