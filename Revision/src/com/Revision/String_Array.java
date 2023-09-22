package com.Revision;

public class String_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String[]array= new String[] {"Abcd","efgh","ijkl","mnop"};
    String New1 ="ijkl";
    boolean check =false;
    for (int i = 0; i < array.length; i++) {
    	if(array[i].equals(New1)) {
    		check=true;
    		break;
    		}
    		}
    	if(check)
            System.out.println(New1 + " string is present in array.");
        
    	else {
            System.out.println(New1+ " string is not present in array.");
            }
    	
        
    }
	}
