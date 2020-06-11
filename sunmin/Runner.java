package Programmers;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Runner {
	
	private String[] participant;
	private String[] completion;	
	
    public String Runner(String[] p, String[] c) {
    	p=participant;
    	c=completion;
        String answer = "";
        
        Arrays.sort(p);
        Arrays.sort(c);
        
        int i;
        for(i=0; i<c.length; i++) {
        	if(!(p[i].equals(c[i]))) {
        		return p[i];
        	}
        }
        return p[i];

	}

}
