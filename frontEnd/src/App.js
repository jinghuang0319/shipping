import React, { Component } from "react";
import { BrowserRouter, Route,Switch,HashRouter} from "react-router-dom";
import Detail from "./components/Detail";
import Found from "./components/Found";



class App extends Component {

  render() {

    return (
         <HashRouter>
            <Switch >
		   
        <Route exact path="/listboxes" component={ Detail }/>
       
        <Route exact path="/addbox" component={ Found } />
	         </Switch>
           </HashRouter>
    );
  }
}

export default App;
