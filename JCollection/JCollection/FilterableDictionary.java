package JCollection;
@FunctionalInterface
public interface FilterableDictionary<T, T1>
{
	public boolean filterableDictionary(int index, T key, T1 value);
}