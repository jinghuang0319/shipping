const express=require('express');
const cors=require('cors');
const mysql=require('mysql');

const app=express();

const selectAll01 = 'select * from shipping order by id';
const connection=mysql.createConnection({
    host:'localhost',
    user:'root',
    password:'1234',
    database:'huangjing'
});


connection.connect(err => {
    if(err){
        return err;ost
    }
});

app.use(cors());



app.get('/found',(req,res)=>{
connection.query(selectAll01,(err, results)=>{
    console.log(results);
    if(err){
        return res.send(err)
    }
    else{
        return res.json({
            data: results
           
        })
        
    }
})
})


app.get('/found/add',(req,res)=>{
const{name,logo,lengths,width}=req.query;
console.log(name,logo,lengths,width);
var a =1;


const INSERT_PRODUCTS_QUERY="INSERT INTO shipping (name,weight,boxcolor,country) VALUES ('"+name+"','"+logo+"','"+lengths+"','"+width+"')"

connection.query(INSERT_PRODUCTS_QUERY,(err,results)=>{
    if(err){
        return res.send(err)
    }else{
        return res.send('successfully added product')
       
    }
});
});


app.listen(5000,()=>{
    console.log('products server listening on 8080')
})