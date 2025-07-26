import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HallFormComponent } from './hall-form.component';

describe('HallFormComponent', () => {
  let component: HallFormComponent;
  let fixture: ComponentFixture<HallFormComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [HallFormComponent]
    });
    fixture = TestBed.createComponent(HallFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
