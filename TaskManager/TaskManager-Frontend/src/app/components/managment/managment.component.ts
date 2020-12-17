import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserService } from '../../services/user.service';
import { ProjectService } from '../../services/project.service';

@Component({
  selector: 'app-managment',
  templateUrl: './managment.component.html',
  styleUrls: ['./managment.component.css']
})
export class ManagmentComponent implements OnInit {

  constructor(private userService: UserService, private route: Router, private projectService: ProjectService) { }

  username: string;
  usersurname: string;
  userage: string;

  projectname: string;
  projectdescription: string;

  ngOnInit(): void {
  }

  createUser(): void {

    const user = {
      userName: this.username,
      userSurname: this.usersurname,
      userAge: this.userage
    }

    this.userService.createUser(user).subscribe(response => {
      console.log(response);
      this.route.navigate(['users'])
    }, error => {
      console.log(error);
    })

  }

  createProject(): void {
    const project = {
      projectName: this.projectname,
      projectDescription: this.projectdescription
    }

    this.projectService.createProject(project).subscribe(response => {
      console.log(response);
      this.route.navigate(['projects'])
    }, error => {
      console.log(error);
    })

  }

}
