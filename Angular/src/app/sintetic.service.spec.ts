import { TestBed } from '@angular/core/testing';

import { SinteticService } from './sintetic.service';

describe('SinteticService', () => {
  let service: SinteticService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(SinteticService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
