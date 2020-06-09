import React from "react";
import {shallow} from "enzyme";
import {ppp} from './Detail';
import {fff} from './Found';
import {configure} from 'enzyme';
import Adapter from 'enzyme-adapter-react-16';


configure({adapter: new Adapter()});

it ('should render on the webpage', () =>{
    
    const wrapper = shallow(<ppp />);
    const span =wrapper.find("span");
    const result = span.text;
  
    expect(result).toBe(result);
});
