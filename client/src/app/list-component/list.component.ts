import {Component, OnInit} from "@angular/core";
import {ShopItem} from "../data/shop-item";
import {HttpService} from "../service/http-service.service";
import {AppComponent} from "../app.component";

@Component({
  selector: 'list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {

  url = "/api/items";
  urlAll = "/all"
  items: ShopItem[] = [];

  constructor(private http: HttpService) {}

  ngOnInit() {
    this.http.getItems(AppComponent.globalUrl + this.url + this.urlAll).subscribe(data => this.items = data);
  }

}
