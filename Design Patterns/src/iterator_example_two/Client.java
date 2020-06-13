package iterator_example_two;

public class Client {

	public static void main(String[] args) {
		ProductCollection productCollection= new ProductCollection();
		productCollection.add(new Product(1, "iPhone 7"));
		productCollection.add(new Product(2, "OnePlus 5"));
		productCollection.add(new Product(2, "Pixel 3"));
		Iterator iterator = productCollection.createIterator();
		while(iterator.hasNext()) {
			String prodString = iterator.current();
			System.out.println(prodString);
			iterator.next();
		}
	}

}
