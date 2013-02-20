import java.util.*;

public class NewArrayList {
	private int[] things;
	private int filledSpots;
	private static NewArrayList n;
	public NewArrayList(int max){
		things = new int[max];
		filledSpots=0;
	}
	
	public int size(){
		return filledSpots;
	}
	public void add(int x){
	//adds specified elementto arraylist, increases size by 1
		filledSpots=filledSpots+1;
		things[filledSpots-1] = x;
		
	}
	public int get(int b) {
	//take in index, find that spot in array, and return number
			return things[b];

	}
	public void set(int c,int d){
	//takes in index/value and replaces number in array list with value
		things[c] = d;
	}
	public void remove(int e){
	//deletes number at given index, decreases size by 1
	
	//shift everything down?
		while(e<=filledSpots){
			things[e]=things[e+1];
		}
		filledSpots=filledSpots-1;
		
	}
	



	public static void main (String[] args) {
		NewArrayList n = new NewArrayList(10);
		System.out.println(n.size());
		n.add(5);
		System.out.println(n.size());
		n.add(8);
		n.add(1);
		System.out.println(n.size());
		System.out.println(n.get(0)+"index 0");
		System.out.println(n.get(1)+"index 1");
		n.set(1,9);
		System.out.println(n.get(1)+"index 1");
		System.out.println(n.size());
		n.remove(1);
		System.out.println(n.get(1)+"index 1");
		
	}
}