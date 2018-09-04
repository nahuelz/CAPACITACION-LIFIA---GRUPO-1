import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import {log} from 'util';
import { RestaurantService } from '../../../services/restaurant.service';

@Component({
  selector: 'app-restaurant-detail',
  templateUrl: './restaurant-detail.component.html',
  styleUrls: ['./restaurant-detail.component.scss']
})
export class RestaurantDetailComponent implements OnInit {

	id: Object;
	restaurant: Object;
 
	constructor(private dataService: RestaurantService, private route: ActivatedRoute) {
  		this.route.params.subscribe(params => this.id = params.id);
	}

	ngOnInit() {
		this.dataService.getRestaurant(this.id).subscribe(data => this.restaurant = data);
	}

}
