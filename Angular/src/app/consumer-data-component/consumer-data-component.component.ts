import { Component, OnInit } from '@angular/core';
import { DataJsonService } from '../data-json.service';
import { ActivatedRoute } from '@angular/router';
import {log} from 'util';

@Component({
  selector: 'app-consumer-data-component',
  templateUrl: './consumer-data-component.component.html',
  styleUrls: ['./consumer-data-component.component.scss']
})
export class ConsumerDataComponentComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  	log("askjañoñuñoud");
  }

}
