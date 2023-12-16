import { Component } from '@angular/core';
import { ViewdataService } from '../viewdata.service';
@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {

  data:any
  coffee={
    "coffeeId":0,
    "coffeeName":"",
    "price":0,
    "noOfDays":0
  }
   constructor(private viewdata:ViewdataService)
   {}
ngOnInit()
 {
this.viewdata.getdata().subscribe((e)=>{
 this.data=e;
  
})
 }

editcoffee(d:any)
{
   this.coffee=d
}

  searchcoffee(value:any)
   {
    console.log(value)
   this.data.filter((e:any)=>{
    return  e.coffeeName.search(value)>0
    })
   }
}
