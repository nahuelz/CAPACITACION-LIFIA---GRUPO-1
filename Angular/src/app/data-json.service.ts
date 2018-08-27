import { Injectable } from '@angular/core';
import {HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class DataJsonService {

	constructor(private http: HttpClient) { }

	getData(){
		return this.http.get('http://localhost:8080/Spring/restaurant/detailRestaurant?idRestaurant=5');
	}
	
}

