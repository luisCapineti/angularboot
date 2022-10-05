import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { SinteticService } from './sintetic.service';
import { Sinteticoobj } from './sinteticoobj';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  public objSinteticos: Sinteticoobj[] = [];

  constructor(private sinteticService:SinteticService){}

  ngOnInit() {
    this.getSintecticObj();
  }

  public getSintecticObj(): void{
    this.sinteticService.getSiteticObj().subscribe(
      (response:Sinteticoobj[]) =>{
        this.objSinteticos = response
      },
      (error: HttpErrorResponse)=>{
        alert(error.message);
      }
    )
  }
}
