import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(private http: HttpClient) { }

  endPoint: string = 'http://localhost:8080/everis/tattoo/';

  getAllProducts(): Observable<any>{
    return this.http.get(this.endPoint);
  }

  getProduct(id: string): Observable<any> {
    return this.http.get(this.endPoint + id);
  }

  addProduct(product: Object): void {
    this.http.post(this.endPoint, product)
      .subscribe(
        () => {window.location.reload()},
        error => {console.log(error)});
  }

  deleteProduct(id: string): void {
    this.http.delete(this.endPoint + id)
      .subscribe(
        () => {window.location.reload()},
        error => {console.log(error)});
  }

}

