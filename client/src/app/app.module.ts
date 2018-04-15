import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent }  from './app.component';
import {RouterModule} from "@angular/router";
import {routes} from "./appRouting.routs";
import {LoginComponent} from "./login-component/login.component";
import {ShowComponent} from "./show-component/show.component";
import {RegistrationComponent} from "./registration-component/registration .component";
import {ListComponent} from "./list-component/list.component";
import {HttpModule} from "@angular/http";
import {HttpService} from "./service/http-service.service";

@NgModule({
  imports:      [
    BrowserModule,
    RouterModule.forRoot(routes),
    HttpModule,
  ],
  declarations: [
    AppComponent,
    LoginComponent,
    RegistrationComponent,
    ShowComponent,
    ListComponent
  ],
  bootstrap:    [ AppComponent ],
  providers: [HttpService]
})
export class AppModule { }
