import './App.css';
import FetchRandomUsers from './FetchRandomUsers';

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
      </Switch>
      <Footer />
    </div>
    </Router>
  );
}

export default App;
