import './App.css';
import FetchData from './FetchData';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import { Header, Footer } from './components/common'

function App() {
  return (
    <Router>
    <div className="App">
      <Header />
      <Switch>
        <Route path="/">
          <FetchData />
        </Route>
      </Switch>
      <Footer />
    </div>
    </Router>
  );
}

export default App;
