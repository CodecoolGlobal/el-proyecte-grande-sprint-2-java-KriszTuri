import { useState } from 'react';
import { useEffect } from 'react';
import axios from 'axios';


function FetchRandomUsers(){
const [users, setUsers] = useState(null);
  useEffect(() => {
    axios.get("https://random-data-api.com/api/users/random_user")
    .then(response => {
      /*let userArray=[];
      for(let i=0; i<5; i++){
        const newUser = {
          userId: i,
          username: response.data[i].username,
          email: response.data[i].email,
          password: response.data[i].password
        }*/
        //userArray.push(JSON.stringify(newUser));
        const newUser = {
          userId: "1",
          username: response.data.username,
          email: response.data.email,
          password: response.data.password
        }
        let Json = JSON.stringify(newUser)
        setUsers(Json)
        let axiosConfig = {
          headers: {
              'Content-Type': 'application/json;charset=UTF-8',
              "Access-Control-Allow-Origin": "*",
          }
        };
        axios.post('localhost:8080/users/fetched', users, axiosConfig);
    })
  }, [])
  console.log(users)
  return (
    <div>
      
    </div>
  );
}
export default FetchRandomUsers;