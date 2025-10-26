package JCollection.ArrayUtil;
import JCollection.Event.Array.ArrayItemRemoved;

public class RemoveAll<T>
{
	public T[] removeAll(T item, T[] items, ArrayItemRemoved<T>[] onItemRemoved)
	{
		int[] indexes = new IndexesOf<T>().indexesOf(item, items);
		T[] clone = (T[]) items.clone();
		
		for(int i = 0; i < indexes.length; i++)
		{
			for(int x = 0; x < onItemRemoved.length; x++)
			{
				onItemRemoved[x].arrayItemRemoved(indexes[i], items[indexes[i]]);
			}
			clone = new RemoveAt<T>().removeAt(indexes[i], clone, (ArrayItemRemoved<T>[]) new ArrayItemRemoved[0]);
		}
		
		return clone;
	}
	public T[] removeAll(T[] array, T[] items, ArrayItemRemoved<T>[] onItemRemoved)
	{
		for(int i = 0; i < array.length; i++)
		{
			items = removeAll(array[i], items, onItemRemoved);
		}
		return items;
	}
}