import { Component } from '@angular/core';

@Component({
  selector: 'my-app',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent  {
  authenticated = false;
  sign_in = 'Вход';
  sign_up = 'Регистрация';
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
