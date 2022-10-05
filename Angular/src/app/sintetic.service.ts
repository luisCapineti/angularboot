import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import { Sinteticoobj } from './sinteticoobj';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class SinteticService {
  private apiServerUrl = environment.apiBaseUrl;
  
  constructor(private http: HttpClient) { 
    
  }

  public getSiteticObj(): Observable<any>{
    return this.http.get<Sinteticoobj[]>(`${this.apiServerUrl}/objsint/all`);
  }

  public addSiteticObj(sinteticoobj : Sinteticoobj): Observable<any>{
    return this.http.post<Sinteticoobj>(`${this.apiServerUrl}/objsint/add`,sinteticoobj);
  }

  public updateSiteticObj(sinteticoobj : Sinteticoobj): Observable<any>{
    return this.http.put<Sinteticoobj>(`${this.apiServerUrl}/objsint/update`,sinteticoobj);
  }

  public deleteSiteticObj(objid : number): Observable<any>{
    return this.http.delete<Sinteticoobj>(`${this.apiServerUrl}/objsint/delete${objid}`);
  }
}
