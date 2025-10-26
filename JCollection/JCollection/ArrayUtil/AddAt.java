package JCollection.ArrayUtil;
import java.lang.reflect.Array;
import JCollection.Event.Array.ArrayItemAdded;

public class AddAt<T>
{
	public T[] addAt(int index, T item, T[] items, ArrayItemAdded<T>[] onItemAdded)
	{
		T[] newArr = (T[]) Array.newInstance(item.getClass(), items.length + 1);
		
		for(int i = 0; i < newArr.length; i++)
		{
			if(!(i > index))
			{
				newArr[i] = items[i];
				continue;
			}
			newArr[i] = items[i - 1];
		}
		newArr[index] = item;
		
		for(int i = 0; i < onItemAdded.length; i++)
		{
			onItemAdded[i].arrayItemAdded(index, item);
		}
		
		return (T[]) newArr;
	}
	public T[] addAt(int index, T[] array, T[] items, ArrayItemAdded<T>[] onItemAdded)
	{
		for(int i = 0; i < array.length; i++)
		{
			items = addAt(index, array[i], items, onItemAdded);
		}
		
		return items;
	}
}