import { Component, OnInit, Output, EventEmitter } from '@angular/core';
import { Session } from '../../Model/Session';
@Component({
  selector: 'app-add-session',
  templateUrl: './add-session.component.html',
  styleUrls: ['./add-session.component.scss']
})
export class AddSessionComponent implements OnInit {
  @Output() event:EventEmitter<Session> = new EventEmitter();
  
  newSession:Session = new Session();
  
  id:number = 0;
  date:string = "";
  title:string = "";
  name:string = "";
  lastdate:string = "";
  skype:string = '';
  mail:string='';
  timing:string = "";
  
  constructor() { }
  
  ngOnInit(): void {
    
  }

  onsubmit()
  {
    this.newSession = {
      sessionId: this.id,
      date: this.date,
      title: this.title,
      trainerName: this.name,
      submissionDate: this.lastdate,
      timing: this.timing
    };
    
    if(this.skype != '')
    {
      this.newSession.skype=this.skype;
    }
    
    if(this.mail != '')
    {
      this.newSession.email=this.mail;
    }
    console.log(this.newSession);
    this.event.emit(this.newSession);
  }

}
