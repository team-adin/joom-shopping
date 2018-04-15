import {Component, OnInit} from "@angular/core";
import {ShopItem} from "../data/shop-item";

@Component({
  selector: 'list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {

  items: ShopItem[] = [];

  ngOnInit() {
  }

  submit() {

  }

}
