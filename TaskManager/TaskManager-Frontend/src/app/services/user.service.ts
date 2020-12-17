import { HttpClient } from '@angular/common/http';
import { identifierModuleUrl } from '@angular/compiler';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http: HttpClient) { }

  createUser(u: any): Observable<any> {
    const endpoint = 'http://localhost:8080/users';
    return this.http.post(endpoint, u);
  }

  getUsers(): Observable<any> {
    const endpoint = 'http://localhost:8080/users';
    return this.http.get(endpoint);
  }

  getUserById(id: any): Observable<any> {

    const endpoint = 'http://localhost:8080/users/'+id;
    return this.http.get(endpoint);

  }

  addTask(idu: any, idt: any): Observable<any> {
    const endpoint = 'http://localhost:8080/users/task/' + idu + '&&' + idt;

    return this.http.get(endpoint);
  }
}
