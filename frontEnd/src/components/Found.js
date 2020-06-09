import React, { Component } from "react";
import './shipping.less';




class App extends Component {

  constructor(propos) {
    super(propos);
    this.state = {
      measure: []
    };
    this.addStuff = this.addStuff.bind(this);
    }



    
  addStuff ()  {
          if(document.getElementById("name_input").value==""){
            alert("Name can not be empty!"); 
          }else if(document.getElementById("logo_input").value==""){
            alert("Weight can not be empty!"); 
          }else{

          var a =  document.getElementById("name_input").value;;
          var r = /^\+?[1-9][0-9]*$/;
          if(r.test(document.getElementById("logo_input").value)){
          var b = document.getElementById("logo_input").value;
            }else{
              var b = 0;
          }
          
          var c = document.getElementById("lengths_input").value;
          var e =c.substr(1);
         
          var d = document.getElementById("width_input").value;
          
          fetch("http://localhost:8081/item/InsertOrderServlet.do?boxname=" +a +"&countryid=" +d +"&boxWeight=" +b +"&boxcolour=" +e+ "")
          .then(function(response){

            return response.text().then(function(text){

             alert(text);
              
        
            });
      
          })
          }
        }





  render() {
    return (

          <div>
            <div className='font' >
            Name:   
            </div>
            <div >
            <input type="text" id="name_input"  className='field' /> 
            
            </div>
            <div className='font'>
            Weigth:  
            </div>
            <div>
             <input type="text" id="logo_input"  className='field'/> 
            </div>
            <div className='font'>
            BoxColor: 
            </div>
            <input type="color" id="lengths_input" placeholder='click to show color picker'className='field'  defaultValue="#ffffff"  /> 
       
            <div className='font'>  
            Country: 
            </div>

            <div>
            <select value={this.state.value} onChange={this.handleChange} id="width_input" className='field'>
                                <option value="1">Sweden</option>
                                <option value="2">China</option>
                                <option value="3">Brazil</option>
                                <option value="4">Australia</option>
             </select>
                       
                        <div>{this.state.value}</div>
                       
              </div> 
            
            <div >
            <button className='button' onClick={this.addStuff} >Save</button>
            </div>
            </div>

    );
  }
}

export default App;
