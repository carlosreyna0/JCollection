package JCollection.Event.Array;

@FunctionalInterface
public interface ArrayItemRemoved<T>
{
	public void arrayItemRemoved(int prevIndex, T prevItem);
}