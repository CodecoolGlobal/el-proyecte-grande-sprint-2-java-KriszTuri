import './App.css';
import FetchRandomUsers from './FetchRandomUsers';
import Form from './components/Form';

import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import { Header, Footer } from './components/common'
import Home from './Home';

function App() {
  return (
    <Router>
    <div className="App">
      <Header />
      <Switch>
        <Route exact path="/">
          <Home />
        </Route>

        <Route path="/users">
          <FetchRandomUsers/>
        </Route>

        <Route path="/signup">
          <Form buttonText={"Sign Up!"} url={"http://localhost:8080/register"}/>
        </Route>
        <Route path="/login">
          <Form buttonText={"Log In!"} url={"http://localhost:8080/register"}/>
        </Route>
      </Switch>
      <Footer />
    </div>
    </Router>
  );
}

export default App;
