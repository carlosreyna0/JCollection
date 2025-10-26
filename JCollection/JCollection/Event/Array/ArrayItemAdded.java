package JCollection.Event.Array;

@FunctionalInterface
public interface ArrayItemAdded<T>
{
	public void arrayItemAdded(int newIndex, T newItem);
}