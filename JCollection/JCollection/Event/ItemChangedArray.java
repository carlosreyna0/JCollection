package JCollection.Event;
@FunctionalInterface
public interface ItemChangedArray<T>
{
	public void itemChangedArray(Integer index, T oldItem, T newItem);
}