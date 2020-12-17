import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ProjectService } from '../../services/project.service';
import { UserService } from '../../services/user.service';

@Component({
  selector: 'app-projects',
  templateUrl: './projects.component.html',
  styleUrls: ['./projects.component.css']
})
export class ProjectsComponent implements OnInit {

  idUser: any;
  idProject: any;
  projects: any[];
  users: any[];
  constructor(private projectService: ProjectService, private userService: UserService, private route: Router) { }


  ngOnInit(): void {
    this.getProjects();
    this.getUsers();
  }

  infoProject(id){
    sessionStorage.setItem('projectId',id);
    this.route.navigate(['info-project'])

  }

  getProjects() {
    this.projectService.getProjects().subscribe(response => {
      console.log(response);
      this.projects = response;
    }, error => {
      console.log(error);
    })
  }

  getUsers() {
    this.userService.getUsers().subscribe(response => {
      console.log(response);
      this.users = response;
    }, error => {
      console.log(error);
    })
  }

  setIdProject(id: any) {
    this.idProject = id;
  }
  addUser(id: any) {
    this.idUser = id;

    this.projectService.addUser(this.idProject, this.idUser).subscribe(response => {
      console.log(response);
      this.getProjects();
      this.getUsers();
    }, error => {
      console.log(error);
    })
  }

  deleteUserFromProject(idp: any, idu: any): void {

    this.projectService.deleteUserFromProject(idp, idu).subscribe(response => {

      console.log(response);
      this.getProjects();
      this.getUsers();
    }, error => {
      console.log(error);
    })
  }

}
