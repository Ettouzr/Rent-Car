import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { UserService } from '../Services/User.service';
import { User } from './User';

@Component({
  selector: 'app-accueil',
  templateUrl: './accueil.component.html',
  styleUrls: ['./accueil.component.css']
})
export class AccueilComponent implements OnInit {
  user: User = new User();
  constructor(private route: ActivatedRoute, private router: Router, private authService: UserService) { }

  ngOnInit(): void {

  }



  doSignin() {

    if (this.user.login !== '' && this.user.password !== null && this.user.password !== '') {

      this.authService.signin(this.user).subscribe((result) => {
        console.log(result.login);
        if (result) {
          sessionStorage.setItem('login', result.login);
          sessionStorage.setItem('password', result.password);
          this.router.navigate(['voiture']);
        }
      });
    }

  }
}
