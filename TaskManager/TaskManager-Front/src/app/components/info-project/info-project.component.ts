import { Component, OnInit } from '@angular/core';
import { ProjectService } from '../../services/project.service';

@Component({
  selector: 'app-info-project',
  templateUrl: './info-project.component.html',
  styleUrls: ['./info-project.component.css']
})
export class InfoProjectComponent implements OnInit {

  constructor(private projectService: ProjectService) { }

  project: any;
  ngOnInit(): void {
    this.getProjectById();
  }

  getProjectById() {
    this.projectService.getProjectById(sessionStorage.getItem('projectId')).subscribe(response => {
      console.log(response);
      this.project = response;
    }, error => {
      console.log(error);
    })
  }

}
