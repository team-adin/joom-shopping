import {Routes} from "@angular/router";
import {LoginComponent} from "./login-component/login.component";
import {ShowComponent} from "./show-component/show.component";
import {RegistrationComponent} from "./registration-component/registration .component";
import {ListComponent} from "./list-component/list.component";


export const routes: Routes = [
  {
    path: 'login', component: LoginComponent
  },
  {
    path: 'registration', component: RegistrationComponent
  },
  {
    path: 'show', component: ShowComponent
  },
  { path: 'list', component: ListComponent},
  { path: '', redirectTo: 'list', pathMatch: 'full'}
];
