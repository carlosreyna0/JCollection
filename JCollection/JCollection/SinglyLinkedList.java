package JCollection;
public class SinglyLinkedList<T>
{
	public SinglyNode<T> current;
	public Integer length = 0;
	public SinglyLinkedList() {}
	public SinglyLinkedList(SinglyNode<T> head)
	{
		setCurrent(head);
	}
	public void add(T item)
	{
		SinglyNode<T> current = this.current;
		for(int i = 0; i < this.length; i++)
		{
			if((current = current.next) != null && i == (length - 2))
			{
				current.next = new SinglyNode<>(item);
				break;
			}
		}
		
		refresh();
	}
	public void remove()
	{
		SinglyNode<T> current = this.current;
		for(int i = 0; i < this.length; i++)
		{
			if((current = current.next) != null && i == (length - 3))
			{
				current.next = null;
				break;
			}
		}
		refresh();
	}
	public void setCurrent(SinglyNode<T> current)
	{
		this.current = current;
		countLength();
	}
	public void traverseRight(Integer amount)
	{
		if(this.length < amount)
		{
			setCurrent(null);
			return;
		}
		if(this.current == null || this.current.next == null)
		{
			setCurrent(null);
			return;
		}
		SinglyNode<T> current = this.current;
		
		while((current = current.next) != null)
		{
			amount--;
			if(amount == 0)
			{
				setCurrent(current);
				break;
			}
		}

	}
	public void loop(LoopableSinglyLinkedList<T> loop)
	{
		SinglyLinkedList<T> clone = (SinglyLinkedList<T>) clone();
		while(clone.current != null)
		{
			loop.loopableSinglyLinkedList(clone.current);
			clone.traverseRight(1);
		}
	}
	@Override
	public Object clone()
	{
		return new SinglyLinkedList<T>(this.current);
	}
	@Override
	public boolean equals(Object o)
	{
		if(!(o.getClass() == SinglyLinkedList.class))
		{
			return false;
		}
		if(!(((SinglyLinkedList<T>)o).length == this.length))
		{
			return false;
		}
		return true;
	}
	public void refresh()
	{
		countLength();
	}
	@Override
	public String toString()
	{
		if(this.current == null && this.current.next == null)
		{
			return null;
		}
		SinglyLinkedList<T> clone = (SinglyLinkedList<T>) clone();
		String childrenStringed = "";

		SinglyNode<T> current = clone.current;
		childrenStringed += "{" + current.value.toString() + "} -> ";
		
		while((current = current.next) != null)
		{
			clone.length--;
			childrenStringed += "{" + current.value.toString() + "}";
			if(clone.length > 1)
			{
				childrenStringed += " -> ";
			}
		}
		return childrenStringed;
	}
	private void countLength()
	{
		if(this.current != null)
		{
			SinglyNode<T> head = (SinglyNode<T>) this.current.clone();
			this.length = 1;
			while((head = head.next) != null)
			{
				this.length++;
			}
		}
		else
		{
			length = 0;
		}
	}
}
