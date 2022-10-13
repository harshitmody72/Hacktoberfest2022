const mongoose = require('mongoose')

const user = mongoose.Schema({
  Name: { type: String, trim: true, required: true },
  Email: { type: String, trim: true, required: true },
  Mobile: { type: String, trim: true, required: true },
  Password: { 
    type: String, 
    required: true  },

}, { timestamps: { createdAt: 'dCreatedAt', updatedAt: 'dUpdatedAt' } })

module.exports = mongoose.model('user', user)

