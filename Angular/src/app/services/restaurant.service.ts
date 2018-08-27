import { Injectable } from '@angular/core';
import { Restaurant } from '../models/restaurant';
import {HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class RestaurantService {


	restaurants: Restaurant[] = [
	{
	    id: 1,
	    name: 'Restaurant 1',
	    description: 'A description',
	    category: 'A category'
	},
	{
    	id: 2,
    	name: 'Restaurant 2',
    	description: 'A description 2',
    	category: 'A category 2'
  	}
];

	constructor(private http: HttpClient) { }

	getData(){
		return this.http.get('http://localhost:8080/Spring/restaurant/');
	}
	
	getRestaurants()
	{
		this.restaurants
	}

	insertRestaurant(restaurant: Restaurant)
	{
		this.restaurants.push({
			id: restaurant.id,
			name: restaurant.name,
			description: restaurant.description,
			category: restaurant.category
		});
	}
}
