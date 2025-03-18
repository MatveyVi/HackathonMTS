require('dotenv').config();
const express = require('express');
const cors = require('cors');
const cookieParser = require('cookie-parser');
const mongoose = require('mongoose');
const router = require('./router/index');
const errorMiddleware = require('./middlewares/error-middleware')

const PORT = process.env.PORT || 5000;
const app = express();

app.use(cors());
app.use(express.json());
app.use(cookieParser());
app.use('/api', router)
app.use(errorMiddleware)

mongoose
    .connect(process.env.DB_URL)
    .then(() => console.log("Db OK"))
    .catch((err) => console.log("DB error", err))

const start = async () => {
    try {
        app.listen(PORT, () => console.log(`Сервер стартовал на порте:  ${PORT}`));
    } catch (e) {
        console.log(e);
    }
}
start();