import './App.css';
import axios from 'axios';
import { useState } from 'react';

function App() {
  const [username, setUsername] = useState('');
  const [password, setPassword] = useState('');
  const getUserList = () => {
    axios.get("http://localhost:8080/test")
    .then(response => {
      setUsername(response.data.username)
      setPassword(response.data.password)
    }).catch(error => {
      console.log(error);
    })
  }
  return (
    <div className="App">
      <header className="App-header">
        <button onClick={getUserList}>Click!</button>
        <table>
          <thead>
            <tr>
              <th>username</th>
              <th>password</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td>{username}</td>
              <td>{password}</td>
            </tr>
          </tbody>
        </table>
      </header>
    </div>
  );
}

export default App;
