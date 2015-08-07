
public class Book {
	 private String title;
	 private String author;
	 private String descript;
	 private boolean isInStock;
	 private double price;
	 private String bookCode;
	 
	 public Book(){
		 this.title=null;
		 this.author=null;
		 this.descript=null;
		 this.isInStock=false;
		 this.price=0.0;
		 this.bookCode=null;
		 
	 }
	 
	 public Book(String title,String author,String descript,boolean isInStock,double price, String code){
		 this.title=title;
		 this.author=author;
		 this.descript=descript;
		 this.isInStock=isInStock;
		 this.price=price;
		 this.bookCode=code;
		 
	 }
	 
	 public String  getTitle(){
		 return title;
	 }
	 public String  getAuthor(){
		 return author;
	 }
	 public String  getDescript(){
		 return descript;
	 }
	 public boolean isInstock(){
		  return isInStock;
	 }
	 public double getPrice(){
		 return price;
	 }
	 public String getCode(){
		 return bookCode;
	 }
	 public void setTitle(String title){
		 this.title=title;
	 }

	 public void setAuthor(String author){
		 this.author=author;
	 }
	 public void setDescript(String descript){
		 this.descript=descript;
	 }
	 public void setPrice(double price){
		 this.price=price;
	 }
	 public void setCode(String code){
		 this.bookCode=code;
	 }
	 public void setStock(boolean stock){
		 this.isInStock=stock;
	 }
	 
	 
    public double GetPriceForRequestedBooks(int num){
    	double total=0.0;
    	if(isInStock){
    		total=price*num;
    		return total;
    	}
    	else{
    		System.out.println("Not In Stock");
    		return 0.0;
    	}
    }
   
}
