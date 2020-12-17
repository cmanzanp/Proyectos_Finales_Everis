import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { WelcomeComponent } from './components/welcome/welcome.component';
import { ManagmentComponent } from './components/managment/managment.component';
import { UsersComponent } from './components/users/users.component';
import { ProjectsComponent } from './components/projects/projects.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { InfoProjectComponent } from './components/info-project/info-project.component';
import { InfoTaskComponent } from './components/info-task/info-task.component';
import { InfoUserComponent } from './components/info-user/info-user.component';

@NgModule({
  declarations: [
    AppComponent,
    WelcomeComponent,
    ManagmentComponent,
    UsersComponent,
    ProjectsComponent,
    InfoProjectComponent,
    InfoTaskComponent,
    InfoUserComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    AppRoutingModule,
    RouterModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
