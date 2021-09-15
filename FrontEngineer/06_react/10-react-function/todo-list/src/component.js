import { useEffect } from 'react'
// 一个组件就是一个方法  且首字母是大写
function Comp(props) {
    //对象
    console.log('zi', props);
    const node = (
        <h2>i am h2</h2>
    )

    useEffect(() => {
        setTimeout(() => {
            props.onMessage(props.name)
        }, 3000);
    })
    return (
        <h2>
            component
            {node}
        </h2>
    )
}
export default Comp;