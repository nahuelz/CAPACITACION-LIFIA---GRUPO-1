import { Injectable } from '@angular/core';
import { Restaurant } from '../models/restaurant';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import {log} from 'util';

@Injectable({
  providedIn: 'root'
})
export class RestaurantService {


	constructor(private http: HttpClient) { }

	getData(){
		return this.http.get('http://localhost:8080/Spring/restaurant/');
	}

	getRestaurant(idRestaurant){
		return this.http.get('http://localhost:8080/Spring/restaurant/detailRestaurant?idRestaurant=' + idRestaurant);
	}

	getDataPost(idRestaurant, restaurant){
		const httpOptions = {
			headers: new HttpHeaders({
				'Content-Type': 'application/json'
			})
		};

		return this.http.post('http://localhost:8080/Spring/restaurant/updateRestaurant', JSON.stringify(restaurant), httpOptions );
	}
}
