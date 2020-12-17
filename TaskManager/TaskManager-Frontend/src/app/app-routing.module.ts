import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { WelcomeComponent } from './components/welcome/welcome.component';
import { ManagmentComponent } from './components/managment/managment.component';
import { UsersComponent } from './components/users/users.component';
import { ProjectsComponent } from './components/projects/projects.component';
import { InfoProjectComponent } from './components/info-project/info-project.component';
import { InfoTaskComponent } from './components/info-task/info-task.component';
import { InfoUserComponent } from './components/info-user/info-user.component';

const routes: Routes = [
  {
    path: '',
    component: WelcomeComponent
  },
  {
    path: 'managment',
    component: ManagmentComponent
  },
  {
    path: 'users',
    component: UsersComponent
  },
  {
    path: 'projects',
    component: ProjectsComponent
  },
  {
    path: 'info-project',
    component: InfoProjectComponent
  },
  {
    path: 'info-task',
    component: InfoTaskComponent
  },
  {
    path: 'info-user',
    component: InfoUserComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
