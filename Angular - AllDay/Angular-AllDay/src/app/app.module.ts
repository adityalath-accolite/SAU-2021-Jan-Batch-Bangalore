import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SessionHomeComponent } from './Components/session-home/session-home.component';
import { SessionItemComponent } from './Components/session-item/session-item.component';
import { DescComponent } from './Components/desc/desc.component';
import { HeaderComponent } from './Components/header/header.component';
import { TodoComponent } from './Components/todo/todo.component';
import { TodoItemComponent } from './Components/todo-item/todo-item.component';
import { HttpClientModule } from '@angular/common/http';
import { AddSessionComponent } from './Components/add-session/add-session.component';

@NgModule({
  declarations: [
    AppComponent,
    SessionHomeComponent,
    SessionItemComponent,
    DescComponent,
    HeaderComponent,
    TodoComponent,
    TodoItemComponent,
    AddSessionComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
