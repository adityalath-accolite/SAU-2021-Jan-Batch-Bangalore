import { Component, OnInit, Input } from '@angular/core';
import { DataService } from '../../Services/data.service';
import { Session } from '../../Model/Session';
@Component({
  selector: 'app-desc ',
  templateUrl: './desc.component.html',
  styleUrls: ['./desc.component.scss']
})
export class DescComponent implements OnInit {
  @Input() a:number = 0;
  constructor(private data:DataService) {
    
  }
  
  mail:string = "";
  skype:string = "";
  date:string = "";
  title:string = "";
  name:string = "";
  lastdate:string = "";
  timing:string = "";
  
  ngOnInit(): void {
    this.data.getData().forEach(element=>
      {
        if(element.sessionId == this.a)
        {
          this.date = element.date;
          this.title = element.title;
          this.name = element.trainerName;
          this.lastdate = element.submissionDate;
          this.timing = element.timing;
          this.skype = (element.skype == null?"Not Available":element.skype);
          this.mail = (element.email == null?"Not Available":element.email);
        }
        console.log(this.a + " " + element.sessionId);
      })
  }



}
