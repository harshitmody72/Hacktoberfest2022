const express=require('express');
const app=express();
const server=require('http').createServer(app);
const io=require('socket.io')(server,{
    cors:{origin:"*"}
})
app.set('view engine','ejs')
app.get('./home',(req,res)=>{
    res.render('home')
})
server.listen(3000,()=>{
    console.log('Server is started');
})
 
