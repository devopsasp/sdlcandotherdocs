import http from 'http'
import data from './datarepo.js'
import url from 'url'



const server=http.createServer((req,res)=>{


    if(req.method=="GET" && req.url=="/allitems")
     { 
        res.write(JSON.stringify(data.data))
        res.end()
     }
     else if(req.method=="POST" && req.url=="/saveitem")
      { 
        req.on("data",(d)=>{
        let itemdata=JSON.parse(d)
            data.data.push(itemdata)
        })
        res.write("data saved")
        res.end()
      }
    else if(req.method=="PATCH" && req.url=="/updateitem") 
    {
        req.on("data",(d)=>{
            let oldlist=data.data
          let itemdata=JSON.parse(d)
        let itemlist1=  oldlist.filter((e)=>e.itemname!=itemdata.itemname) 
          data.data=[...itemlist1,itemdata]

        })
        res.write("list updated")
        res.end()
    }
   
    else if(req.method=="DELETE" && req.url=="/deleteitem")
     {
        req.on("data",(d)=>{
            let oldlist=data.data
          let itemdata=JSON.parse(d)
        let itemlist1=  oldlist.filter((e)=>e.itemname!=itemdata.itemname) 
          data.data=[...itemlist1]

        })
        res.write("list updated")
        res.end()
     }
     else if(req.method=="PUT" && req.url=="/updateitem")
      { 
        res.end()
      }
})


server.listen(5050,()=>{
  
    console.log("server started")
})