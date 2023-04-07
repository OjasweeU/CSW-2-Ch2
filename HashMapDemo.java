package ClassProblems;
import java.util.HashMap;
public class HashMapDemo 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        HashMap<String, Integer> hm1=new HashMap<String,Integer>();
        HashMap<Integer, String> hm2=new HashMap<Integer, String>();
        HashMap<String, String> hm3=new HashMap<String, String>();
        HashMap<Integer, Integer> hm4=new HashMap<Integer, Integer>();
        
        hm1.put("Mason", 25);
        hm2.put(89, "Maya");
        hm3.put("Mike", "Weeee");
        hm4.put(437, 568);
        
     
        	System.out.println(hm1);
        	System.out.println(hm2);
        	System.out.println(hm3);
        	System.out.println(hm4);

        	
        
	}

}
