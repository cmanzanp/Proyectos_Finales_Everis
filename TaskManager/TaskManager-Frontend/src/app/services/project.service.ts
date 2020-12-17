import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProjectService {

  constructor(private http: HttpClient) { }

  createProject(p: any): Observable<any> {

    const endpoint = 'http://localhost:8080/projects';
    return this.http.post(endpoint, p);
  }

  getProjects(): Observable<any> {
    const endpoint = 'http://localhost:8080/projects';
    return this.http.get(endpoint);
  }

  getProjectById(id: any): Observable<any> {

    const endpoint = 'http://localhost:8080/projects/' + id;
    return this.http.get(endpoint);
  }

  addUser(idp: any, idu: any): Observable<any> {
    const endpoint = 'http://localhost:8080/projects/user/' + idp + '&&' + idu;
    return this.http.get(endpoint);
  }

  deleteUserFromProject(idp: any, idu: any): Observable<any> {
    const endpoint = 'http://localhost:8080/projects/user/' + idp + '&&' + idu;
    return this.http.delete(endpoint)
  }
}
