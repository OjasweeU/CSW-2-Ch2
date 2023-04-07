package ClassProblems;
import java.util.PriorityQueue;
public class MinHeapImplementation {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		int[] arr = {10,9,12,15,3,5,11,20};
		for(int i: arr){
		pq.add(i);
		}
		System.out.println("Printing Priority Queue Heap : " + pq);
		System.out.print("remove elements of Priority Queue ::");
		while(pq.isEmpty() == false){
		System.out.print(" " + pq.remove());
	}

}
}
