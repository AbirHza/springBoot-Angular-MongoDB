import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {RoleComponent} from "./role/role.component";
import {UserComponent} from "./user/user.component";

const routes: Routes = [
  { path : "roles", component : RoleComponent},
  { path : "users", component : UserComponent},
  { path: '' ,redirectTo: '/users', pathMatch:'full' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
