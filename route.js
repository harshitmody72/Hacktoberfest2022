const express = require('express')
const User = require('./model/User')
var router = express.Router();
  
router.get('/' , function(res, req){
    req.send('hello world')
})
router.get('/add' , function(res, req){
    req.send('hello add')
})
router.post('/signup',async function(req,res) {
    const { Name, Email,Mobile, Password} = req.body 
    try {
       if(!Name) return res.json({code: 404, message: "name is required"})
       if(!Email) return res.json({code: 404, message: "Email is required"})
       if(!Mobile) return res.json({code: 404, message: "Mobile number is required"})
       if(!Password) return res.json({code: 404, message: "Password is required"})

       const userExists = await User.findOne({ Email })
       if(userExists){
           return res.json({message: "User Already Exists with this email id"})
       }
       const mobileNo = await User.findOne({ Mobile })
       if(mobileNo){
        return res.json({message: "User Already Exists with this mobile No id"})
       }
       const user =  await User.create(req.body)
       return res.json({message:"user created", data: user})
    } catch (error) {
        return res.json(error.message)
    }
   })

module.exports = router