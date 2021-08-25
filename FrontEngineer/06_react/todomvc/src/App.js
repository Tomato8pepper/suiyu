import React, { Component } from 'react';
import './App.css';

// ({ completed: todo.isCompleted, editing:editingId === todo.id })
function convertClass(obj) {
  let classStr = '';
  for (let key in obj) {
    if (obj[key]) {
      classStr += key + ' ';
    }
  }
  return classStr;
}

class App extends Component {
  constructor() {
    super();
    //展示数据
    this.state = {
      newContent: '', //新加的任务
      todos: [
        { id: 1, isCompleted: true, content: '吃饭' },
        { id: 2, isCompleted: false, content: '睡觉' },
        { id: 3, isCompleted: true, content: '打游戏' }
      ],
      editingId: -1,  //编辑中
      leftNumber: 0,  //剩余数
      toggleAll: false,   //全选 
      showClear: true,   //清除已完成
    }
  }
  //2.渲染数组数据；
  renderList() {
    let { todos, editingId } = this.state;
    //避免null 和 undefined
    return todos.map(todo => {
      return (

        <li key={todo.id} className={convertClass({ completed: todo.isCompleted, editing: editingId === todo.id })}>
          <div className="view">
            <input className="toggle" type="checkbox" checked={todo.isCompleted}
              onChange={e => this.checkBoxHandler(e, todo)} />
            <label onClick={e => this.beginEdit(todo)}>{todo.content}</label>
            <button className="destroy" onClick={e => this.delTodo(todo)}></button>
          </div>
          <form onSubmit={e => this.editOver(e)}>
            <input className="edit"
              ref={'todo_' + todo.id}
              value={todo.content}
              onChange={e => this.saveEdit(e, todo)}
              onBlur={e => this.editOver(e)} />
          </form>
        </li>
      )
    })
  }

  //3接受输入的数据
  valueHandler(e) {
    this.setState({
      newContent: e.target.value
    })
  }

  //4.添加任务
  addTodo(e) {
    // 排除未输入的情况
    if (this.state.newContent.trim() === '') return;
    e.preventDefault();
    // { id, isCompleted, content }
    let maxId = 1;
    //4.1 计算id
    this.state.todos.forEach(todo => {
      if (todo.id > maxId) maxId = todo.id;
    })
    maxId++;
    this.state.todos.push({
      id: maxId,
      isCompleted: false,
      content: this.state.newContent,
    })
    //视图更新
    this.setState({ newContent: '' })
    // this.state.newContent = '';
    this.computedLeftCount();
    // 清空输入框

  }

  //5.删除任务
  delTodo(todo) {
    // todos是引用数据类型，赋值给的是地址，所以改的是state里面那个对象
    // num是基本数据类型 let num = this.state.num; 更改num， this.num没有改变
    let { todos } = this.state;
    //找索引，，   find函数找元素， findIndex找索引
    let index = todos.findIndex(t => t.id === todo.id)
    // 删除元素
    todos.splice(index, 1)
    //更新视图
    this.computedLeftCount();
  }

  // 6.响应式checkbox
  checkBoxHandler(e, todo) {
    // console.log(e);
    todo.isCompleted = e.target.checked;
    this.computedLeftCount();
  }

  //7.双击编辑
  beginEdit(todo) {
    this.setState({
      editingId: todo.id,
    }, () => {
      //再让react异步渲染以后的行为，类似vue中$nextTick函数
      //让编辑框获取焦点
      this.refs['todo_' + todo.id].focus();
    })

  }

  // 8.保存编辑
  saveEdit(e, todo) {
    todo.content = e.target.value;
    this.setState({})
  }

  // 9.离焦和回车的保存
  editOver(e) {
    e.preventDefault();
    this.setState({
      editingId: -1,
    })
  }

  // 计算剩余数
  computedLeftCount() {
    // 保证每次增删改后都是新的状态
    this.setState({
      showClear: false,
    })
    let num = 0;
    let toggleAllChecked = true;
    this.state.todos.forEach(todo => {
      if (!todo.isCompleted) {
        num++;
        // 根据当前状态来决定toggleAll的状态
        // 找到一个false那么toggleAll就是false
        toggleAllChecked = false
      } else {
        this.setState({
          showClear: false,
        })
      }
    });
    this.setState({
      leftNumber: num,
      toggleAll: toggleAllChecked,
    })
  }

  //组件初始化时，计算剩余数
  componentDidMount() {
    this.computedLeftCount();
  }

  //全选全不选
  changeToggleAll(e) {
    let { checked } = e.target;

    // 遍历数组
    this.state.todos.forEach(todo => {
      todo.isCompleted = checked;
    })
    this.setState({
      toggleAll: e.target.checked,
    })
  }

  //删除已完成的任务
  clearComplete() {
    let { todos } = this.state;
    // this.state.todos.forEach( (todo, index, arr) => {
    //   if(todo.isCompleted) {
    //     todos.splice(index, 1);
    //   }
    // })
    for (var i = todos.length - 1; i >= 0; i--) {
      if (todos[i].isCompleted) {
        todos.splice(i, 1)
      }
    }
    this.setState({})
  }

  render() {
    let { newContent, leftNumber, toggleAll, showClear } = this.state;
    return (
      <React.Fragment>
        <section className="todoapp">
          <header className="header">
            <h1>todos</h1>
            {/* 处理回车 */}
            <form onSubmit={e => this.addTodo(e)} >
              <input className="new-todo" placeholder="What needs to be done?"
                autoFocus value={newContent} onChange={e => this.valueHandler(e)} onBlur={e => this.addTodo(e)} />
            </form>
          </header>
          {/* This section should be hidden by default and shown when there are todos */}
          <section className="main">
            <input id="toggle-all" className="toggle-all" type="checkbox" onChange={e => this.changeToggleAll(e)} checked={toggleAll} />
            <label htmlFor="toggle-all">Mark all as complete</label>
            <ul className="todo-list">
              {/* These are here just to show the structure of the list items */}
              {/* List items should get the class `editing` when editing and `completed` when marked as completed */}
              {this.renderList()}
            </ul>
          </section>
          {/* This footer should hidden by default and shown when there are todos */}
          <footer className="footer">
            {/* This should be `0 items left` by default */}
            <span className="todo-count"><strong>{leftNumber}</strong> item left </span>
            {/* Remove this if you don't implement routing */}
            <ul className="filters">
              <li>
                <a className="selected" href="#/">All</a>
              </li>
              <li>
                <a href="#/active">Active</a>
              </li>
              <li>
                <a href="#/completed">Completed</a>
              </li>
            </ul>
            {/*Hidden if no completed items are left ↓ */}
            {/* { showClear } && <button className="clear-completed" onClick={e => this.clearComplete()}>Clear completed</button> */}
            {/* { showClear ?<button className="clear-completed" onClick={ e => this.clearComplete()}>Clear completed</button> : null } */}
            <button className="clear-completed" onClick={e => this.clearComplete()}>Clear completed</button>
          </footer>
        </section>
        <footer className="info">
          <p>Double-click to edit a todo</p>
          {/* Remove the below line ↓ */}
          <p>Template by <a href="http://sindresorhus.com">Sindre Sorhus</a></p>
          {/* Change this out with your name and url ↓ */}
          <p>Created by <a href="http://todomvc.com">you</a></p>
          <p>Part of <a href="http://todomvc.com">TodoMVC</a></p>
        </footer>
      </React.Fragment>
    )
  }
}

export default App;
