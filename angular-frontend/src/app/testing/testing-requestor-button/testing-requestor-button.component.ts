import { Component } from '@angular/core';
import { TestingService } from './testing.service';

@Component({
  selector: 'testing-requestor-button',
  templateUrl: './testing-requestor-button.component.html',
  styleUrls: ['./testing-requestor-button.component.less']
})
export class TestingRequestorButtonComponent {

  getTester() {
    console.log("Hello from the tester button")
  }

}
