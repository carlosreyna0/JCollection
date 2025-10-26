import JCollection.Array;
import JCollection.Event.Array.ArrayItemAdded;

public class Main
{
	public static void main(String[] args)
	{
		Array<Integer> numbers = new Array<>();
		numbers.addAddedEvent((x,y)->{
			System.out.println(y + " added at " + x);
		});
		numbers.addRemovedEvent((x,y)->{
			System.out.println(y + " removed at " + x);
		});
		numbers.addChangedEvent((x,y,z)->{
			System.out.println("index "+x + " was previously " + y + " but is now "+ z);
		});
		
		numbers.add(55);
		numbers.add(91);
		numbers.add(77);
		
		numbers.remove();
		numbers.set(1, 55);
	}
}