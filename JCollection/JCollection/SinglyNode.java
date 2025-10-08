package JCollection;
public class SinglyNode<T>
{
	public SinglyNode<T> next;
	public T value;
	
	public SinglyNode() {}
	public SinglyNode(T value)
	{
		this.value = value;
	}
	public SinglyNode(SinglyNode<T> next)
	{
		setNext(next);
	}
	public SinglyNode(T value, SinglyNode<T> next)
	{
		this.value = value;
		setNext(next);
	}
	
	public void setNext(SinglyNode<T> next)
	{
		this.next = next;
	}
	public void setNext(T next)
	{
		setNext(new SinglyNode<>(next));
	}
	@Override
	public Object clone()
	{
		return this;
	}
	@Override
	public boolean equals(Object o)
	{
		if(o.getClass() == SinglyNode.class && ((SinglyNode<T>)o).value.equals(value))
		{
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
		String nextStr;
		if(this.next == null)
		{
			nextStr = "{}";
		}
		else
		{
			nextStr = "{" + next.value.toString() + "}";
		}
		return "{" + value.toString() + "}" + " -> " + nextStr;
	}
}
