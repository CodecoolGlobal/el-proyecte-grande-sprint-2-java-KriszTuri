import {useState} from 'react'
import axios from 'axios'
import Button from './common/Button'

function PostForm(props) {
    const url = props.url
    const [data, setData] = useState({
        username: "",
        email: "",
        password: ""
    })
    function handle(e){
        const newdata={...data}
        newdata[e.target.id] = e.target.value
        setData(newdata)
    }
    function submit(e){
        e.preventDefault();
        try {
            axios.post(url, {
                username: data.username,
                email: data.email,
                password: data.password
            })
            .then(resp=>{
                console.log(resp.data)
            })
        } catch (error) {
            console.log(error)
        }
    }
    return (
        <div>
            <form onSubmit={(e)=>submit(e)}>
                <div><input onChange={(e)=>handle(e)} id="username" value={data.username} placeholder="username" type="text" required></input></div>
                <div><input onChange={(e)=>handle(e)} id="email" value={data.email} placeholder="email" type="email" required></input></div>
                <div><input onChange={(e)=>handle(e)} id="password" value={data.password} placeholder="password" type="password" required></input></div>
                <div><Button text={props.buttonText}/></div>
            </form>
        </div>
    )
}

export default PostForm
