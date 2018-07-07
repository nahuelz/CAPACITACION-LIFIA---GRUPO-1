package app.repositories;

public class RepositoryLocator {

	static RestaurantRepositoryBI restaurantRepository;

	private static RepositoryLocator instance;
	
    public static RepositoryLocator getInstance() {
    	if (instance == null){
    		instance = new RepositoryLocator();
    	}
		return instance;
    }
    
    public static void setRestaurantRepository(RestaurantRepositoryBI repository){
    	restaurantRepository = repository;
    }
    
    public static RestaurantRepositoryBI getRestaurantRepository(){
    	return restaurantRepository;
    }

}
