import React, { Component } from "react";
import './shipping.css';


class App extends Component {

  constructor(propos) {
    super(propos);
    this.state = {
      measure: []
    };

    this.getMeasurement = this.getMeasurement.bind(this);
    //this.componentDidMount = this.componentDidMount.bind(this);
    
  }

  componentDidMount ()  {
    this.getMeasurement();
    this.interval = setInterval(() => {
      this.getMeasurement();
    }, 600);
    
  }



  getMeasurement ()  {
    fetch("http://localhost:8081/item/ShowOrderServlet.do")
      .then(response => response.json())
      .then(response => this.setState({ measure: response.data }))
      .catch(err => console.error(err));

  }





  render() {
    return (

      <div  >
        
        <table border="1" cellSpacing="0" >
          <thead>
       
            <tr >
 
              <th>Receiver</th>
              <th>Weigth</th>
              <th>Box Color</th>
              <th>ShoppingCost</th>

            </tr>
          </thead>
          <tbody>
            {this.state.measure.map(lostandfound => (

              <tr >
                 
                <td>{lostandfound.boxName} </td>
                <td>{lostandfound.boxWeight}    kilograms </td>
                <td bgcolor={lostandfound.boxColour}> </td>
                <td>{lostandfound.sumcost} SEK</td>

              </tr>
            ))}
          </tbody>
        </table>
      </div>
     
    );
  }
}



export default App;
