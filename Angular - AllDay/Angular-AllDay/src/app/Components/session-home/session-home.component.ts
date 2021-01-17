import { Component, OnInit } from '@angular/core';
import { Session } from '../../Model/Session';
import { DataService } from '../../Services/data.service';
@Component({
  selector: 'app-session-home',
  templateUrl: './session-home.component.html',
  styleUrls: ['./session-home.component.scss']
})
export class SessionHomeComponent implements OnInit {
  sessions:Session[] =[];

  constructor(private data:DataService) { 
    this.sessions = this.data.getData();
  }

  ngOnInit() {
    console.log(this.sessions.length);
  }

  onEmmit(session:Session)
  {
    this.sessions = this.sessions.filter(t => t.sessionId != session.sessionId);
  }

  addsession(session:Session)
  {
    this.sessions.push(session);
  }

}
