import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ConsumerDataComponentComponent } from './consumer-data-component.component';

describe('ConsumerDataComponentComponent', () => {
  let component: ConsumerDataComponentComponent;
  let fixture: ComponentFixture<ConsumerDataComponentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ConsumerDataComponentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ConsumerDataComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
