import { useState } from 'react';
import { useEffect } from 'react';
import UserList from './UserList';


function FetchData(){
const [users, setUsers] = useState(null);

  useEffect(() => {
    fetch("http://localhost:8080/test")
    .then(response => {
      return response.json()
    })
    .then(data => {
      setUsers(data)
    })
  }, [])

  return (
    <div className="App">
      <header className="App-header">
        {users && <UserList users={users}/>}
      </header>
    </div>
  );
}
export default FetchData;