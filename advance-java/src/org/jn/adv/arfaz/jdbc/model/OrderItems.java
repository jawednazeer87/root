package org.jn.adv.arfaz.jdbc.model;

import java.io.Serializable;

//( order_id, product_id, quantity )
	//POJO - Plain Old Java Object
	public class OrderItems implements Serializable{

		private static final long serialVersionUID = -1443814004539007341L;
		
		private Integer order_id, product_id, quantity;
		/**
		 * @return the order_id
		 */

		public Integer getOrder_id() {
			return order_id;
		}
		
		/* * 
		 * @param order_id the assign order_id to set
		 */
				
		public void setOrder_id(Integer order_id) {
			this.order_id = order_id;
		}

		public Integer getProduct_id() {
			return product_id;
		}

		public void setProduct_id(Integer product_id) {
			this.product_id = product_id;
		}

		public Integer getQuantity() {
			return quantity;
		}

		public void setQuantity(Integer quantity) {
			this.quantity = quantity;
		}

		@Override
		public String toString() {
			return "OrderItems [order_id=" + order_id + ", product_id=" + product_id + ", quantity=" + quantity + "]";
		}
		
		
	

	
		
			
		
	}