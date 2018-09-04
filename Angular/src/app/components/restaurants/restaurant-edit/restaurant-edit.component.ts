import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import {log} from 'util';
import { RestaurantService } from '../../../services/restaurant.service';

@Component({
  selector: 'app-restaurant-edit',
  templateUrl: './restaurant-edit.component.html',
  styleUrls: ['./restaurant-edit.component.scss']
})
export class RestaurantEditComponent implements OnInit {

	id: Object;
	restaurantEdit: Object;
 
	constructor(private dataService: RestaurantService, private route: ActivatedRoute) {
  		this.route.params.subscribe(params => this.id = params.id);
	}

	ngOnInit() {
		this.dataService.getRestaurant(this.id).subscribe( data => this.setRestaurant(data));
		
	}

	setRestaurant(data){
		this.restaurantEdit=data;
	}

	getDataPost(){
		this.dataService.getDataPost(this.id, this.restaurantEdit).subscribe( data => log("exito"), error => log("error"));
	}

}
