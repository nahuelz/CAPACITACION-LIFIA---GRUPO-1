import { TestBed, inject } from '@angular/core/testing';

import { DataJsonService } from './data-json.service';

describe('DataJsonService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [DataJsonService]
    });
  });

  it('should be created', inject([DataJsonService], (service: DataJsonService) => {
    expect(service).toBeTruthy();
  }));
});
