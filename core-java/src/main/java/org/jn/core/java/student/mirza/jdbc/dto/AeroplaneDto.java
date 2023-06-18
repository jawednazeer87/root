package org.jn.core.java.student.mirza.jdbc.dto;

public class AeroplaneDto {
	
	

	
		private int id;
		private String name;
		private int capacity;
		private String companyName;
		private String modelName;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getCapacity() {
			return capacity;
		}

		public void setCapacity(int capacity) {
			this.capacity = capacity;
		}

		public String getCompanyName() {
			return companyName;
		}

		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}

		public String getModelName() {
			return modelName;
		}

		public void setModelName(String modelName) {
			this.modelName = modelName;
		}

		public String toString() {
			return " {id=" + id + ", name=" + name + ", capacity=" + capacity + ", companyName=" + companyName
					+ ", modelName=" + modelName + "}";
		}


			// TODO Auto-generated method stub
			
		

	}



