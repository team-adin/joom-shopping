import {Component, OnInit} from '@angular/core';
import {Router} from "@angular/router";
import {HttpService} from "./service/http-service.service";
import {ListComponent} from "./list-component/list.component";

@Component({
  selector: 'my-app',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  authenticated = false;
  sign_in = 'Вход';
  sign_up = 'Регистрация';

  static globalUrl = 'http://localhost:8090';

  isAuthenticated() {
    return this.authenticated;
  }

  login() {
    this.authenticated = true;
  }

  logout() {
    this.authenticated = false;
  }
}
