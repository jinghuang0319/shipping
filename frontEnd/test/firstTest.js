
require("@babel/register");
require('ignore-styles');
var request = require("request");
var assert = require('chai').assert;
var first = require('../first');
var second = require("../src/components/second");
var detail = require("../src/components/Detail");
var baseUrl = "http://localhost:8081/item/ShowOrderServlet.do";
var fundUrl ="http://localhost:8081/item/InsertOrderServlet.do?boxname=mybox&countryid=1&boxWeight=22&boxcolour=%28ffff";
var expect =require("chai").expect;


describe('First', function() {

    it('first should return hello mocha', function(){
        assert.equal(first(),'hello mocha');
    });
});



describe('Second', function() {

    it('second should rturn this is the secong', function(){
        
        assert.equal(second(),'this is the second');

    });
});




describe('Third', function() {
    
    it('expect select function', function(done){

        request.get({url:baseUrl},
            function(error,response,body){
               expect(response.statusCode).to.equal(200);
               console.log(body); 
               done(); 
            });
      });
});



describe('Fourth', function() {
    
    it('expect add function', function(done){

        request.get({url:fundUrl},
            function(error,response,body){
                console.log(body); 
                expect(response.statusCode).to.equal(200);
                done(); 
            });
      });
});








