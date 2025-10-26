package JCollection;
import JCollection.DictionaryUtil.DictionaryItem;
import JCollection.DictionaryUtil.Methods;

/*
 to do:
 overload add and remove and add at and remove at methods 
 to work with other dictionaries
*/

public class Dictionary<T, T1>
{
	public Array<DictionaryItem<T, T1>> items = new Array<>();
	public int length = 0;
	private Methods<T, T1> methods = new Methods<>();
	
	public void add(T key, T1 value)
	{
		length++;
		this.items = this.methods.add.add(key, value,this.items);
	}
	public void remove(T key)
	{
		length--;
		this.items = this.methods.remove.remove(key, items);
	}
	public void addAt(int index, T key, T1 value)
	{
		length++;
		this.items = this.methods.addAt.addAt(index, key, value, items);
	}
	public void removeAt(int index)
	{
		length--;
		this.items = this.methods.removeAt.removeAt(index, items);
	}
	public T[] getKeys(T1 value)
	{
		return this.methods.get.getKeys(value, this.items);
	}
	public T getKeyAt(int index)
	{
		return this.methods.get.getKeyAt(index, this.items);
	}
	public T1 getValueFrom(T key)
	{
		return this.methods.get.getValueFrom(key, this.items);
	}
	public T1 getValueAt(int index)
	{
		return this.methods.get.getValueAt(index, this.items);
	}
	public void setValueAt(int index, T1 value)
	{
		this.items = this.methods.set.setAt(index,this.getKeyAt(index),value,this.items);
	}
	public void setKeyAt(int index, T key)
	{
		this.items = this.methods.set.set(index, key, this.getValueAt(index), this.items);
	}
	public void setAt(int index, T key, T1 value)
	{
		this.items = this.methods.set.set(index, key, value, this.items);
	}
	public void set(T key, T1 value)
	{
		this.items = this.methods.set.setKey(key, value, items);
	}
	public int indexOf(T key)
	{
		return methods.indexOf.indexOf(key, items);
	}
	public int[] indexesOf(T1 value)
	{
		return this.methods.indexesOf.indexesOf(value, this.items);
	}
	public boolean containsKey(T key)
	{
		return this.methods.contains.containsKey(key, this.items);
	}
	public boolean containsValue(T1 value)
	{
		return this.methods.contains.containsValue(value, this.items);
	}
	public boolean contains(T key, T1 value)
	{
		return this.methods.contains.contains(key, value, this.items);
	}
	public void filter(FilterableDictionary<T, T1> filterer)
	{
		this.items = this.methods.filter.filter(filterer, this.items);
	}
	public void loop(LoopableDictionary<T, T1> loop)
	{
		this.methods.loop.loop(loop, this.items);
	}
	public void clear()
	{
		this.items = this.methods.clear.clear(this.items);
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
		return this.methods.equals.equals(this,o);
	}
	@Override
	public String toString()
	{ 
		return this.methods.toString.toString(this);
	}
}