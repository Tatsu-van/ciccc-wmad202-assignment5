package ca.ciccc.wmad202.assignment5.problem2_4;

import java.util.ArrayList;
import java.util.Arrays;

public class ComputerProgram {
    public ArrayList<String> listOfCodes;

    public ComputerProgram(){
        this.listOfCodes = new ArrayList<String>();
    }

    public ArrayList<String> getComputerProgram(){
        return listOfCodes;
    }

    public void addComputerProgram(String code){
        this.listOfCodes.add(code);
    }


    public static void printer(ArrayList<String> computerProgram){
        int length = computerProgram.size();
        String[] codeList = new String[length];
        for(int i = 0; i < codeList.length; i++){
            codeList[i] = String.valueOf(computerProgram.get(i));
//            System.out.println(computerProgram.get(i));
        }
        System.out.println(Arrays.toString(codeList));
    }
}
