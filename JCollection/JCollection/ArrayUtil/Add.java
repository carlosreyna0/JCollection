package JCollection.ArrayUtil;

public class Add<T>
{
	public T[] add(T[] array, T item)
	{
		return new AddAt<T>().addAt(array.length, array, item);
	}
}