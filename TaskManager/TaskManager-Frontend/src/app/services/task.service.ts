import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TaskService {

  constructor(private http: HttpClient) { }

  createTask(t: any): Observable<any> {
    const endpoint = 'http://localhost:8080/tasks';
    return this.http.post(endpoint, t);
  }

  getTaskById(id: any): Observable<any> {
    const endpoint = 'http://localhost:8080/tasks/' + id;
    return this.http.get(endpoint);
  }
  deleteTask(id: any): Observable<any> {
    const endpoint = 'http://localhost:8080/tasks/' + id;
    return this.http.delete(endpoint);
  }
}
