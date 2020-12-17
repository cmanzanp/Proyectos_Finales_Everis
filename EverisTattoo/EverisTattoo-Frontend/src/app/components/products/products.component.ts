import { Component, OnInit } from '@angular/core';
import { ProductService } from 'src/app/services/product/product.service';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {

  constructor(private productService: ProductService) { }

  products: any[];

  ngOnInit(): void {
    this.productService.getAllProducts()
      .subscribe(
        res => {this.products = res},
        error => {console.log(error)}
      );
  }

  deleteProduct(id: string) {
    this.productService.deleteProduct(id);
  }

}
