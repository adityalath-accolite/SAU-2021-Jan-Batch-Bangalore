import React, { Component } from 'react'

export class Item extends Component {
    
    styling = () => {
        return {
            background: '#dfff80',
            padding: '10px',
            borderBottom: '1px #ccc dotted',
            display: 'flex',
            flexDirection: 'row'
        }
    }
    
    render() {
        return (
            <div style={this.styling()}>
                <span style={{textDecoration: this.props.todo.completed ? 'line-through' : 'none',flex:1}}>{this.props.todo.text}</span>
                <button style={{background: 'green', color: 'white'}} onClick={this.props.taskCompleted.bind(this,this.props.todo.id,1)}>Delete</button>
                <button style={{background: 'green', color: 'white'}} onClick={this.props.taskCompleted.bind(this,this.props.todo.id,2)}>Completed</button>
            </div>

        )
    }
}

export default Item
