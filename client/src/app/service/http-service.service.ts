import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs/Observable";
import {ShopItem} from "../data/shop-item";

@Injectable()
export class HttpService {

  constructor(private http: HttpClient) {}

  public getItems(url: string): Observable<ShopItem[]> {
    return this.http.get<ShopItem[]>(url);
  }

}
