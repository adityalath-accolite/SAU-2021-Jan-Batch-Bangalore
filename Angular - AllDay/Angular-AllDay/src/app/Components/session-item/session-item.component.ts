import { Component, OnInit ,Input , EventEmitter, Output } from '@angular/core';
import { Session } from '../../Model/Session';
@Component({
  selector: 'app-session-item',
  templateUrl: './session-item.component.html',
  styleUrls: ['./session-item.component.scss']
})
export class SessionItemComponent implements OnInit {
  @Input() session:Session = new Session();
  @Input() a:number = 0;
  @Input() b:number = 0;
  @Output() emitter: EventEmitter<Session> = new EventEmitter();
  constructor() 
  {  }

  ngOnInit(): void {
    console.log(this.session);
  }

  deleteFunc(session:Session)
  {
    this.emitter.emit(session);   
    console.log(session); 
  }

  editFunc(session:Session)
  {
    this.a = session.sessionId;
    console.log(this.a);
  }

  detailFunc(session:Session)
  {
    this.a = session.sessionId;
    console.log(this.a);
  }
}
