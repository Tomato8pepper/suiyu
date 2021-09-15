import './App.css';
import {React, createRef, useState} from 'react'
import Comp from './component'

function App() {
  const todoList = [
    {
      text: 'eat',
      done: false
    },
    {
      text: 'sleep',
      done: false
    }
  ]
  //    响应式数据:arr  操作数据fun
  const [ todos, setTodos ] = useState(todoList)
  // console.log('todos', todos);
  // console.log('sett', setTodos);
  // const arr = [1, 2, 3];
  const ref = createRef();
  function handleClick () {
    // ref.current DOM节点
    let val = ref.current.value;
    console.log(ref);
    const newtodo = todos.concat({text: val, done: false})
    setTodos(newtodo)
  }
  function delItem (i) {
    let newTodos = todos.slice(0);
    newTodos.splice(i, 1);
    setTodos(newTodos);
  }
  return (
    <div>
      <Comp name="xiaoming" age={todos[0].text} onMessage={ (msg) => {console.log('fu', msg);} }></Comp>
      <input type='text' ref={ref}></input>
      <button onClick={handleClick} ref={ (e) =>{
        let value = todos[0].text;
        e.innerHTML = value
      } }>添加代办事件</button>
      {
        todos.map((item, i, arr) => {
          // console.log('map-item', item);
          // console.log('map-i', i);
          // console.log('map-arr', arr);
          return <li key={i} onClick={ (i) => {delItem(i) }}> {item.text} </li>
        })
      }
        {/* <React.Fragment> */}
          {/* <></> */}
          {/* {'block输出'} */}
        {/* </React.Fragment> */}
        {/* { arr}
        { 1 ? 2 : 3}
        { console.log('--', 4)} */}
    </div>
  );
}



export default App;
