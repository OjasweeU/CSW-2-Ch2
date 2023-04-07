package ClassProblems;
/*import java.util.Enumeration;
import java.util.Hashtable;*/
import java.util.HashSet;
public class HashTableImplementation 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("Ramesh", 1);
        hashtable.put("Sohan", 2);
        hashtable.put("Atul", 3);
        hashtable.put("Soma", 3);
        hashtable.put("Mona", 3);
        
        int valueA = hashtable.get("A");
        System.out.println("Value of A: " + valueA);
        //hashtable.remove("B");
        
        Enumeration<String> keys = hashtable.keys();
        while (keys.hasMoreElements()) 
        {
            String key = keys.nextElement();
            System.out.println("Key: " + key + ", Value: " + hashtable.get(key));
        }*/
		//Create a hash set.
		HashSet<String> hs = new HashSet<String>();
		// Add elements to the hash set.
		hs.add("Brazil"); 
		hs.add("Russia"); 
		hs.add("India"); 
		hs.add("China");
		hs.add("Barbados");
		hs.add("Pakistan");
		hs.add("Japan");
		
		
		System.out.println(hs);
		System.out.println("BRICS contains Russia: " + hs.contains("Russia"));
		System.out.println("BRICS contains India : " + hs.contains("UK"));
		//hs.remove("China"); 
		hs.remove("Pakistan");
		hs.remove("Barbados");
		hs.remove("Japan");
		System.out.println(hs); 
		System.out.println("BRICS contains Pakistan : " + hs.contains("Pakistan"));
		System.out.println("BRICS contains Barbados : " + hs.contains("Barbados"));
		System.out.println("BRICS contains Japan: " + hs.contains("Japan"));
		
	}

}
