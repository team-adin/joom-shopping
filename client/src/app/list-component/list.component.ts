import {Component, OnInit} from "@angular/core";
import {ShopItem} from "../data/shop-item";
import {HttpService} from "../service/http-service.service";

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
    this.http.getItems(this.url + this.urlAll).subscribe(items => this.items = items);
  }

  submit() {

  }

}
