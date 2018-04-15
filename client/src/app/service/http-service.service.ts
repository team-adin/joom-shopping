import {Injectable} from "@angular/core";
import {HttpClient, HttpParams} from "@angular/common/http";
import {Observable} from "rxjs/Observable";
import {ShopItem} from "../data/shop-item";
import {Subscribe, SubscribeWithName} from "../data/subscribe";

@Injectable()
export class HttpService {

  constructor(private http: HttpClient) {}

  public getItems(url: string): Observable<ShopItem[]> {
    return this.http.get<ShopItem[]>(url);
  }

  public getSubscribes(url: string): Observable<SubscribeWithName[]> {
    return this.http.get<SubscribeWithName[]>(url);
  }

  public deleteUnsubscribe(url: string, userInfoId: string, shopItemId: string): Observable<any> {
    const params = new HttpParams().set('userInfoId', userInfoId).append('shopItemId', shopItemId);
    return this.http.delete(url, {params});
  }

  public postSubscribe(url: string, subscribe: Subscribe): Observable<any> {
    return this.http.post(url, {subscribe});
  }

}
