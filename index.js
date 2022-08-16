const express = require('express')
const app = express()
const port = 5000;
require('dotenv').config();


app.get('/api', (req, res) => {
    res.send('Hello From API')
})

app.listen(port, () => {
    console.log(`App listening on port ${port}`)
})