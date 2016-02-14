
package io.egen.rentalflix;

import java.util.*;

public class MovieService implements IFlix {
	
	List<Movie> movies= new ArrayList<Movie>();
	
	public List<Movie> findAll ()
	{
		ListIterator<Movie> litr=movies.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next().getTitle());
		}
		return movies;
		

	}
	
	public List<Movie> findByName (String name)
	{
		for(Movie miv: movies)
		{
			if(miv.getTitle().contains(name))
			{
				System.out.println(miv.getTitle());
			}
		}
		return null;
	}
	
	
	public Movie create (Movie movie)
	{
		movies.add(movie);
		//System.out.println("New movie is created");
		return null;
	 
	}
	
	public Movie update (Movie movie)
	{
		int f=0;
	
		for(Movie miv: movies)
		{ 
			
			if(miv.getId()==movie.getId())
			{
				miv.setLanguage(movie.getLanguage());
                miv.setTitle(movie.getTitle());
                miv.setYear(movie.getYear());
                f=1;
                
			}
			
			
		}
		if(f==0) System.err.println("Illegal");
		
		
		return null;
	}
	
	public Movie delete (int id)
	{
		for(int i=0; i<movies.size(); i++)
		{
			if(movies.get(i).getId()==id)
			{
				movies.remove(i);
				System.out.println("deleted");
			}
		}
		return null;
	}
	
	HashMap<Integer,String> map=new HashMap<Integer, String>();
	
	public boolean rentMovie (int movieId, String user)
	{
		
		
		if(map.containsKey(movieId))
		{
			System.out.println("The movie is already rented");
			return true;
		}
		else{
			map.put(movieId, user);
			System.out.println("Movie rented to " + user);
		}
		
		return false;
	}
	
	

}
