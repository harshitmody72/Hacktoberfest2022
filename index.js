var express = require("express")
var bodyParser = require("body-parser")
var mongoose = require("mongoose")
const connect = require("./db")

const app = express()
const port = 5000
app.use(bodyParser.json())
connect()
app.get('/', (req, res) => {
    res.send('Hello World!')
  })
app.use('/', require('./route'))  
  app.listen(port, () => {
    console.log(`Example app listening on port ${port}`)
  })
  