import {Routes} from "@angular/router";
import {LoginComponent} from "./login-component/login.component";
import {AppComponent} from "./app.component";
import {AddComponent} from "./add-component/add.component";
import {ShowComponent} from "./show-component/show.component";


export const routes: Routes = [
  {
    path: 'login', component: LoginComponent
  },
  {
    path: 'add', component: AddComponent
  },
  {
    path: 'show', component: ShowComponent
  },
  {
    path: '', redirectTo: 'add', pathMatch: 'full'
  }
];
