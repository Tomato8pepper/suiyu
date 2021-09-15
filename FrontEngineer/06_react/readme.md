☆ react
    create-react-app myproject
    npm run start

☆ e.preventDefault();
    单击“提交”按钮，阻止其提交表单
    单击链接，防止链接跟随 URL

☆ onBlur与onFocus
    onFocus事件就是当光标落在文本框中时发生的事件。 onBlur事件是光标失去焦点时发生的事件。

☆ 回车和点击提交按钮，触发form表单的onSubmit事件

☆ Array.map(itme => { return item + 1 })   newArray
   Array.forEach( item => { xxx })
   Array.filter( item => { item + 1 })    newArray
   不同在于map返回的新数组长度不会改变的，又返回值的就给当前的item赋值为返回值，没有返回的会给undefine。而filter会过滤掉没返回值得item，返回一个在回调函数里面返回了的所有item组成的新数组。