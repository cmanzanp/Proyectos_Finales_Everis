import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ProductService } from '../../services/product/product.service';

@Component({
  selector: 'app-product-form',
  templateUrl: './product-form.component.html',
  styleUrls: ['./product-form.component.css']
})
export class ProductFormComponent implements OnInit {

  id: string;
  form: FormGroup;

  constructor(private productService: ProductService, private formBuilder: FormBuilder) { }

  ngOnInit(): void {
    this.form = this.formBuilder.group({
      name: ['', Validators.required],
      category: ['', Validators.required],
      description: [''],
      price: ['', Validators.required],
      img: ['']
    });
  }

  getProduct(): void {
    this.productService.getProduct(this.id);
  }

  addProduct(): void {
    this.productService.addProduct(this.form.value);
  }

}
