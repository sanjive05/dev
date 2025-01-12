package core.java.basic;

import java.util.Iterator;

public class ListClass<E> implements Iterable<E> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return new Iterator() {

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Object next() {
				// TODO Auto-generated method stub
				return null;
			}
			
		};
	}

}
