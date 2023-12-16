import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class ViewdataService {
    base_url:string="http://localhost:9099"
     GETALL="/getall"
     SEND_DATA="/addcoffee"
     
  constructor(private http:HttpClient) { }

getdata()
{
  return this.http.get(this.base_url+this.GETALL)
}
send_info(data:any)
{
   return this.http.post(this.base_url+this.SEND_DATA,data);
}

}
