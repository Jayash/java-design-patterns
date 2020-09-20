
package behavioral.iterator;

public class Item implements Iterable {
	
	private int[] array;
	
	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	public Item(int size) {
		this.array = new int[size];
	}
	
	@Override
	public Iterator getIterator() {
		return new ItemIterator(this, array.length);
	}
	
}
