import { Component, OnInit } from '@angular/core';
import { TaskService } from '../../services/task.service';

@Component({
  selector: 'app-info-task',
  templateUrl: './info-task.component.html',
  styleUrls: ['./info-task.component.css']
})
export class InfoTaskComponent implements OnInit {

  task: any;
  constructor(private taskService: TaskService) { }

  ngOnInit(): void {
    this.getTaskById();
  }

  getTaskById() {
    this.taskService.getTaskById(sessionStorage.getItem('idTask')).subscribe(response => {
      console.log(response);
      this.task = response;
    }, error => {
      console.log(error);
    })
  }

}
