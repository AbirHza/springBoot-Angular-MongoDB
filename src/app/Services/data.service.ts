import {Inject, Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class DataService {

  constructor(@Inject(String) private APIUrl : string, private  http : HttpClient) { }

  //GET METHOD
  getAll() : Observable<any>{
    return this.http.get<any>(this.APIUrl);
  }

  // GET WITH ID
  get(id: any) : Observable<any> {
    return this.http.get(`${this.APIUrl}/${id}`);
  }

  //UPDATE METHOD

  Update(data: any): Observable<any> {
    return this.http.put(`${this.APIUrl}`, data);
  }

  Create(data:any) : Observable<any> {
    return this.http.post(this.APIUrl, data);
  }

  //DELETE METHOD
  Delete(id: any): Observable<any>{
    return this.http.delete(`${this.APIUrl}/${id}`);
  }
}
