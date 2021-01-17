import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'; 
import { Todo } from '../Model/Todo';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class TodoService {
  url:string = 'http://jsonplaceholder.typicode.com/todos';
  todosLimit = '?_limit=20';
  
  constructor(private http:HttpClient) { }
  
  getTodo():Observable<Todo[]>
  {
    return this.http.get<Todo[]>(`${this.url}${this.todosLimit}`);
  }
}
