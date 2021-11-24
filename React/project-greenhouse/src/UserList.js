const UserList = ({users}) => {
    return(
      <div className="user-list">
        <table>
          <thead>
            <tr>
              <th>UID</th>
              <th>Username</th>
              <th>Email</th>
            </tr>
          </thead>
        <tbody>
          {users.map((user) => {
            return[
              <tr>
                <td><div className="UID-coloumn" key={user.id}>{user.id}</div></td>
                <td><div className="username-coloumn" key={user.id}>{user.username}</div></td>
                <td><div className="email-coloumn" key={user.id}>{user.email}</div></td>
              </tr>
            ];
          })}
        </tbody>
        </table>
        </div>
    )
}

export default UserList;

