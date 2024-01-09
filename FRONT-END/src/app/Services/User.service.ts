import { HttpClientModule, HttpClient } from '@angular/common/http';
import { Injectable } from "@angular/core";
import { map, Observable } from "rxjs";
import { User } from '../accueil/User';
@Injectable({
    providedIn: 'root'
})

export class UserService {




    constructor(private httpClient: HttpClient) {

    }
    signin(user: User): Observable<any> {
        return this.httpClient.post<any>("http://localhost:8084/User/login", user).pipe(map((resp: any) => {
            return resp;
        }));
    }
}