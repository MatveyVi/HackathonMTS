const {Schema, model} = require('mongoose');

const CameraSchema = new Schema({
    CameraName: {type: String, required: true},
    Quantity: {type: Number},
})

module.exports = model('Camera', CameraSchema);