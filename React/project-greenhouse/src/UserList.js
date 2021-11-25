const UserList = ({users}) => {
  console.log(users)
    return(
      <div className="user-list">
        <table>
          <thead>
            <tr>
              <th>Username</th>
              <th>E-mail</th>
              <th>Profile Picture</th>
            </tr>
          </thead>
        <tbody>
          {users.map((user) => {
              return[
              <tr>
                <td><div className="username-coloum" key={user.login.username}>{user.login.username}</div></td>
                <td><div className="email-coloumn" key={user.login.username}>{user.email}</div></td>
                <td><div className="picture-coloumn" key={user.login.username}><img className="profile-photo" src= {user.picture.large} alt="pfp"></img></div></td>
              </tr>
            ];
          })}
        </tbody>
        </table>
        </div>
    )
}

export default UserList;

