import { Component } from '@angular/core';
import { Router } from '@angular/router';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'coffeeapp';
  isNotAuthenticated:boolean=true
  constructor(private router:Router)
  {  }
 
  gotohome()
  {
    this.isNotAuthenticated=!this.isNotAuthenticated
 //this.router.navigate(['/home'])
  }
}
