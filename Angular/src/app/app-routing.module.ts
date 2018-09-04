import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { RestaurantComponent } from './components/restaurants/restaurant/restaurant.component';
import { RestaurantDetailComponent } from './components/restaurants/restaurant-detail/restaurant-detail.component';
import { RestaurantEditComponent } from './components/restaurants/restaurant-edit/restaurant-edit.component';

const routes: Routes = [
	{ path: 'restaurants', component: RestaurantComponent },
	{ path: 'detail/:id', component: RestaurantDetailComponent },
	{ path: 'edit/:id', component: RestaurantEditComponent },
	{ path: '**', redirectTo: '' },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
