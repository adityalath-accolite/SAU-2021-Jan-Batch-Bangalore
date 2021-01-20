import React, { Component } from 'react'
import Item from './Item';
export class App extends Component {

  taskCompleted = (id,definer) => {
    console.log(id);
    var arr = [...this.state.todos];
    var obj = {};
    var ind = -1;
    arr.forEach((todo, i) => {
      if (todo.id === id) {
        obj = todo;
        obj.completed = !obj.completed;
        ind = i;
      }
    })
    for (let i = ind; i < arr.length - 1; i++) {
      arr[i] = arr[i + 1]
    }
    if(definer === 1){
      arr.length--;
    }
    else{
      arr[arr.length - 1] = obj;
    }
    this.setState({ todos: arr });
  }

  state = {
    idDistributor: 0,
    todos: [],
    toadd:{}
  }

  takeInput = (e)=>{
    this.setState( {toadd: {
        id: this.state.idDistributor,
        text: e.target.value,
        completed: false
      },
      idDistributor: this.state.idDistributor+1
    } )
    console.log("Entered text is : "+this.state.toadd.text);
  }

  adder = ()=>{
    if(this.state.toadd.text !== '')
    {
      this.setState( {todos: [this.state.toadd,...this.state.todos]} );
      this.setState( {toadd: {text: ''}} )
    }
  }

  render() {
    console.log(this.state.todos)
    return (
      <div style={styling}>
        <h1 style={styling2}>Welcome Pal, Let's plan your day</h1>
        <div style={styling3}>
          <input style={styling4} type="text" placeholder="Add a task..." value={this.state.toadd.text} onChange={this.takeInput}/>
          <button style={styling5} onClick={this.adder}>Add</button>
        </div>
        <div>{this.state.todos.map(todo=>
          (
            <Item todo={todo} taskCompleted={this.taskCompleted}/>
          ))}
        </div>
      </div>
    )
  }
}

const styling = {
  right: '20%',
  left: '20%',
  position: 'absolute',
  background: 'lightgreen',
  height: '100%'
}

const styling2 = {
  textAlign: 'center'
}

const styling3 = {
  textAlign: 'center',
  display: 'flex',
  flexDirection: 'row',
  padding: '10px'
}

const styling4 = {
  flex: 50,
  height: '30px',
  background: '#ecffb3'
}

const styling5 = {
  flex: 10,
  height: '35px',
  background: '#ecffb3'
}


export default App
