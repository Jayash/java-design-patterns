package behavioral.iterator;

public class ItemIterator implements Iterator {
	
	private Item item;
	private int pos;
	
	public ItemIterator(Item item, int pos) {
		this.item = item;
		this.pos = pos;
	}

	@Override
	public boolean hasNext() {
		if(pos < item.getArray().length - 1) return true;
		return false;
	}

	@Override
	public void next() {
		if(hasNext()) pos++;
	}

	@Override
	public Object current() {
		return item.getArray()[pos];
	}

}
