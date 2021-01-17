import { Injectable } from '@angular/core';
import { Session } from '../Model/Session';
@Injectable({
  providedIn: 'root'
})
export class DataService {

  constructor() { }

  getData()
  {
    return this.arr;
  }

  arr:Session[] = [
    {
      sessionId:1,
      date:"06-01-2021",
      title:"Version Control System (VCS), GIT",
      trainerName:"Devansh Sharma",
      submissionDate:"08-01-2021",
      skype:"dev08.sha12",
      email:"devansh.sharma@accolitedigital.com",
      timing:"Afternoon"
    },
    {
      sessionId:2,
      date:"07-01-2021",
      title:"RDBMS Concepts",
      trainerName:"Sivagami",
      submissionDate:"08-01-2021",
      email:"tinksiva@gmail.com",
      timing:"Morning"
    },
    {
      sessionId:3,
      date:"07-01-2021",
      title:"SQL Concepts & Fundamentals ",
      trainerName:"Sivagami",
      submissionDate:"11-01-2021",
      email:"tinksiva@gmail.com",
      timing:"Afternoon"
    },
    {
      sessionId:4,
      date:"08-01-2021",
      title:"NoSQL Basics/Fundamentals ",
      trainerName:"Abhisek Nandan",
      submissionDate:"13-01-2021",
      timing:"Morning"
    },
    {
      sessionId:5,
      date:"08-01-2021",
      title:"HTML5, CSS3",
      trainerName:"Vighneshwar",
      submissionDate:"13-01-2021",
      skype:"live:.cid.d1568a79562731eb",
      timing:"Afternoon"
    },
    {
      sessionId:6,
      date:"11-01-2021",
      title:"Javascript-1",
      trainerName:"Anushree",
      submissionDate:"12-01-2021",
      skype:"live:d26e8b923e8bfe9d",
      timing:"Morning"
    },
    {
      sessionId:7,
      date:"12-01-2021",
      title:"Javascript-2",
      trainerName:"Pranoy Ghosh",
      submissionDate:"15-01-2021",
      timing:"Afternoon"
    },
    {
      sessionId:8,
      date:"13-01-2021",
      title:"Angular",
      trainerName:"Sharanya Mahesheka & Pritam",
      submissionDate:"17-01-2021",
      skype:"sharanya.mahesheka",
      email:"pritam111991@gmail.com",
      timing:"All-day"
    },
    {
      sessionId:9,
      date:"13-01-2021",
      title:"React",
      trainerName:"Vighneshwar & Raviteja",
      submissionDate:"18-01-2021",
      skype:"live:.cid.d1568a79562731eb & live:89cee814cdc548b6",
      timing:"All-day"
    },
    {
      sessionId:10,
      date:"13-01-2021",
      title:"React native",
      trainerName:"Tajammul Pasha",
      submissionDate:"21-01-2021",
      skype:"tajammul.pasha3",
      timing:"All-day"
    }
  ]

}
