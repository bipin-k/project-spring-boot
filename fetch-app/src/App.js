import logo from './logo.svg';
import './App.css';
import React, { useEffect, useState } from "react"

function App() {

  const [users, setUsers] = useState([])

  const fetchUserData = () => {
    fetch("http://localhost:8080/status")
      .then(response => {
        return response.json()
      })
      .then(data => {
        setUsers(data)
      })
  }

  useEffect(() => {
    fetchUserData()
  }, [])

  return (
    <div className="App">
      {users.length > 0 && (
        <ul>
          {users.map(user => (
            <li key={user.id}>{user.name}</li>
          ))}
        </ul>
      )}
    </div>
  );
}

export default App;
