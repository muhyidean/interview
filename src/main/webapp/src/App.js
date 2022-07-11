
import { BrowserRouter } from 'react-router-dom';
import './App.css';
import Dashboard from './containers/Dashboard/Dashboard';

function App() {
  return (
    <div className="App">
    <BrowserRouter>
      <Dashboard/>
    </BrowserRouter>
  </div>
  );
}

export default App;
