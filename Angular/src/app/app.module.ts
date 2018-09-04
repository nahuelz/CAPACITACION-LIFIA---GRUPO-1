import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';

//Components
import { AppComponent } from './app.component';
import { RestaurantComponent } from './components/restaurants/restaurant/restaurant.component';
import { RestaurantDetailComponent } from './components/restaurants/restaurant-detail/restaurant-detail.component';
import { RestaurantEditComponent } from './components/restaurants/restaurant-edit/restaurant-edit.component';


@NgModule({
  declarations: [
    AppComponent,
    RestaurantComponent,
    RestaurantDetailComponent,
    RestaurantEditComponent,
  ],
    imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
