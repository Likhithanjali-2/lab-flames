package service;

//Create a class called FlamesCheckService
public class FlamesCheckService{
	
     //FlamesCheckService has a method findFlames to find the flames between two names
	 //change the return value at the end of the method corresponding to your return value
	 public char findFlames(String name1,String name2) {
		//char findFlames(String name1, String name2) takes two strings as arguments
		 
		StringBuilder strBuild = new StringBuilder(name2);
		StringBuilder possibleChars = new StringBuilder("flames");
		char temp,temp1;
		int name1Len=name1.length();
		int name2Len=name2.length();
		int totalLen=name1Len + name2Len;
		int index = 0 ,position = 0;
	    String tempString;
	 
	    //Your task is to calculate the flames value and return the corresponding character as output 
	    for (int i = 0; i < name1Len; i++){
	           for (int j = 0; j < name2Len; j++){
	        	   temp = name1.charAt(i);
	        	   temp1 = strBuild.charAt(j);
	                 if(temp == temp1) {
	                	 totalLen -= 2;
	                	 strBuild.setCharAt(j , '0');
	                 }
	          }
	    }
	    

	     while(index < possibleChars.length()) {
	        tempString = Character.toString(possibleChars.charAt(index));
	        position += 1;
	    	if(position == totalLen){
	    		possibleChars.deleteCharAt(possibleChars.indexOf(tempString));
	    		index--;
	    	    if(possibleChars.length()==1)
	    	    	break;
	    	    else
	    	    	position=0;
	    	}
	    	
	    	index++;
	    	if(index == possibleChars.length())
	    		index = 0;
	    }
	    //You must return only the following values ['f','l','a','m','e','s']
	    return possibleChars.charAt(0);
	}
}

	