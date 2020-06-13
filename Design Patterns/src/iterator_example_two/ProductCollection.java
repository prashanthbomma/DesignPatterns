package iterator_example_two;

import java.util.ArrayList;
import java.util.List;

import iterator_example_one.BrowserHistory;
import iterator_example_one.BrowserHistory.ListIterator;

public class ProductCollection {
  private List<Product> products = new ArrayList<>();

  public void add(Product product) {
    products.add(product);
  }
  
  public Iterator createIterator(){
	  return new ListIterator(this);
  }
  
  public class ListIterator implements Iterator {
	  
	    private ProductCollection productCollection;
		private int index;
		
		public ListIterator(ProductCollection productCollection) {
			this.productCollection = productCollection;
		}

		@Override
		public boolean hasNext() {
			return (index < productCollection.products.size());
		}

		@Override
		public String current() {
			return productCollection.products.get(index).toString();
		}

		@Override
		public void next() {
			index++;
			
		}
		
  }

}
