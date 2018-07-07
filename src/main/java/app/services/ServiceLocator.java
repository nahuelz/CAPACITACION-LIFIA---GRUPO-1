package app.services;

public class ServiceLocator {
	
	private static ServiceLocator instance;
	static RestaurantServiceBI restaurantService;
	
    public static ServiceLocator getInstance() {
    	if (instance == null){
    		instance = new ServiceLocator();
    	}
		return instance;
    }
    
	public static void setRestaurantService(RestaurantServiceBI restaurantService) {
		ServiceLocator.restaurantService = restaurantService;
	}
    
	public static RestaurantServiceBI getRestaurantService(){
		return restaurantService;
	}
    

}