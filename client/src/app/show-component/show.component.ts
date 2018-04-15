import {Component, OnInit} from "@angular/core";
import {SubscribeWithName} from "../data/subscribe";
import {HttpService} from "../service/http-service.service";

@Component({
  selector: 'show',
  templateUrl: './show.component.html',
  styleUrls: ['./show.component.css']
})
export class ShowComponent implements OnInit {
  subscribes: SubscribeWithName[] = [];
  url: string = '/api/subscribes/get/101';
  ngOnInit() {
    this.http.getSubscribes(this.url).subscribe(data => this.subscribes == data);
  }
  constructor(private http:HttpService) {

  }
}
