import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { SessionHomeComponent } from './Components/session-home/session-home.component';
import { TodoComponent } from './Components/todo/todo.component';

const routes: Routes = [
  {path: '' , component: SessionHomeComponent },
  {path: 'todo' , component: TodoComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
