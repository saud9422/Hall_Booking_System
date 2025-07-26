import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DeleteHallComponent } from './delete-hall.component';

describe('DeleteHallComponent', () => {
  let component: DeleteHallComponent;
  let fixture: ComponentFixture<DeleteHallComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [DeleteHallComponent]
    });
    fixture = TestBed.createComponent(DeleteHallComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
