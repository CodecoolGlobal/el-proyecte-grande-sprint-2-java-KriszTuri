import './App.css';
import FetchData from './FetchData';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import { Header, Footer } from './components/common'
import Home from './pages/Home';

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
          <FetchData />
        </Route>
      </Switch>
      <Footer />
    </div>
    </Router>
  );
}

export default App;
