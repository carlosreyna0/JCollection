package JCollection;
import JCollection.ArrayUtil.Methods;
import JCollection.Event.Array.*;

public class Array<T>
{
	private Methods<T> methods = new Methods<>();
	public int length = 0;
	public T[] items = (T[]) new Object[0];
	public ArrayItemAdded<T>[] itemAddedEvents = new ArrayItemAdded[0];
	public ArrayItemChanged<T>[] itemChangedEvents = new ArrayItemChanged[0]; 
	public ArrayItemRemoved<T>[] itemRemovedEvents = new ArrayItemRemoved[0];
	
	public Array() {}
	public Array(T item)
	{
		this.add(item);
	}
	public Array(Array<T> items)
	{
		this.add(items);
	}
	public Array(T[] items)
	{
		this.add(items);
	}
	
	public void addAddedEvent(ArrayItemAdded<T> onItemAdded)
	{
		this.itemAddedEvents = new Methods<ArrayItemAdded<T>>().add.add(onItemAdded, this.itemAddedEvents, null);
	}
	public void addChangedEvent(ArrayItemChanged<T> onItemChanged)
	{
		this.itemChangedEvents = new Methods<ArrayItemChanged<T>>().add.add(onItemChanged, this.itemChangedEvents,null);
	}
	public void addRemovedEvent(ArrayItemRemoved<T> onItemRemoved)
	{
		this.itemRemovedEvents = new Methods<ArrayItemRemoved<T>>().add.add(onItemRemoved, this.itemRemovedEvents, null);
	}
	
	public void removeAllAddedEvent(ArrayItemAdded<T> onItemAdded)
	{
		this.itemAddedEvents = new Methods<ArrayItemAdded<T>>().removeAll.removeAll(onItemAdded, this.itemAddedEvents, null);
	}
	public void removeAllChangedEvent(ArrayItemChanged<T> onItemChanged)
	{
		this.itemChangedEvents = new Methods<ArrayItemChanged<T>>().removeAll.removeAll(onItemChanged, this.itemChangedEvents, null);
	}
	public void removeAllRemovedEvent(ArrayItemRemoved<T> onItemRemoved)
	{
		this.itemRemovedEvents = new Methods<ArrayItemRemoved<T>>().removeAll.removeAll(onItemRemoved, this.itemRemovedEvents, null);
	}
	
	public void add(T item)
	{
		this.items = this.methods.add.add(item, this.items, this.itemAddedEvents);
		length = this.items.length;
	}
	public void add(Array<T> array)
	{
		add(array.items);
		length = this.items.length;
	}
	public void add(T[] array)
	{
		this.items = this.methods.add.add(array, this.items, this.itemAddedEvents);
		length = this.items.length;
	}
	public void remove()
	{
		this.items = this.methods.remove.remove(this.items, this.itemRemovedEvents);
		length = this.items.length;
	}
	public void removeAll(T item)
	{
		this.items = this.methods.removeAll.removeAll(item, this.items, this.itemRemovedEvents);
		length = this.items.length;
	}
	public void removeAll(T[] items)
	{
		this.items = this.methods.removeAll.removeAll(items, this.items, this.itemRemovedEvents);
		length = this.items.length;
	}
	public void removeAll(Array<T> items)
	{
		removeAll(items.items);
		length = this.items.length;
	}
	public void addAt(int index, T item)
	{
		this.items = this.methods.addAt.addAt(index, item, this.items, this.itemAddedEvents);
		length = this.items.length;
	}
	public void addAt(int index, Array<T> array)
	{
		addAt(index, array.items);
		length = this.items.length;
	}
	public void addAt(int index, T[] array)
	{
		this.items = this.methods.addAt.addAt(index, array, this.items, this.itemAddedEvents);
		length = this.items.length;
	}
	public void removeAt(int index)
	{
		this.items = this.methods.removeAt.removeAt(index, this.items, this.itemRemovedEvents);
		length = this.items.length;
	}
	public boolean contains(T item)
	{
		return this.methods.contains.contains(item, this.items);
	}
	public boolean contains(Array<T> array)
	{
		return contains(array.items);
	}
	public boolean contains(T[] array)
	{
		return this.methods.contains.contains(array, this.items);
	}
	public void clear()
	{
		this.items = this.methods.clear.clear();
		length = 0;
	}
	public T get(int index)
	{
		return this.methods.get.get(index, this.items);
	}
	public T[] get(int[] indexes)
	{
		return this.methods.get.get(indexes, this.items);
	}
	public void set(int index, T item)
	{
		this.items = this.methods.set.set(index, item, this.items, this.itemChangedEvents);
	}
	public int[] indexesOf(T item)
	{
		return this.methods.indexesOf.indexesOf(item, this.items);
	}
	public void filter(FilterableArray<T> filter)
	{
		this.items = this.methods.filter.filter(filter, this.items, this.itemRemovedEvents);
		length = this.items.length;
	}
	public void loop(LoopableArray<T> loop)
	{
		this.methods.loop.loop(loop, this.items);
	}
	@Override
	public Object clone()
	{
		return this.methods.clone.clone(this);
	}
	@Override
	public int hashCode()
	{
		return this.methods.hashCode.hashCode(this);
	}
	@Override
	public boolean equals(Object o)
	{
		return this.methods.equals.equals(this, (Array<T>)o);
	}
	@Override
	public String toString()
	{
		return this.methods.toString.toString(this.items);
	}
}