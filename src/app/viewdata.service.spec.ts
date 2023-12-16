import { TestBed } from '@angular/core/testing';

import { ViewdataService } from './viewdata.service';

describe('ViewdataService', () => {
  let service: ViewdataService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ViewdataService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
