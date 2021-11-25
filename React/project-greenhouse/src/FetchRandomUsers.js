import { useState } from 'react';
import { useEffect } from 'react';
import UserList from './UserList';


function FetchRandomUsers(){
const [users, setUsers] = useState(null);

  useEffect(() => {
    fetch("https://api.randomuser.me/?results=5")
    .then(response => {
      return response.json()
    })
    .then(data => {
      setUsers(data.results)
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
export default FetchRandomUsers;