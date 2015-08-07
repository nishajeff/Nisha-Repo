
public class BookDB {
        public static Book getBook(String code){
        	Book b=new Book();
        	b.setCode(code);
        	if(code.equalsIgnoreCase("java")){
        		b.setTitle("Java");
        		b.setAuthor("Oracle");
        		b.setDescript("Programming Guide");
        		b.setPrice(100.0);
        		b.setStock(true);        		
        	}
        	else if(code.equalsIgnoreCase("hpr")){
        		b.setTitle("Harry Potter");
        		b.setAuthor("J K Rowling");
        		b.setDescript("Fiction");
        		b.setPrice(50.0);
        		b.setStock(true);        		
        	}
        	else if(code.equalsIgnoreCase("diction")){
        		b.setTitle("Dictionary");
        		b.setAuthor("Oxford");
        		b.setDescript("English Language");
        		b.setPrice(20.0);
        		b.setStock(false);        		
        	}
        	else{
        		b.setTitle("unknown");
        		b.setAuthor("unknown");
        		b.setDescript("unknown");
        		b.setPrice(0.0);
        		b.setStock(false);        		
        	}
        	return b;
        }
        
}
