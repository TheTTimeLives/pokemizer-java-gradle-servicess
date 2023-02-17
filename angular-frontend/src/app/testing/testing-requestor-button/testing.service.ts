import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { catchError, retry } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class TestingService {

  constructor(private http: HttpClient) { }

  configUrl = ""

  getTesting() {
    return this.http.get(this.configUrl);
  }

  postTesting() {
    return this.http.post(this.configUrl, {});
  }

  putTesting() {
    return this.http.put(this.configUrl, {});
  }

  deleteTesting() {
    return this.http.delete(this.configUrl);
  }
}
