const express = require('express')
var router = express.Router();
  
router.get('/' , function(res, req){
    req.send('hello world')
})
router.get('/add' , function(res, req){
    req.send('hello add')
})
module.exports = router
