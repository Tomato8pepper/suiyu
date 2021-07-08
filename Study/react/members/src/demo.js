// import React from "react";
// import "./demo.css";

// export const MyComponent = () => {

//     const [myName, setMyName] = React.useState('John Doe');
//     return (
//         <div>
//             <h2 className="title">{myName}</h2>
//             <input value={myName}  onChange={ (e)  =>setMyName(e.target.value) } />
//         </div>)
// }




import React from "react";
import './demo.css';




export const MyComponent = () => {
    const [userName, setUsername] = React.useState();
    const [list, setList] = React.useState([]);
    //onload
    React.useEffect(() => {
        // setTimeout(() => {
        //     setUsername('John')
        // }, 1500)
        fetch('http://localhost:3000/toplist/detail').then(data => data.json()).then(data => {
            console.log(data)
            setList(data.list)
            // console.log(list)
        })
    }, [])
    return (
        <div>
            <h4 className="title">{userName}</h4>
            <input value={userName} onChange={(e) => setUsername(e.target.value)} />
            <ul>
            {
                list.map(item => <li>{item.description}</li>)
            }
            </ul>
        </div>
    )
}