import { Component, OnInit } from '@angular/core';
import { UserService } from '../../services/user.service';
import { TaskService } from '../../services/task.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.css']
})
export class UsersComponent implements OnInit {

  idUserToAdd: any;
  idTaskToAdd: any;
  users: any[];
  taskName: string;
  taskDescription: string;
  daysToDelivery: string;
  constructor(private userService: UserService, private taskService: TaskService, private route: Router) { }

  ngOnInit(): void {
    this.getUsers()
  }

  getUsers(): void {
    this.userService.getUsers().subscribe(response => {
      console.log(response);
      this.users = response;
    }, error => {
      console.log(error);
    })
  }

  createTask(): void {
    const task = {

      taskName: this.taskName,
      taskDescription: this.taskDescription,
      daysToDelivery: this.daysToDelivery
    }

    this.taskService.createTask(task).subscribe(response => {
      console.log(response);
      this.idTaskToAdd = response.taskId;
      this.addTask(this.idUserToAdd, this.idTaskToAdd);

    }, error => {
      console.log(error);
    })
  }

  setIdToAdd(id: any): void {
    this.idUserToAdd = id;
  }

  addTask(idu: any, idt: any): void {
    this.userService.addTask(idu, idt).subscribe(response => {
      console.log(response);

      this.getUsers()
    }, error => {
      console.log(error);
    })
  }

  infoUser(id:any):void{
    sessionStorage.setItem('idUser',id);
    this.route.navigate(['info-user'])
  }

  infoTask(id: any): void {

    sessionStorage.setItem('idTask',id);
    this.route.navigate(['info-task'])


  }

  deleteTask(id: any): void {
    console.log("soy el metodo que borra")
    this.taskService.deleteTask(id).subscribe(response => {
      console.log(response);
      this.getUsers()

    }, error => {
      console.log(error);
    })
  }

}
