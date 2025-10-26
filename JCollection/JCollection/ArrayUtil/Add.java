package JCollection.ArrayUtil;
import JCollection.Event.Array.ArrayItemAdded;
import java.lang.reflect.Array;

public class Add<T>
{
	public T[] add(T item, T[] items, ArrayItemAdded<T>[] onItemAdded)
	{	
		T[] newArr = (T[]) Array.newInstance(item.getClass(), items.length + 1);
		
		for(int i = 0; i < items.length; i++)
		{
			newArr[i] = items[i];
		}
		newArr[newArr.length - 1] = item;
		
		if(onItemAdded != null)
		{
			for(int i = 0; i < onItemAdded.length; i++)
			{
				onItemAdded[i].arrayItemAdded(newArr.length - 1, item);
			}
		}
		
		return (T[])newArr;
	}
	public T[] add(T[] array, T[] items, ArrayItemAdded<T>[] onItemAdded)
	{
		for(int i = 0; i < array.length; i++)
		{
			items = add(array[i], items, onItemAdded);
		}
		return items;
	}
}