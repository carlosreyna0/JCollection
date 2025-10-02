package JCollection;
import JCollection.ArrayUtil.Methods;

public class Array<T>
{
	public Array()
	{
		checkNull();
	}
	public Array(T[] items)
	{
		this.items = items;
		checkNull();
	}
	public Array(T item)
	{
		checkNull();
		add(item);
	}
	
	public T[] items;
	private Methods<T> methods = new Methods<>();
	private void checkNull()
	{
		if(items == null)
		{
			items = (T[]) new Object[0];
		}
	}
	
	public void addAt(Integer index, T item)
	{
		checkNull();
		items = methods.addAt.addAt(index, items, item);
	}
	public void removeAt(Integer index)
	{
		checkNull();
		items = methods.removeAt.removeAt(index, items);
	}
	public boolean contains(T item)
	{
		checkNull();
		return methods.contains.contains(items, item);
	}
	public Integer[] indexesOf(T item)
	{
		checkNull();
		return methods.indexesOf.indexesOf(items, item);
	}
	public T get(Integer index)
	{
		checkNull();
		return methods.get.get(index, items);
	}
	public void set(Integer index, T item)
	{
		checkNull();
		items = methods.set.set(index, items, item);
	}
	public void add(T item)
	{
		checkNull();
		items = methods.add.add(items, item);
	}
	public void remove(T item)
	{
		checkNull();
		items = methods.remove.remove(items, item);
	}
	public void filter(FilterableArray<T> filter)
	{
		checkNull();
		loop(e->{
			if(filter.filterableArray(e) == true)
			{
				remove(e);
			}
		});
	}
	public void loop(LoopableArray<T> loop)
	{
		checkNull();
		methods.loop.loop(items, loop);
	}
	@Override
	public boolean equals(Object o)
	{
		if(o.getClass() == Array.class && ((Array<T>) o).items.length == items.length)
		{
			for(int i = 0; i < items.length; i++)
			{
				if(((Array<T>) o).items[i] != items[i])
				{
					return false;
				}
			}
			return true;
		}
		else
		{
			return false;
		}
	}
	@Override
	public String toString()
	{
		String childrenStringed = "";
		for(int i = 0; i < items.length; i++)
		{
			childrenStringed += items[i].toString();
			if(i < (items.length - 1))
			{
				childrenStringed += ",";
			}
		}
		return "{" + childrenStringed + "}";
	}
}