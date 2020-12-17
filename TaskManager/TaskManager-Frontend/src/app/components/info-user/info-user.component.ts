import { Component, OnInit } from '@angular/core';
import { UserService } from '../../services/user.service';

@Component({
  selector: 'app-info-user',
  templateUrl: './info-user.component.html',
  styleUrls: ['./info-user.component.css']
})
export class InfoUserComponent implements OnInit {

  user: any;
  constructor(private userService: UserService) { }

  ngOnInit(): void {
    this.getUserById();
  }

  getUserById(){
    this.userService.getUserById(sessionStorage.getItem('idUser')).subscribe(response => {
      console.log(response);
      this.user = response;
    }, error => {
      console.log(error);
    })
  }

}
