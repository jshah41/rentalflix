
package io.egen.rentalflix;


public class Main {
	
	public static void main(String args[])
	{
		
		MovieService ms=new MovieService();
		
		
		ms.create(new Movie(1, "Rudraksh", 2000, "Hindi"));
		ms.create(new Movie(2, "Kungfu Panda", 1993, "English"));
		ms.create(new Movie(3, "OM", 1973, "English"));
		ms.create(new Movie(4, "Khuda gawah", 1983, "English"));
		ms.create(new Movie(5, "FALTU", 1973, "English"));
		ms.create(new Movie(6, "Dhoond", 1983, "English"));
		ms.findAll();
		ms.findByName("Kung");
        
		ms.update(new Movie(2, "Kungfu panda", 1994, "English"));
		ms.delete(1);
		
        ms.rentMovie(1, "jitesh");
        ms.rentMovie(1, "jenish");
	}

}
