import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent }  from './app.component';
import {RouterModule} from "@angular/router";
import {routes} from "./appRouting.routs";
import {LoginComponent} from "./login-component/login.component";
import {AddComponent} from "./add-component/add.component";
import {ShowComponent} from "./show-component/show.component";
import {RegistrationComponent} from "./registration-component/registration .component";
import {ListComponent} from "./list-component/list.component";

@NgModule({
  imports:      [
    BrowserModule,
    RouterModule.forRoot(routes)
  ],
  declarations: [
    AppComponent,
    LoginComponent,
    RegistrationComponent,
    AddComponent,
    ShowComponent,
    ListComponent
  ],
  bootstrap:    [ AppComponent ]
})
export class AppModule { }
