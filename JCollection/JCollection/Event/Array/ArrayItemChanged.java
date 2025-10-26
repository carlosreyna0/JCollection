package JCollection.Event.Array;

@FunctionalInterface
public interface ArrayItemChanged<T>
{
	public void arrayItemChanged(int index, T prevItem, T newItem);
}