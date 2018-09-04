import { Component, OnInit } from '@angular/core';
import { RestaurantService } from '../../../services/restaurant.service';
import { ActivatedRoute } from '@angular/router';
import {log} from 'util';

@Component({
  selector: 'app-restaurant',
  templateUrl: './restaurant.component.html',
  styleUrls: ['./restaurant.component.scss']
})
export class RestaurantComponent implements OnInit {
	pageGet: Object;
	restaurants: Object;

  constructor(private dataService: RestaurantService, private route: ActivatedRoute) {
  	this.route.params.subscribe(params => this.pageGet = params.id);
	}
  
  ngOnInit() {
  	this.dataService.getData().subscribe(data => this.restaurants = data);
 
	}
}
